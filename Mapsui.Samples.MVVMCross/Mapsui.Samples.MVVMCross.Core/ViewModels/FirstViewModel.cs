using System.Collections.Generic;
using System.Threading.Tasks;
using System.Windows.Input;
using Mapsui.Samples.MVVMCross.Core.Factory;
using Mapsui.Samples.MVVMCross.Core.Models;
using MvvmCross.Core.Navigation;
using MvvmCross.Core.ViewModels;
using Newtonsoft.Json;
using Plugin.Settings;

namespace Mapsui.Samples.MVVMCross.Core.ViewModels
{
    public class FirstViewModel : MvxViewModel
    {
        private readonly IMvxNavigationService _navigationService;
        public PedestrianItinerary pedestrianItinerary { get; set; }
        public FirstViewModel(IMvxNavigationService navigationService)
        {
            _navigationService = navigationService;
        }

        public ICommand NavigateToMapsPageCommand => new MvxAsyncCommand(NavigateToMapsView);
        public async Task NavigateToMapsView()
        {
            pedestrianItinerary = PedestrianFactory.CreateModelItinerary();
            Models.Map _map= new Models.Map
            {
                OriginPointLatitude = pedestrianItinerary.OriginPoint.Latitude,
                OriginPointLongitude = pedestrianItinerary.OriginPoint.Longitude,
                DestinationPointLatitude = pedestrianItinerary.DestinationPoint.Latitude,
                DestinationPointLongitude = pedestrianItinerary.DestinationPoint.Longitude,
            };
            var mapJson = JsonConvert.SerializeObject(_map);
            CrossSettings.Current.AddOrUpdateValue("MapData", mapJson);
           /// await _navigationService.Close(this);
            
            bool Result = await _navigationService.Navigate<MapViewModel, List<WktPath>, bool>(pedestrianItinerary
                                    .PathToDestinationPoint);
            await _navigationService.Navigate<MapViewModel>();
        }
    }
}
