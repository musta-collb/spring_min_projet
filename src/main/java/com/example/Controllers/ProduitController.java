package com.example.Controllers;

import com.example.demo.Produit;
import com.example.Services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class ProduitController {
    @Autowired
    public ProduitService produitService;
    @GetMapping(path="/produit")
    public Produit test(){
        Produit produit = new Produit("Test produit", 23.0F,"Testing", "KG");
        produitService.ajouterProduit(produit);
        return produit;
    }
}
