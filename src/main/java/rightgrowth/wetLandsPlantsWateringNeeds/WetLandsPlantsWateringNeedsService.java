package rightgrowth.wetLandsPlantsWateringNeeds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class WetLandsPlantsWateringNeedsService {

    @Autowired
    WetLandsPlantsWateringNeedsRepository wetLandsplantsWateringNeedsRepository;
    public WetLandsPlantsWateringNeeds addPlantsWateringNeeds(WetLandsPlantsWateringNeeds wetLandsplantsWateringNeeds) {
        return wetLandsplantsWateringNeedsRepository.save(wetLandsplantsWateringNeeds);
    }
    public List<WetLandsPlantsWateringNeeds> addListOfPlants(List<WetLandsPlantsWateringNeeds> wetLandsplantsWateringNeeds) {
        return wetLandsplantsWateringNeedsRepository.saveAll(wetLandsplantsWateringNeeds);
    }
    public WetLandsPlantsWateringNeeds getPlantsWateringNeeds(int id) {
        return wetLandsplantsWateringNeedsRepository.findById(id).orElse(null);
    }
    public List<WetLandsPlantsWateringNeeds> getListOfPlantsWateringNeeds() {
        return wetLandsplantsWateringNeedsRepository.findAll();
    }
    public WetLandsPlantsWateringNeeds updatePlantsWateringNeeds(WetLandsPlantsWateringNeeds wetLandsplantsWateringNeeds) {
        WetLandsPlantsWateringNeeds updatedWetLandsPlantsWateringNeeds = wetLandsplantsWateringNeedsRepository.findById(wetLandsplantsWateringNeeds.getWetId()).orElse(null);
            if(updatedWetLandsPlantsWateringNeeds != null){
                updatedWetLandsPlantsWateringNeeds.setSpecies(wetLandsplantsWateringNeeds.getSpecies());
                updatedWetLandsPlantsWateringNeeds.setAutumn(wetLandsplantsWateringNeeds.getAutumn());
                updatedWetLandsPlantsWateringNeeds.setSpring(wetLandsplantsWateringNeeds.getSpring());
                updatedWetLandsPlantsWateringNeeds.setSummer(wetLandsplantsWateringNeeds.getSummer());
                updatedWetLandsPlantsWateringNeeds.setWinter(wetLandsplantsWateringNeeds.getWinter());
                updatedWetLandsPlantsWateringNeeds.setHowDeep(wetLandsplantsWateringNeeds.getHowDeep());
                wetLandsplantsWateringNeedsRepository.save(updatedWetLandsPlantsWateringNeeds);
                return updatedWetLandsPlantsWateringNeeds;
            }
            else return null;
    }
    public String deletedPlantsWateringNeeds(int id) {
        if(wetLandsplantsWateringNeedsRepository.existsById(id)){
            wetLandsplantsWateringNeedsRepository.deleteById(id);
            return "Plant deleted";
        }
        else return "Plant not available";
    }
}

