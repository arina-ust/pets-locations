package urbaton2019.timeparadox.petslocations.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class SearchArea {

    private static final String type = "MultiPolygon";

    private List<Zone> coordinates = new ArrayList<>();

    public SearchArea() {
    }

    public void addZone(Zone zone) {
        coordinates.add(zone);
    }

}
