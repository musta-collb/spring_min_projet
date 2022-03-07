package com.example.Services;

import com.example.Entities.Commande;
import com.example.Entities.Quantite;

public interface CommandeService {

    public void ajouterCommande(Commande commande);

    public Commande recupererCommande(long id);

    public void supprimerCommande(long id);

    public void ajouterQuantite(Quantite quantite);

    public Quantite recupererParId(long id);

    public void supprimerQuantite(long id);
}
