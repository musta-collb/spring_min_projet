package com.example.Services;
import com.example.Entities.Categorie;
import com.example.Entities.Produit;
import com.example.Repositories.ProduitRepository;

import java.util.List;

public interface ProduitService {
    public void ajouterProduit(Produit produit);

    public Produit recupererProduit(long Id);

    public void supprimerProduit(long id);

    public void ajouterCategorie(Categorie categorie);

    public List<Categorie> recupererCategories();

    public  Categorie recupererCategorieParId(long id);

    public void supprimerCategorie(long id);

    public List<Produit> recupererTousProduits();

    public List<Produit> recupererParCooperative(long id);

    public ProduitRepository getProduitDao();
}
