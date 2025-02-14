package com.jio.JioPlans.Controller;

import com.jio.JioPlans.DTO.NUdto;
import com.jio.JioPlans.Entity.NormalUser;
import com.jio.JioPlans.Service.KafkaProducerService;
import com.jio.JioPlans.Service.NormalUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/normal")
public class NormalUserController {

    @Autowired
    public NormalUserService normService;

    @Autowired
    private final KafkaProducerService kafkaProducerService;

    public NormalUserController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @PostMapping("/selectPlan")
    public String selectPlan(@RequestParam String userName, @RequestParam String planName){
        String message = "Normal User "+ userName+" selected plan "+planName;
        kafkaProducerService.sendMessage("plans-topic",message);
        return "Plan selection published";
    }

    @GetMapping("/testing")
    public String testingOutput(){
        return "This is a dummy string in NormalUserController";
    }

    @GetMapping("/getUsers")
    public List<NormalUser> getAllNormalUser(){
        return normService.getAllNormalUsers();
    }

    @PostMapping("/addUser")
    public NormalUser saveNormalUser(@RequestBody NUdto nUdto){
        return normService.createNormalUser(nUdto);
    }

    @PutMapping("/updateUser/{nid}")
    public Optional<NormalUser> updateNormalUser(@RequestBody NUdto nUdto, @PathVariable long nid){
        return normService.updateNormalUser(nid, nUdto);
    }

    @DeleteMapping("/deleteUser/{nid}")
    public boolean deleteNormalUser(@PathVariable long nid){
        return normService.deleteNormalUser(nid);
    }
}
