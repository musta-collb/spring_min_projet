package com.example.Services;

import com.example.Dao.CooperativeDao;
import com.example.Entities.Cooperative;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CooperativeServiceImp implements CooperativeService{
    @Autowired
    private CooperativeDao cooperativeDao;
    //ajouter
    public void ajouterCooperative(Cooperative cooperative){
        cooperativeDao.save(cooperative);
    }
    //recuperer par id
    public Cooperative recupererCooperative(long Id){
        return cooperativeDao.getById(Id);
    }
    //supprimer par id
    public void supprimerCooperative(long id){
        cooperativeDao.deleteById(id);
    };
}
