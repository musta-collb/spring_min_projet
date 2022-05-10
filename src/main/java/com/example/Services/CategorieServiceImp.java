package com.example.Services;

import com.example.Entities.Categorie;
import com.example.Repositories.CategorieDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieServiceImp implements CategorieService{
    @Autowired
    private CategorieDao categorieDao;
    @Override
    public void ajouterCategorie(Categorie categorie) {
        categorieDao.save(categorie);
    }

    @Override
    public Categorie recupererCategorie(long id) {
        return categorieDao.getById(id);
    }

    @Override
    public List<Categorie> recupererToutes() {
        return categorieDao.findAll();
    }
}
