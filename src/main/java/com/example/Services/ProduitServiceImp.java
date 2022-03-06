package com.example.Services;

import com.example.Dao.ProduitDao;
import com.example.demo.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ProduitServiceImp implements ProduitService{
    @Autowired
    private ProduitDao produitDao;
    @Transactional
    public void ajouterProduit(Produit produit){
        this.produitDao.save(produit);
    }

}
