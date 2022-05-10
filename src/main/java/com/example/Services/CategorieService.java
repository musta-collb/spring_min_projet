package com.example.Services;

import com.example.Entities.Categorie;

import java.util.List;

public interface CategorieService {

    public void ajouterCategorie(Categorie categorie);

    public Categorie recupererCategorie(long id);

    public List<Categorie> recupererToutes();
}
