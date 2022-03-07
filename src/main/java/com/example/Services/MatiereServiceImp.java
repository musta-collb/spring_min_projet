package com.example.Services;

import com.example.Dao.MatiereDao;
import com.example.Dao.OrigineDao;
import com.example.Entities.Matiere;
import com.example.Entities.Origine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatiereServiceImp implements MatiereService{
    @Autowired
    private MatiereDao matiereDao;

    @Autowired
    private OrigineDao origineDao;

    @Override
    public void ajouterMatiere(Matiere matiere) {
        matiereDao.save(matiere);
    }

    @Override
    public Matiere recupererMatiereParId(long id) {
        return matiereDao.getById(id);
    }

    @Override
    public void supprimerMatiere(long id) {
        matiereDao.deleteById(id);
    }

    @Override
    public void ajouterOrigine(Origine origine) {
        origineDao.save(origine);
    }

    @Override
    public void supprimerOrigine(long id) {

    }


}
