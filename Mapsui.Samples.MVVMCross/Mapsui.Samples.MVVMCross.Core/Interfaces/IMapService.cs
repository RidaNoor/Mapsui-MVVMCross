using Mapsui;
using Mapsui.Geometries;
using Mapsui.Layers;
using Plugin.Geolocator.Abstractions;

namespace Mapsui.Samples.MVVMCross.Core.Interfaces
{
    public interface IMapService
    {
        Map GetMap();
        void AddLayer(ILayer layer);
        void NavigateFromPosition(Position position);
        void NavigateFromPosition(Position position, int res);
        void NavigateFromPosition(Point point);
        void NavigateFromPosition(Point point, int res);
        void ClearLayers();
    }
}
