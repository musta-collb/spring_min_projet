package com.example.Controllers;

import com.example.Entities.Cooperative;
import com.example.Services.CooperativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class CooperativeController {


    @Autowired
    private CooperativeService cooperativeService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder ;

    //Login
    @GetMapping("/login")
    public Cooperative cooperative(){
        return null;
    };
    //recuperer Tous
    @GetMapping(path = "/cooperatives")
    public List<Cooperative> getCooperatives(){
        return cooperativeService.recupererCooperatives();
    }
    // recuperer par id
    @GetMapping("/cooperatives/{id}")
    public Cooperative getCooperative(@PathVariable long id){
        return cooperativeService.recupererCooperative(id);
    }

    // creer une entite
    @PostMapping("/cooperatives")
    public String creatCooperative(@RequestBody Cooperative cooperative){
        System.out.println(cooperative.toString());
        cooperative.setPassword(bCryptPasswordEncoder.encode(cooperative.getPassword()));
        cooperativeService.ajouterCooperative(cooperative);
        return "cooperative was created";
    }
    // supprimer une entite
    @DeleteMapping("/cooperatives/{id}")
    public String supprimerCooperative(@PathVariable int id){
        cooperativeService.supprimerCooperative(id);
        return "Une entite a éte supprimer";
    }

}
