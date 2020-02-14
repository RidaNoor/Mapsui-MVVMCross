using Mapsui.Geometries;
using Mapsui.Geometries.WellKnownText;
using Mapsui.Projection;
using System;
using System.Collections.Generic;
using System.Linq;
using Mapsui.Samples.MVVMCross.Core;
using Mapsui.Samples.MVVMCross.Core.Models;

namespace Mapsui.Samples.MVVMCross.Core.Helpers
{
    public static class Maps
    {
        public enum Primitive
        {
            Point,
            Line
        }
        public static Point CentroidFromPoints(List<WktPath> paths)
        {
            double sumX = 0;
            double sumY = 0;

            var points = new List<Point>();

            foreach (var path in paths)
            {
                var WktGeometry = Geometry.GeomFromText(path.SegmentWkt);
                var pointFromWkt = WktGeometry.AllVertices();
                points.AddRange(pointFromWkt);
            }

            foreach (Point point in points)
            {
                sumX += point.X;
                sumY += point.Y;
            }
            return new Point((sumX / points.Count), (sumY / points.Count));
        }

        public static int ResolutionFromPoints(List<WktPath> paths, Point CenteroifFromPoints)
        {
            double minX = 0, maxX = 0;
            double minY = 0, maxY = 0;
            double distanceX = 0;
            double distanceY = 0;

            var points = new List<Point>();

            foreach (var path in paths)
            {
                var WktGeometry = (LineString)GeometryFromWKT.Parse(path.SegmentWkt);
                var pointFromWkt = WktGeometry.Vertices;
                points.AddRange(pointFromWkt);
            }

            foreach (Point point in points)
            {
                minX = (minX == 0 || minX > point.X) ? point.X : minX;
                maxX = (maxX == 0 || maxX < point.X) ? point.X : maxX;
                minY = (minY == 0 || minY > point.Y) ? point.Y : minY;
                maxY = (maxY == 0 || maxY > point.Y) ? point.Y : maxY;
            }
            distanceX = maxX - minX;
            distanceY = maxY - minY;
            var maxDistance = (distanceX >= distanceY) ? distanceX : distanceY;

            return ResolutionFromDistance(maxDistance);
        }

        public static Point GetLastPoint(this string wkt)
        {
            var WktGeometry = Geometry.GeomFromText(wkt);
            var pointFromWkt = WktGeometry.AllVertices();
            return pointFromWkt.LastOrDefault();
        }

        public static double CalculateDistance(Point origin, Point dest)
        {
            return Math.Sqrt(Math.Pow((origin.X - dest.X), 2) + Math.Pow((origin.Y - dest.Y), 2)); ;
        }

        private static int ResolutionFromDistance(double distance)
        {
            // the assumption that is it won't be any route that 1km route
            // more info at link https://wiki.openstreetmap.org/wiki/Zoom_levels
            if (distance >= 0.703) // 0.703 roughly around ~70km
            {
                return 9;
            }
            else if (distance >= 0.352)
            {
                return 10;
            }
            else if (distance >= 0.176)
            {
                return 11;
            }
            else if (distance >= 0.088)
            {
                return 12;
            }
            else if (distance >= 0.044)
            {
                return 13;
            }
            else if (distance >= 0.022)
            {
                return 14;
            }
            else if (distance >= 0.011)
            {
                return 15;
            }
            else if (distance >= 0.005)
            {
                return 16;
            }
            else if (distance >= 0.003)
            {
                return 17;
            }
            else if (distance >= 0.001)
            {
                return 18;
            }
            else
            {
                return 19;
            }
        }

    }
}