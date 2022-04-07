package com.example.Services;

import com.example.Repositories.CategorieDao;
import com.example.Repositories.ProduitRepository;
import com.example.Entities.Categorie;
import com.example.Entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProduitServiceImp implements ProduitService{
    @Autowired
    private final ProduitRepository produitDao;

    @Autowired
    private CategorieDao categorieDao;

    public ProduitServiceImp(ProduitRepository produitDao) {
        this.produitDao = produitDao;
    }

    //
    public void ajouterProduit(Produit produit){
        this.produitDao.save(produit);
    }

    //recuperer par id
    public Produit recupererProduit(long Id){
        return produitDao.getById(Id);
    }

    //supprimer par id
    public void supprimerProduit(long id){
        produitDao.deleteById(id);
    }

    @Override
    public void ajouterCategorie(Categorie categorie) {
        categorieDao.save(categorie);
    }

    @Override
    public List<Categorie> recupererCategories() {
        return categorieDao.findAll();
    }

    @Override
    public Categorie recupererCategorieParId(long id) {
        return categorieDao.getById(id);
    }

    @Override
    public void supprimerCategorie(long id) {
        categorieDao.deleteById(id);
    }

    @Override
    public List<Produit> recupererTousProduits() {
        return produitDao.findAll();
    }

    @Override
    public List<Produit> recupererParCooperative(long id) {
        return produitDao.recupererProduitsParCooperative(id);
    }


    //For testing purposes


    public ProduitRepository getProduitDao() {
        return produitDao;
    }
}
