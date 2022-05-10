package com.example.Controllers;

import com.example.Entities.Categorie;
import com.example.Services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CategorieController {
    @Autowired
    private CategorieService categorieService;

    @PostMapping("/categories")
    public ResponseEntity<String> creeCategorie(@RequestBody Categorie categorie){
        categorieService.ajouterCategorie(categorie);
        return ResponseEntity.ok().body("une categorie a été crée");
    }

    @GetMapping("/categories")
    public ResponseEntity<List<Categorie>> toutesCategories(){
        return ResponseEntity.ok().body(categorieService.recupererToutes());
    }
}
