package com.jio.JioPlans.Service;

import com.jio.JioPlans.DTO.NUdto;
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
    public NormalUser createNormalUser(NUdto nUdto) {
        NormalUser nu = new NormalUser();
        nu.setNormalRegisteredNumber(nu.getNormalRegisteredNumber());
        nu.setNormalPlanType(nu.getNormalPlanType());
        nu.setNormalUserName(nUdto.getNormalUserName());
        return normalUserRepo.save(nu);
    }
    //UPDATE
    public Optional<NormalUser> updateNormalUser(Long nid,NUdto nUdto) {
        return normalUserRepo.findById(nid).map(
                normalUser1 -> {
                    normalUser1.setNormalUserName(nUdto.getNormalUserName());
                    normalUser1.setNormalPlanType(nUdto.getNormalPlanType());
                    normalUser1.setNormalRegisteredNumber(nUdto.getNormalRegisteredNumber());
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
