package com.jio.JioPlans.Controller;

import com.jio.JioPlans.Entity.Plans;
import com.jio.JioPlans.Service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/plan")
public class PlansController {

    @Autowired
    private PlanService planService;

    @GetMapping("/testing")
    public String testingPlan(){
        return "This is a dummy string in PlanController";
    }

    @GetMapping("/getPlan")
    public List<Plans> getAllPlans(){
        return planService.getAllPlans();
    }

    @PostMapping("/addPlan")
    public Plans savePlan(@RequestBody Plans plan){
        return planService.createPlan(plan);
    }

    @PutMapping("/updatePlan/{pid}")
    public Optional<Plans> updatePlan(@RequestBody Plans plan,@PathVariable Long pid){
        return planService.updatePlan(pid,plan);
    }

    @DeleteMapping("/deletePlan/{pid}")
    public boolean deletePlan(@PathVariable Long pid){
        return planService.deletePlan(pid);
    }


}
