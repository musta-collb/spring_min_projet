package com.example.demo;

import com.example.Entities.Cooperative;
import com.example.Entities.Produit;
import com.example.Services.CooperativeService;
import com.example.Services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/api/v1")
public class TestContorller {
    @Autowired
    public CooperativeService cooperativeService;
    @Autowired
    public ProduitService produitService;
    @GetMapping(path="/test")
    public String hello(){
        //
        List<Produit> produits = new ArrayList<>();
        produits.add(new Produit("Test produit1", 23.0F,"Testing1", "KG"));
        produits.add(new Produit("Test produit2", 23.0F,"Testing2", "KG"));
        produits.add(new Produit("Test produit3", 23.0F,"Testing3", "KG"));
        Cooperative cooperative1 = new Cooperative("ls", "sfs","sfsdf", "hs", "msu", "shsf", "dfs");
        //cooperativeService.ajouterCooperative(cooperative1);
        Cooperative cooperative = cooperativeService.recupererCooperative(1L);
        System.out.println(cooperative.getAdresse());

        cooperative.setAdresse("test updating adresse");
        cooperativeService.ajouterCooperative(cooperative);
//        produits.forEach(produit -> {
//            produit.setCooperative(cooperative);
//            //System.out.println(produit.getPrix());
//            produitService.ajouterProduit(produit);
//        });

        //
        return "Hello";
    };
}
