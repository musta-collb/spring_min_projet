package com.example.Controllers;

import com.example.Entities.Categorie;
import com.example.Entities.Cooperative;
import com.example.Entities.Produit;
import com.example.Services.CategorieService;
import com.example.Services.CooperativeService;
import com.example.Services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class ProduitController {
    @Autowired
    public ProduitService produitService;
    @Autowired
    public CategorieService categorieService;

    @Autowired
    public CooperativeService cooperativeService;

    @GetMapping("/cooperatives/produits/{id}")
    public Produit getCooperative(@PathVariable long id){
        return produitService.recupererProduit(id);
    }

    @GetMapping("/cooperatives/{id}/produits")
    public List<Produit> getProduitsParCooperative(@PathVariable long id){
        produitService.recupererParCooperative(id).forEach(produit -> {
            System.out.println(produit.toString());
        });
        return produitService.recupererParCooperative(id);
    }


    @GetMapping("/cooperatives/produits")
    public List<Produit> getTousProduits(){
        return produitService.recupererTousProduits();
    }

    @PreAuthorize("hasAuthority('COOPERATIVE')")
    // creer une entite
    @PostMapping("/cooperatives/{id}/produits")
    public ResponseEntity<String> creatCooperative(@RequestBody Produit produit, @PathVariable int id){
        try {
            Cooperative cooperative = cooperativeService.recupererCooperative(id);
            produit.setCooperative(cooperative);
            produitService.ajouterProduit(produit);
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cooperatvie non tourveé!");
        }
        return ResponseEntity.ok().body("Produit crée avec succée!");
    }

    // supprimer une entite
    @DeleteMapping("/cooperatives/produits/{idProd}")
    public String supprimerCooperative(@PathVariable int idProd){
        cooperativeService.supprimerCooperative(idProd);
        return "Une entite a éte supprimer";
    }
    @PreAuthorize("hasAuthority('COOPERATIVE')")
    @PostMapping("/cooperatives/{id}/produits/cotegories/{idCat}")
    public ResponseEntity<String> creeProduitsCategorie(@PathVariable long id, @PathVariable long idCat, @RequestBody Produit produit){
        Cooperative cooperative = cooperativeService.recupererCooperative(id);
        Categorie categorie = categorieService.recupererCategorie(idCat);

        produit.setCooperative(cooperative);
        produit.setCategorie(categorie);
        produitService.ajouterProduit(produit);
        return ResponseEntity.ok().body("un produit a été bien crée!");
    }

}
