package urbaton2019.timeparadox.petslocations.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import urbaton2019.timeparadox.petslocations.controllers.dto.MarkerDTO;
import urbaton2019.timeparadox.petslocations.controllers.dto.SearchAreaDTO;
import urbaton2019.timeparadox.petslocations.entity.SearchLocation;
import urbaton2019.timeparadox.petslocations.entity.Zone;
import urbaton2019.timeparadox.petslocations.service.SearchLocationService;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class SearchController {

    @Resource
    private SearchLocationService searchLocationService;

    @GetMapping("/marker")
    public MarkerDTO getMarker(@PathVariable long petId) {
        SearchLocation searchLocation = searchLocationService.getByPetId(petId);

        long timestamp = searchLocation.getLastSeenTime().toInstant().toEpochMilli();

        double[] lastSeenCoordinates = searchLocation.getLastSeenLocationPoint().getCoordinates();
        double lastSeenLongitude = lastSeenCoordinates[0];
        double lastSeenLatitude = lastSeenCoordinates[1];

        double[] homeCoordinates = searchLocation.getHomeLocationPoint().getCoordinates();
        double homeLongitude = homeCoordinates[0];
        double homeLatitude = homeCoordinates[1];

        return new MarkerDTO(searchLocation.getPetId(), timestamp, lastSeenLongitude, lastSeenLatitude,
                homeLongitude, homeLatitude);
    }

    @GetMapping("/lastseen")
    public SearchAreaDTO getLastSeenSearchArea(@PathVariable long petId) {
        SearchLocation searchLocation = searchLocationService.getByPetId(petId);

        SearchAreaDTO searchAreaDTO = new SearchAreaDTO(searchLocation.getPetId());

        List<Zone> searchAreaCoordinates = searchLocation.getLastSeenSearchArea().getCoordinates();

        double[][] searchCoordinates = new double[searchAreaCoordinates.size()][];

        for (int i = 0; i < searchAreaCoordinates.size(); i++) {

        }

        // TODO: extract and send double coordinates

//        searchAreaDTO.setSearchAreaCoordinates();
//        searchAreaDTO.setHomeAreaCoordinates();

        return null;
    }

    // TODO: get mapping for home coordinates
}
