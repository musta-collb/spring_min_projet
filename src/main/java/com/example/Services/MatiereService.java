package com.example.Services;

import com.example.Entities.Matiere;
import com.example.Entities.Origine;

public interface MatiereService {

    public void ajouterMatiere(Matiere matiere);

    public Matiere recupererMatiereParId(long id);

    public void supprimerMatiere(long id);

    // Origine props

    public void ajouterOrigine(Origine origine);

    public  void supprimerOrigine(long id);
}
