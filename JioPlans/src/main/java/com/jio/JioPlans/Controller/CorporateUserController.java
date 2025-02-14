package com.jio.JioPlans.Controller;

import com.jio.JioPlans.DTO.CUdto;
import com.jio.JioPlans.Entity.CorporateUser;
import com.jio.JioPlans.Service.CorporateUserService;
import com.jio.JioPlans.Service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/corp")
public class CorporateUserController {

    @Autowired
    private final KafkaProducerService kafkaProducerService;

    @Autowired
    public CorporateUserService cuService;

    public CorporateUserController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping("/selectPlan")
    public String selectPlan(@RequestParam String username, @RequestParam String planName){
        String message = "Corporate User " + username + "selected plan "+planName;
        kafkaProducerService.sendMessage("plans-topic",message);
        return "Plan selection published";
    }

    @GetMapping("/testing")
    public String testingOutput(){
        return "this is a dummy string";
    }

    @GetMapping("/getUsers")
    public List<CorporateUser> getAllCorporateUsers() {
        return cuService.getAllCorporateUsers();
    }

    @PostMapping("/addUser")
    public CorporateUser saveCUser(@RequestBody CUdto cuDTO){
        return cuService.createCU(cuDTO);
    }

    //This is written by Uma
    @PutMapping("/updateCUser/{cid}")
    public Optional<CorporateUser> updateCUser(@PathVariable long cid, @RequestBody CUdto updatedCUdto){
        return cuService.updateCU(cid, updatedCUdto);
    }

    @DeleteMapping("/deleteCUser/{cid}")
    public boolean deleteCUserById(@PathVariable long cid){
        return cuService.deleteCU(cid);
    }
}
