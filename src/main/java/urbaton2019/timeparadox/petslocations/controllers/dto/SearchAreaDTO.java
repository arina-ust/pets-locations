package urbaton2019.timeparadox.petslocations.controllers.dto;

import lombok.Data;

@Data
public class SearchAreaDTO {

    private long petId;
    private double[][] searchAreaCoordinates;
    private double[][] homeAreaCoordinates;

    public SearchAreaDTO(long petId) {
        this.petId = petId;
    }
}
