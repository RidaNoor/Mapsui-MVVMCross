using BruTile.Predefined;
using Mapsui;
using Mapsui.Geometries;
using Mapsui.Layers;
using Mapsui.Projection;
using Mapsui.UI.Forms;
using Mapsui.Utilities;
using Plugin.Geolocator.Abstractions;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Text;
using Mapsui.Samples.MVVMCross.Core.Interfaces;
using Mapsui.Fetcher;
using BruTile.Web;
using BruTile;

namespace Mapsui.Samples.MVVMCross.Core.Services
{
    public class MapService : IMapService
    {
        readonly Map Map;
        public MapView MapView { get; set; }
        public ILayer Ilayer { get; set; }
        public MapService(ILayer layer = null)
        {
            Map = new Map
            {
                CRS = "EPSG:3857",
                Transformation = new MinimalTransformation()
            };

            var openCycleMapSource = new HttpTileSource(new GlobalSphericalMercator(0, 20),
                        "https://tile.thunderforest.com/cycle/{z}/{x}/{y}.png?apikey=531466ad51af44efbd5993bf7b87fc11",
                        new[] { "a", "b", "c" }, name: "OpenCycleMap",
                        attribution: new Attribution("© OpenStreetMap contributors", "https://www.openstreetmap.org/copyright"));

            var bingSource = new HttpTileSource(new GlobalSphericalMercator(1),
                        "http://t{s}.tiles.virtualearth.net/tiles/a{quadkey}.jpeg?g=517&token={k}",
                        new[] { "0", "1", "2", "3", "4", "5", "6", "7" }, null, "Bing Map",
                        attribution: new Attribution("© Microsoft"));
            layer = layer ?? new TileLayer(openCycleMapSource);
            Ilayer = layer;
        }

        public Map GetMap()
        {
            Map.Layers.Add(Ilayer);
            return Map;
        }
        public void AddLayer(ILayer layer)
        {
            Map.Layers.Add(layer);
        }

        public void ClearLayers()
        {
            Map.Layers.Clear();
        }
        /// <summary>
        ///  As OSM uses spherical mercator coordinates, It will transform the lon lat 
        ///  coordinates to spherical mercator and navigate to that coordinate
        /// </summary>
        /// <param name="position"></param>
        /// <param name="res"></param>
        public void NavigateFromPosition(Plugin.Geolocator.Abstractions.Position position, int res)
        {
            MapView.Navigator.NavigateTo(SphericalMercator.FromLonLat(position.Longitude, position.Latitude), Map.Resolutions[res]);
        }
        public void NavigateFromPosition(Point point, int res)
        {
            try
            {
                MapView.Navigator.NavigateTo(
                    SphericalMercator.FromLonLat(point.X, point.Y), Map.Resolutions[res]);
            }
            catch (Exception ex)
            {
                Debug.WriteLine(ex);
            }

        }

        public void NavigateFromPosition(Plugin.Geolocator.Abstractions.Position position)
        {
            MapView.Navigator.NavigateTo(
                SphericalMercator.FromLonLat(position.Longitude, position.Latitude), Map.Resolutions[10]);
        }

        public void NavigateFromPosition(Point point)
        {
            MapView.Navigator.NavigateTo(
                SphericalMercator.FromLonLat(point.X, point.Y), Map.Resolutions[10]);
        }
    }
}
