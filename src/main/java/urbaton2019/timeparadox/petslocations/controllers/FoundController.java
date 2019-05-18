package urbaton2019.timeparadox.petslocations.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import urbaton2019.timeparadox.petslocations.controllers.dto.MessageDTO;
import urbaton2019.timeparadox.petslocations.entity.SearchLocation;
import urbaton2019.timeparadox.petslocations.service.SearchLocationService;

import javax.annotation.Resource;


@Controller
public class FoundController {

    @Resource
    private SearchLocationService searchLocationService;

    @DeleteMapping("/found")
    public MessageDTO deleteSearchLocation(@PathVariable long petId) {
        SearchLocation deleted = searchLocationService.delete(petId);
        return new MessageDTO(deleted.getPetId(), true, "");
    }
}
