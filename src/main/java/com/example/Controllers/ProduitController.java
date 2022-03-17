package com.example.Controllers;

import com.example.Entities.Cooperative;
import com.example.Entities.Produit;
import com.example.Services.CooperativeService;
import com.example.Services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class ProduitController {
    @Autowired
    public ProduitService produitService;

    @Autowired
    public CooperativeService cooperativeService;

    @GetMapping("/cooperatives/{idCoop}/produits/{id}")
    public Produit getCooperative(@PathVariable long id){
        return produitService.recupererProduit(id);
    }
    @GetMapping("/cooperatives/{id}/produits")
    public List<Produit> getProduitsParCooperative(@PathVariable long id){
        return null;
    }
    // creer une entite
    @PostMapping("/cooperatives/{id}/produits")
    public String creatCooperative(@RequestBody Produit produit, @PathVariable int id){
        produit.setCooperative(cooperativeService.recupererCooperative(id));
        produitService.ajouterProduit(produit);
        return "Produit was created";
    }
    // supprimer une entite
    @DeleteMapping("/cooperatives/{id}/produit/{idProd}")
    public String supprimerCooperative(@PathVariable int idProd){
        cooperativeService.supprimerCooperative(idProd);
        return "Une entite a éte supprimer";
    }
}
