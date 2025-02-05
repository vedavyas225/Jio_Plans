package com.jio.JioPlans.Controller;

import com.jio.JioPlans.Entity.NormalUser;
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

    @GetMapping("/testing")
    public String testingOutput(){
        return "This is a dummy string in NormalUserController";
    }

    @GetMapping("/getUsers")
    public List<NormalUser> getAllNormalUser(){
        return normService.getAllNormalUsers();
    }

    @PostMapping("/addUser")
    public NormalUser saveNormalUser(@RequestBody NormalUser user){
        return normService.createNormalUser(user);
    }

    @PutMapping("/updateUser/{nid}")
    public Optional<NormalUser> updateNormalUser(@RequestBody NormalUser user, @PathVariable long nid){
        return normService.updateNormalUser(nid, user);
    }

    @DeleteMapping("/deleteUser/{nid}")
    public boolean deleteNormalUser(@PathVariable long nid){
        return normService.deleteNormalUser(nid);
    }
}
