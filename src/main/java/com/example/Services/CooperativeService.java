package com.example.Services;

import com.example.Entities.Cooperative;

public interface CooperativeService {
    public void ajouterCooperative(Cooperative cooperative);
    public Cooperative recupererCooperative(long Id);
    public void supprimerCooperative(long id);
}
