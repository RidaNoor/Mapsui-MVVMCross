using Mapsui.Samples.MVVMCross.Core.Models;
using Mapsui.Samples.MVVMCross.Core.ViewModels.Base;
using Acr.UserDialogs;
using Mapsui.Layers;
using MvvmCross.Core.Navigation;
using Newtonsoft.Json;
using Plugin.Geolocator;
using Plugin.Geolocator.Abstractions;
using Shorthand.Geodesy;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Mapsui.Samples.MVVMCross.Core.Interfaces;
using Mapsui.Samples.MVVMCross.Core.Helpers;
using Mapsui.UI.Forms;
using Point = Mapsui.Geometries.Point;
using System.Diagnostics;
using Mapsui.Samples.MVVMCross.Core.StringLiterals;
using Plugin.Settings;

namespace Mapsui.Samples.MVVMCross.Core.ViewModels
{
    public class MapViewModel : BaseViewModel<List<WktPath>, bool>
    {
        private ILayer _stringLayer;
        private Point _centroid;
        private int _resolution;
        private Plugin.Geolocator.Abstractions.Position _currentLocation;
        private Map _map;
        private MapView _mapView;
        private WritableLayer currentLayer;
        private WritableLayer destinationPointLayer;
        private readonly IUserDialogs _userDialogs;
        private readonly IMapService mapService;
        private readonly IMvxNavigationService _navigationService;
        public List<WktPath> Route { get; set; }
        public string StageTitle => "Walk";
        public string PointName { get; set; }
        public string PointAddress { get; set; }
        public string RouteId { get; set; }
        public string SegmentId { get; set; }
        public int Result { get; set; }
        public string _mapPageTitle;
        public string MapPageTitle
        {
            get => _mapPageTitle;
            set => SetProperty(ref _mapPageTitle, value);
        }
        public ILayer StringLayer
        {
            get => _stringLayer;
            set => SetProperty(ref _stringLayer, value);
        }

        public Point Centroid
        {
            get => _centroid;
            set => SetProperty(ref _centroid, value);
        }

        public int Resolution
        {
            get => _resolution;
            set => SetProperty(ref _resolution, value);
        }

        public Plugin.Geolocator.Abstractions.Position CurrentLocation
        {
            get => _currentLocation;
            set => SetProperty(ref _currentLocation, value);
        }

        public Map Map
        {
            get => _map;
            set => SetProperty(ref _map, value);
        }

        public MapView MapView
        {
            get => _mapView;
            set => SetProperty(ref _mapView, value);
        }

        public override void Prepare(List<WktPath> parameter)
        {
            base.Prepare();
            Route = parameter;
            SegmentId = parameter.First().SegmentId;
        }
        public MapViewModel(IUserDialogs userDialogs, IMapService mapService, IMvxNavigationService navigationService)
        {
            _userDialogs = userDialogs;
            this.mapService = mapService;
            _navigationService = navigationService;
            MapPageTitle = UIStrings.MapPageTitle;
        }

        public double destinationPointLatitude { get; set; }
        public double destinationPointLongitude { get; set; }
        public override async Task Initialize()
        {
            var _map = CrossSettings.Current.GetValueOrDefault("MapData", string.Empty);
            Models.Map map = JsonConvert.DeserializeObject<Models.Map>(_map);

            destinationPointLatitude = map.DestinationPointLatitude;
            destinationPointLongitude = map.DestinationPointLongitude;

            Map = mapService.GetMap();

            var OrignPoint = new Point { X = map.OriginPointLongitude, Y = map.OriginPointLatitude };
            var DestinationPoint = new Point { X = map.DestinationPointLongitude, Y = map.DestinationPointLatitude };
            
            StringLayer = Route.DrawLineFrom(OrignPoint);
            Centroid = Maps.CentroidFromPoints(Route);
            Resolution = Maps.ResolutionFromPoints(Route, Centroid);
            // This to prevent NullExceptionPointer when the View first start loaded
            CurrentLocation = await CrossGeolocator.Current.GetLastKnownLocationAsync();
            currentLayer = (CurrentLocation != null) ? Helpers.Layers.CreateCurrentPointLayer(CurrentLocation) : new WritableLayer();
            destinationPointLayer =Helpers.Layers.CreateMeetingPointLayer(DestinationPoint);
            Debug.WriteLine(currentLayer);
            // Once it got first Location, it start listening for changes.
            await StartLocationListening();

            mapService.AddLayer(StringLayer);
            mapService.AddLayer(currentLayer);
            mapService.AddLayer(destinationPointLayer);
        }

        private async Task StartLocationListening()
        {
            if (!CrossGeolocator.Current.IsListening)
                await CrossGeolocator.Current.StartListeningAsync(TimeSpan.FromSeconds(2), 10, true);

            CrossGeolocator.Current.PositionChanged += Current_PositionChanged;
            CrossGeolocator.Current.PositionError += Current_PositionError;
        }

        public override async void ViewDisappearing()
        {
            base.ViewDisappearing();
            await StopLocationListening();
        }
        private async void Current_PositionChanged(object sender, PositionEventArgs e)
        {
            currentLayer.Clear();
            currentLayer.Add(Helpers.Layers.CreateCurrentPoint(e.Position));
            currentLayer.DataHasChanged();

            var coordinate1 = new GeodeticCoordinate { Latitude = e.Position.Latitude, Longitude = e.Position.Longitude };
            var coordinate2 = new GeodeticCoordinate { Latitude = Route.LastOrDefault().SegmentWkt.GetLastPoint().Y, Longitude = Route.LastOrDefault().SegmentWkt.GetLastPoint().X };

            // Calculate the distance between the coordinates using the haversine formula
            double distance = DistanceCalculator.Haversine(coordinate1, coordinate2);

            if (distance < 0.010)
            {
                await StopLocationListening();
                await _userDialogs.AlertAsync("You have arrived at your desired destination", string.Empty, "OK");
                ClearMapLayers();
                await _navigationService.Close(this, true);
            }
        }

        private async Task StopLocationListening()
        {
            if (CrossGeolocator.Current.IsListening) await CrossGeolocator.Current.StopListeningAsync();

            CrossGeolocator.Current.PositionChanged -= Current_PositionChanged;
            CrossGeolocator.Current.PositionError -= Current_PositionError;
        }

        public void ClearMapLayers()
        {
            mapService.ClearLayers();
        }
        private void Current_PositionError(object sender, PositionErrorEventArgs e)
        {
            throw new NotImplementedException();
        }

    }
}
