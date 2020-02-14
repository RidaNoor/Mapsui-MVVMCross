using Mapsui.Geometries;
using Mapsui.Layers;
using Mapsui.Projection;
using Mapsui.Providers;
using Mapsui.Styles;
using Mapsui.Utilities;
using Plugin.Geolocator.Abstractions;
using System.Collections.Generic;
using Mapsui.Geometries.WellKnownText;
using Mapsui.Samples.MVVMCross.Core.Models;
using System.Linq;
using System.Diagnostics;

namespace Mapsui.Samples.MVVMCross.Core.Helpers
{
    public static class Layers
    {
        public static ILayer CreateLineStringLayer(IList<Point> points, IStyle style = null)
        {
            var features = new Features();
            List<Point> vertices = new List<Point>();
            foreach (Point point in points)
            {
                var spherical = SphericalMercator.FromLonLat(point.X, point.Y);
                vertices.Add(new Point(spherical.X, spherical.Y));
            }

            var road = new Feature
            {
                Geometry = new LineString(vertices)
            };

            features.Add(road);
            return new MemoryLayer
            {
                DataSource = new MemoryProvider(features),
                Style = style
            };
        }

        public static ILayer CreateLineStringLayer(string wktpath, IStyle style = null)
        {
            var wktGeometry = (LineString)GeometryFromWKT.Parse(wktpath);
            return CreateLineStringLayer(wktGeometry.Vertices, CreateLineStringStyle());
        }

        public static ILayer DrawLineFrom(this List<WktPath> wktpaths, Point origin)
        {
            var features = new Features();
            var points = new List<Point>();
            var endPoint = origin;

            foreach (var wktpath in wktpaths.Select((value, index) => new { Value = value, Index = index }))
            {
                var wktline = Geometry.GeomFromText(wktpath.Value.SegmentWkt);

                var vertices = wktline.AllVertices();
                var first = Maps.CalculateDistance(endPoint, vertices.First());
                var last = Maps.CalculateDistance(endPoint, vertices.Last());
                if (first <= last)
                {
                    points.AddRange(vertices);
                    endPoint = vertices.Last();
                }
                else
                {
                    points.AddRange(vertices.Reverse());
                    endPoint = vertices.First();
                }
            }

            return CreateLineStringLayer(points, CreateLineStringStyle());
        }

        public static ILayer CreatePointLayer(IFeature feature)
        {
            return new MemoryLayer
            {
                DataSource = new MemoryProvider(feature),
                Style = null
            };
        }

        public static IStyle CreateLineStringStyle()
        {
            return new VectorStyle
            {
                Fill = null,
                Outline = null,
                Line =
                {
                Color = Color.Blue,
                Width = 3,
                PenStyle = PenStyle.Solid
                //new Pen(Color.Gray, 15) { PenStyle = PenStyle.Solid, PenStrokeCap = PenStrokeCap.Square, StrokeJoin = StrokeJoin.Miter } 
                }
            };
        }


        public static SymbolStyle CreateBitmapStyle(string embeddedResourcePath, double scale)
        {
            var stream = EmbeddedResourceLoader.Load(embeddedResourcePath, typeof(CoreApp));
            var bitmapId = BitmapRegistry.Instance.Register(stream);

            return new SymbolStyle
            {
                BitmapId = bitmapId,
                SymbolScale = scale
            };
        }

        public static Feature CreateCurrentPoint(Position position)
        {
            Point sp = SphericalMercator.FromLonLat(position.Longitude, position.Latitude);
            var feature = new Feature { Geometry = sp };

            Debug.WriteLine(position.Longitude);
            feature.Styles.Add(CreateBitmapStyle("Images.pedestrian_walking.png", 0.6));
            return feature;
        }


        public static WritableLayer CreateCurrentPointLayer(Position position)
        {
            var layer = new WritableLayer();
            layer.Add(CreateCurrentPoint(position));
            return layer;
        }

        public static WritableLayer CreateMeetingPointLayer(Point point)
        {
            var layer = new WritableLayer();
            layer.Add(CreateMeetingPoint(point));
            return layer;
        }
        public static Feature CreateMeetingPoint(Point point)
        {
            Point sp = SphericalMercator.FromLonLat(point.X, point.Y);
            var feature = new Feature { Geometry = sp };

            feature.Styles.Add(CreateBitmapStyle("Images.destination_pin.png", 0.6));
            return feature;
        }
    }
}
