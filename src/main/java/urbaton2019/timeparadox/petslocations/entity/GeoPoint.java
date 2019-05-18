package urbaton2019.timeparadox.petslocations.entity;

import lombok.Value;

@Value
public class GeoPoint {

    private static final String type = "Point";

    private final double[] coordinates = new double[2];

    private GeoPoint(double longitude, double latitude) {
        coordinates[0] = longitude;
        coordinates[1] = latitude;
    }

    public static GeoPoint of(double longitude, double latitude) {
        return new GeoPoint(longitude, latitude);
    }
}
