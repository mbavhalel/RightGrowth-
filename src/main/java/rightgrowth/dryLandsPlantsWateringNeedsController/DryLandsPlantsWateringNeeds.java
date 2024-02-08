package rightgrowth.dryLandsPlantsWateringNeedsController;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DryLandsPlantsWateringNeeds {
    @Id
    @GeneratedValue
    private int dryId;
    private String species;
    private String autumn;
    private String spring;
    private String winter;
    private String summer;
    private String howDeep;
}
