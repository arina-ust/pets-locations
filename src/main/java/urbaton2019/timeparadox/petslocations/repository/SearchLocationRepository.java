package urbaton2019.timeparadox.petslocations.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import urbaton2019.timeparadox.petslocations.entity.SearchLocation;

public interface SearchLocationRepository extends MongoRepository<SearchLocation, String> {

}
