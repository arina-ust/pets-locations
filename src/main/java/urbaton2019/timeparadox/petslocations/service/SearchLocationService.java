package urbaton2019.timeparadox.petslocations.service;

import org.springframework.stereotype.Service;
import urbaton2019.timeparadox.petslocations.entity.SearchLocation;
import urbaton2019.timeparadox.petslocations.repository.SearchLocationRepository;

@Service
public class SearchLocationService {

    private SearchLocationRepository repository;

    public SearchLocation save(SearchLocation searchLocation) {
        return repository.save(searchLocation);
    }

    public SearchLocation getByPetId(Long id) {
        return repository.findByPetId(id);
    }

    public SearchLocation delete(Long id) {
        return repository.deleteByPetId(id);
    }


}
