package com.jio.JioPlans.Controller;

import com.jio.JioPlans.Entity.CorporateUser;
import com.jio.JioPlans.Service.CorporateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/corp")
public class CorporateUserController {

    @Autowired
    public CorporateUserService cuService;


    @GetMapping("/")
    public ResponseEntity<List<CorporateUser>> getAllCorporateUsers() {
        return cuService.getAllCorporateUsers();
    }

    @PostMapping("/addUser")
    public ResponseEntity<CorporateUser> saveCUser(@RequestBody CorporateUser cu){
        return cuService.saveCUser(cu);
    }

    @PutMapping("/updateCUser/{cid}")
    public ResponseEntity<Optional<CorporateUser>> updateCUser(@PathVariable long cid, @RequestBody CorporateUser updatedCU){
        return cuService.updateCUser(cid, updatedCU);
    }

    @DeleteMapping("/deleteCUser/{cid}")
    public ResponseEntity<Boolean> deleteCUserById(@PathVariable long cid){
        return cuService.deleteCUserById(cid);
    }
}
