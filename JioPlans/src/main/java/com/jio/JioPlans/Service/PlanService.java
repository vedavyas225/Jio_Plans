package com.jio.JioPlans.Service;

import com.jio.JioPlans.DTO.PlansDTO;
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
    public Plans createPlan(PlansDTO plansDTO) {
        Plans plans = new Plans();
        plans.setCalls(plansDTO.getCalls());
        plans.setPlanSpeed(plansDTO.getPlanSpeed());
        plans.setPlanDuration(plansDTO.getPlanDuration());
        plans.setPlanData(plansDTO.getPlanData());
        return plansRepo.save(plans);
    }
    //UPDATE
    public Optional<Plans> updatePlan(Long pid,PlansDTO plansDTO) {
        return plansRepo.findById(pid).map(
                plan1 ->{
                    plan1.setPlanData(plansDTO.getPlanData());
                    plan1.setPlanDuration(plansDTO.getPlanDuration());
                    plan1.setPlanSpeed(plansDTO.getPlanSpeed());
                    plan1.setCalls(plansDTO.getCalls());
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
