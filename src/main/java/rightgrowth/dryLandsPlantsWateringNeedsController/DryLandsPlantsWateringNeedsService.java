package rightgrowth.dryLandsPlantsWateringNeedsController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rightgrowth.wetLandsPlantsWateringNeeds.WetLandsPlantsWateringNeeds;

import java.util.List;
@Service
public class DryLandsPlantsWateringNeedsService {

    @Autowired
    DryLandsPlantsWateringNeedsRepository dryLandsplantsWateringNeedsRepository;

    public DryLandsPlantsWateringNeeds addPlantWateringNeed(DryLandsPlantsWateringNeeds dryLandsplantsWateringNeeds) {
        return dryLandsplantsWateringNeedsRepository.save(dryLandsplantsWateringNeeds);
    }
    public List<DryLandsPlantsWateringNeeds> addListOfPlantsWateringNeed(List<DryLandsPlantsWateringNeeds> autumnWateringNeeds) {
        return dryLandsplantsWateringNeedsRepository.saveAll(autumnWateringNeeds);
    }
    public DryLandsPlantsWateringNeeds getPlantWateringNeed(int id) {
        return dryLandsplantsWateringNeedsRepository.findById(id).orElse(null);
    }
    public List<DryLandsPlantsWateringNeeds> getListOfPlantsWateringNeed() {
        return dryLandsplantsWateringNeedsRepository.findAll();
    }

    public DryLandsPlantsWateringNeeds updatePlantWateringNeed(DryLandsPlantsWateringNeeds dryLandsPlantsWateringNeeds) {
        DryLandsPlantsWateringNeeds updatedDryLandsPlantsWateringNeeds = dryLandsplantsWateringNeedsRepository.findById(dryLandsPlantsWateringNeeds.getDryId()).orElse(null);
        if(updatedDryLandsPlantsWateringNeeds != null){
            updatedDryLandsPlantsWateringNeeds.setSpecies(dryLandsPlantsWateringNeeds.getSpecies());
            updatedDryLandsPlantsWateringNeeds.setAutumn(dryLandsPlantsWateringNeeds.getAutumn());
            updatedDryLandsPlantsWateringNeeds.setSpring(dryLandsPlantsWateringNeeds.getSpring());
            updatedDryLandsPlantsWateringNeeds.setSummer(dryLandsPlantsWateringNeeds.getSummer());
            updatedDryLandsPlantsWateringNeeds.setWinter(dryLandsPlantsWateringNeeds.getWinter());
            updatedDryLandsPlantsWateringNeeds.setHowDeep(dryLandsPlantsWateringNeeds.getHowDeep());
            dryLandsplantsWateringNeedsRepository.save(updatedDryLandsPlantsWateringNeeds);
            return updatedDryLandsPlantsWateringNeeds;
        }
        else return null;
    }
    public String deletedPlantWateringNeed(int id) {
        if (dryLandsplantsWateringNeedsRepository.existsById(id)) {
            dryLandsplantsWateringNeedsRepository.deleteById(id);
            return "Plant deleted";
        } else return "Plant not available";
    }

}
