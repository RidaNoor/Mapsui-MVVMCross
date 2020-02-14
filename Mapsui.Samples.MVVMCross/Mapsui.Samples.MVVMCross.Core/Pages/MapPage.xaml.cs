using Mapsui.Layers;
using Mapsui.Projection;
using Mapsui.Samples.MVVMCross.Core.ViewModels;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;
using Point = Mapsui.Geometries.Point;
using Plugin.Geolocator.Abstractions;

namespace Mapsui.Samples.MVVMCross.Core.Pages
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class MapPage : ContentPage
    {
        public ILayer StringLayer { get; set; }
        public Point Centroid { get; set; }
        public int Resolution { get; set; }
        public Position CurrentLocation { get; set; }
        public Map Map { get; set; }
        public MapPage()
        {
            InitializeComponent();
        }

        protected override void OnAppearing()
        {
            var vm = BindingContext as MapViewModel;
            vm.MapView = mapView;

            this.StringLayer = vm.StringLayer;
            this.Resolution = vm.Resolution;
            this.CurrentLocation = vm.CurrentLocation;
            mapView.Map = vm.Map;

            mapView.Navigator.NavigateTo(SphericalMercator.FromLonLat(vm.destinationPointLongitude, vm.destinationPointLatitude), 1);
        }
    }
}