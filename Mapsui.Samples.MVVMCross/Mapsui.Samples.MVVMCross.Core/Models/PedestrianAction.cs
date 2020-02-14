using System.Collections.Generic;

namespace Mapsui.Samples.MVVMCross.Core.Models
{
    public class WktPath
    {
        public string SegmentId { get; set; }
        public string SegmentWkt { get; set; }
    }
    public class Node
    {
        public double Longitude { get; set; }
        public double Latitude { get; set; }
        public int SegmentId { get; set; }
    }
    public class AddressPoint
    {
        public double Longitude { get; set; }
        public double Latitude { get; set; }
        public int Id { get; set; }
    }
    public class PedestrianItinerary
    {
        public AddressPoint OriginPoint { get; set; }
        public List<WktPath> PathToDestinationPoint { get; set; }
        public AddressPoint DestinationPoint { get; set; }
    }

}
