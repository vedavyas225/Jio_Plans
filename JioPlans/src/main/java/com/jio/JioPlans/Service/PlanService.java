package com.jio.JioPlans.Service;

import com.jio.JioPlans.Entity.Plans;
import com.jio.JioPlans.Repository.PlansRepo;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanService {

    @Autowired
    private PlansRepo plansRepo;

    //READ
    public List<Plans> getAllPlans() {
        return plansRepo.findAll();
    }
    //CREATE
    public Plans createPlan(Plans plan) {
        return plansRepo.save(plan);
    }
    //UPDATE
    public Optional<Plans> updatePlan(Long pid,Plans plan) {
        return plansRepo.findById(pid).map(
                plan1 ->{
                    plan1.setPlanData(plan.getPlanData());
                    plan1.setPlanDuration(plan.getPlanDuration());
                    plan1.setPlanSpeed(plan.getPlanSpeed());
                    plan1.setCalls(plan.getCalls());
                    return plansRepo.save(plan1);
                }
        );
    }
    //DELETE
    public boolean deletePlan(Long pid) {
        try{
            plansRepo.deleteById(pid);
            return true;
        }catch(Exception e){
            System.out.println("The plan has been deleted");
            return false;
        }
    }
}
