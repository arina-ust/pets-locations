package urbaton2019.timeparadox.petslocations.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class GeoPoint {

    private static final String type = "Point";
    private final double longitude;
    private final double latitude;


    public static GeoPoint of(double longitude, double latitude) {
        return new GeoPoint(longitude, latitude);
    }
}
