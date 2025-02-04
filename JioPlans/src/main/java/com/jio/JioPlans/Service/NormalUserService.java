package com.jio.JioPlans.Service;

import com.jio.JioPlans.Entity.NormalUser;
import com.jio.JioPlans.Repository.NormalUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NormalUserService {

    @Autowired
    private NormalUserRepo normalUserRepo;

    //READ
    public List<NormalUser> getAllNormalUsers() {
        return normalUserRepo.findAll();
    }
    //CREATE
    public NormalUser createNormalUser(NormalUser normalUser) {
        return normalUserRepo.save(normalUser);
    }
    //UPDATE
    public Optional<NormalUser> updateNormalUser(Long nid,NormalUser normalUser) {
        return normalUserRepo.findById(nid).map(
                normalUser1 -> {
                    normalUser1.setNormalUserName(normalUser.getNormalUserName());
                    normalUser1.setNormalPlanType(normalUser.getNormalPlanType());
                    normalUser1.setNormalRegisteredNumber(normalUser.getNormalRegisteredNumber());
                    return normalUserRepo.save(normalUser1);
                }
        );
    }

    //DELETE
    public boolean deleteNormalUser(Long nid) {
        try{
            normalUserRepo.deleteById(nid);
            return true;
        }catch (Exception e){
            System.out.println("Not Deleted");
            return false;
        }
    }


}
