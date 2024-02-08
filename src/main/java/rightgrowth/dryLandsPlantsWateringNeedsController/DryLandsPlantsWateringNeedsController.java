package rightgrowth.dryLandsPlantsWateringNeedsController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("dryLandsPlantsWateringNeeds/")
public class DryLandsPlantsWateringNeedsController {

        @Autowired
        DryLandsPlantsWateringNeedsService drylandsSevice;

        @PostMapping("/addPlantWateringNeed")
        public DryLandsPlantsWateringNeeds postPlantWateringNeed(@RequestBody DryLandsPlantsWateringNeeds dryLandsplantsWateringNeeds){
            return drylandsSevice.addPlantWateringNeed(dryLandsplantsWateringNeeds);
        }
        @PostMapping("/addListOfPlantsWateringNeed")
        public List<DryLandsPlantsWateringNeeds> postListOfPlants(@RequestBody List<DryLandsPlantsWateringNeeds> autumnWateringNeeds){
            return drylandsSevice.addListOfPlantsWateringNeed(autumnWateringNeeds);
        }
        @GetMapping("/viewPlantWateringNeed/{id}")
        public DryLandsPlantsWateringNeeds getPlantWateringNeed(@PathVariable int id){
            return drylandsSevice.getPlantWateringNeed(id);
        }
        @GetMapping("/viewListOfPlantsWateringNeed")
        public List<DryLandsPlantsWateringNeeds> getPlantWateringNeed(){
            return drylandsSevice.getListOfPlantsWateringNeed();
        }
        @PutMapping("/updatePlantWateringNeed")
        public DryLandsPlantsWateringNeeds putPlant(@RequestBody DryLandsPlantsWateringNeeds dryLandsplantsWateringNeeds){
            return drylandsSevice.updatePlantWateringNeed(dryLandsplantsWateringNeeds);
        }
        @DeleteMapping("/deletePlant/{id}")
        public String deletePlantWateringNeed(@PathVariable int id){
            return drylandsSevice.deletedPlantWateringNeed(id);
        }
    }

