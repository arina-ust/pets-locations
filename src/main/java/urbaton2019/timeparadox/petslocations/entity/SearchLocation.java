package urbaton2019.timeparadox.petslocations.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class SearchLocation {

    @Id
    private final Long petId;
    @EqualsAndHashCode.Exclude private Date lastSeenTime;
    @EqualsAndHashCode.Exclude private GeoPoint lastSeenLocation;
    @EqualsAndHashCode.Exclude private GeoPoint homeLocation;
    @EqualsAndHashCode.Exclude private SearchArea lastSeenSearchArea;
    @EqualsAndHashCode.Exclude private SearchArea homeArea;


    private SearchLocation(Long petId, Date lastSeenTime, GeoPoint lastSeenLocation, GeoPoint homeLocation,
                           SearchArea lastSeenSearchArea, SearchArea homeArea) {
        this.petId = petId;
        this.lastSeenTime = lastSeenTime;
        this.lastSeenLocation = lastSeenLocation;
        this.homeLocation = homeLocation;
        this.lastSeenSearchArea = lastSeenSearchArea;
        this.homeArea = homeArea;
    }

    private SearchLocation withId(Long petId) {
        return new SearchLocation(petId, this.lastSeenTime, this.lastSeenLocation, this.homeLocation,
                this.lastSeenSearchArea, this.homeArea);
    }

    public static SearchLocation of(Date lastSeenTime, GeoPoint lastSeenLocation, GeoPoint homeLocation) {
        // TODO: stub compute methods
//        SearchArea lastSeenSearchArea = computeLastSeenArea(lastSeenTime, lastSeenLocation);
//        SearchArea homeSearchArea = computeHomeArea(homeLocation);
//        return new SearchLocation(null, lastSeenTime, lastSeenLocation, homeLocation,
//                lastSeenSearchArea, homeSearchArea);
        return null;
    }
}
