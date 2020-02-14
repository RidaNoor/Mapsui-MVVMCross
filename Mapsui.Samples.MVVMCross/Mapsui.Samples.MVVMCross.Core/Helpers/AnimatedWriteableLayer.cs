using Mapsui.Fetcher;
using Mapsui.Geometries;
using Mapsui.Layers;
using Mapsui.Projection;
using Mapsui.Providers;
using Mapsui.Styles;
using Plugin.Geolocator.Abstractions;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Mapsui.Samples.MVVMCross.Core.Helpers
{
    public class AnimatedWriteableLayer : AnimatedPointLayer
    {
        private readonly Timer _timer;

        public AnimatedWriteableLayer() : base(new CurrentMemoryProvider())
        {
            Name = "Current Location";
            Style = new SymbolStyle { Fill = { Color = new Color(255, 215, 0, 200) }, SymbolScale = 0.9 };
            _timer = new Timer(arg => UpdateData(), this, 0, 2000);
        }
    }
    public class CurrentMemoryProvider : MemoryProvider
    {
        private List<Point> _points = new List<Point>()
        {
            new Point(1.48893, 41.27945),
            new Point(1.48940, 41.27962),
            new Point(1.49001, 41.27999),
            new Point(1.4908754,  41.2788097),
        };

        private Point _current;

        public void AddPoint(Point point)
        {
            _points.Add(point);
        }

        public void AddPoint(Position p)
        {
            AddPoint(new Point(p.Longitude, p.Latitude));
        }

        public override IEnumerable<IFeature> GetFeaturesInView(BoundingBox box, double resolution)
        {
            var p = GetNextPoint();
            var ll = SphericalMercator.ToLonLat(p.X, p.Y);

            var features = new List<IFeature>();
            var feature = new Feature
            {
                Geometry = p,
                ["ID"] = _points.IndexOf(p).ToString(),
                ["Longitude"] = ll.X,
                ["Latitude"] = ll.Y
            };

            features.Add(feature);
            return features;
        }

        private Point GetNextPoint()
        {
            if (null == _current)
                _current = _points.First();
            var index = _points.IndexOf(_current);
            if (index < _points.Count - 1)
                _current = _points.ElementAt(index + 1);
            return _current;
        }
    }
}
