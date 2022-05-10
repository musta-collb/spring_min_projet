package com.example.Services;

import com.example.Repositories.CooperativeRepository;
import com.example.Entities.Cooperative;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CooperativeServiceImp implements CooperativeService{
    @Autowired
    private CooperativeRepository cooperativeDao;
    private Logger logger = LoggerFactory.getLogger(CooperativeServiceImp.class);
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
    }

    @Override
    public List<Cooperative> recupererCooperatives(){
        return cooperativeDao.findAll();
    }

    @Override
    public Cooperative tourverCooperativeParEmail(String email){
        return cooperativeDao.findByEmailEquals(email);
    }


//    @Override
//    public Cooperative recupererParEmailPassword(String email, String password) {
//        return cooperativeDao.findByEmailPassword(email, password);
//    }


}
