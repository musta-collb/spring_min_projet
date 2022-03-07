package com.example.Services;

import com.example.Dao.CommandeDao;
import com.example.Dao.QuantiteDao;
import com.example.Entities.Commande;
import com.example.Entities.Quantite;
import org.springframework.beans.factory.annotation.Autowired;

public class CommandeServiceImp implements CommandeService{
    @Autowired
    private CommandeDao commandeDao;

    @Autowired
    private QuantiteDao quantiteDao;

    @Override
    public void ajouterCommande(Commande commande) {
        commandeDao.save(commande);
    }

    @Override
    public Commande recupererCommande(long id) {
        return commandeDao.getById(id);
    }

    @Override
    public void supprimerCommande(long id) {
        commandeDao.deleteById(id);
    }

    @Override
    public void ajouterQuantite(Quantite quantite) {
        quantiteDao.save(quantite);
    }

    @Override
    public Quantite recupererParId(long id) {
        return quantiteDao.getById(id);
    }

    @Override
    public void supprimerQuantite(long id) {
        quantiteDao.deleteById(id);
    }


}
