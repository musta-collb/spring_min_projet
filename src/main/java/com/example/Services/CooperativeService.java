package com.example.Services;

import com.example.Entities.Cooperative;
import java.util.List;

public interface CooperativeService {
    public void ajouterCooperative(Cooperative cooperative);
    public Cooperative recupererCooperative(long Id);
    public void supprimerCooperative(long id);
    public List<Cooperative> recupererCooperatives();
    public Cooperative tourverCooperativeParEmail(String email);
//    public Cooperative recupererParEmailPassword(String email, String password);
}
