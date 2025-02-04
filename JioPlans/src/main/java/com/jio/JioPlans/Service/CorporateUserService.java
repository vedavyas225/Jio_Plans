package com.jio.JioPlans.Service;

import com.jio.JioPlans.Entity.CorporateUser;
import com.jio.JioPlans.Repository.CorporateUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;

@Service
public class CorporateUserService {

    @Autowired
    private CorporateUserRepo cuRepo;

    // R
    public List<CorporateUser> getAllCorporateUsers(){
        return cuRepo.findAll();
    }

    // C
    public CorporateUser createCU(CorporateUser cu){
        return cuRepo.save(cu);
    }

    //U
    public Optional<CorporateUser> updateCU(long cid, CorporateUser cu){
       return cuRepo.findById(cid).map(
               currentCU -> {
                   currentCU.setCorporateUserName(cu.getCorporateUserName());
                   currentCU.setCorporateRegisteredNumber(cu.getCorporateRegisteredNumber());
                   currentCU.setCorporatePlanType(cu.getCorporatePlanType());
                   return cuRepo.save(currentCU);
               }
       );
    }

    // D
    public boolean deleteCU(long cid){
        try{
            cuRepo.deleteById(cid);
            return true;
        } catch (Exception e) {
            System.out.println("Not Deleted");
            return false;
        }
    }



}
