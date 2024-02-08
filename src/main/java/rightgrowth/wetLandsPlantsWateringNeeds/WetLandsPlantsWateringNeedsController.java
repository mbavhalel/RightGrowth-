package rightgrowth.wetLandsPlantsWateringNeeds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("wetLandsPlantsWateringNeeds/")
public class WetLandsPlantsWateringNeedsController {

    @Autowired
    WetLandsPlantsWateringNeedsService WetLandsplantsWateringNeedsService;

    @PostMapping("/addPlantsWateringNeeds")
    public WetLandsPlantsWateringNeeds postPlant(@RequestBody WetLandsPlantsWateringNeeds WetLandsplantsWateringNeeds){
        return WetLandsplantsWateringNeedsService.addPlantsWateringNeeds(WetLandsplantsWateringNeeds);
    }
    @PostMapping("/addListOfPlantsWateringNeeds")
    public List<WetLandsPlantsWateringNeeds> postListOfPlantsWateringNeeds(@RequestBody List<WetLandsPlantsWateringNeeds> WetLandsplantsWateringNeeds){
        return WetLandsplantsWateringNeedsService.addListOfPlants(WetLandsplantsWateringNeeds);
    }
    @GetMapping("/viewPlantsWateringNeeds/{id}")
    public WetLandsPlantsWateringNeeds getPlantsWateringNeeds(@PathVariable int id){
        return WetLandsplantsWateringNeedsService.getPlantsWateringNeeds(id);
    }
    @GetMapping("/viewListOfPlantsWateringNeedss")
    public List<WetLandsPlantsWateringNeeds> getPlantsWateringNeeds(){
        return WetLandsplantsWateringNeedsService.getListOfPlantsWateringNeeds();
    }
    @PutMapping("/updatePlant")
    public WetLandsPlantsWateringNeeds putPlantsWateringNeeds(@RequestBody WetLandsPlantsWateringNeeds WetLandsplantsWateringNeeds){
        return WetLandsplantsWateringNeedsService.updatePlantsWateringNeeds(WetLandsplantsWateringNeeds);
    }
    @DeleteMapping("/deletePlant/{id}")
    public String deletePlantsWateringNeeds(@PathVariable int id){
        return WetLandsplantsWateringNeedsService.deletedPlantsWateringNeeds(id);
    }
}
