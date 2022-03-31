package com.example.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","commandes"})
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String nom;

    private String prenom;

    private String email;

    private String password;

    private String adresse;

    private String tel;

    @OneToMany(mappedBy ="client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Commande> commandes;




    public Client(String nom, String prenom, String email, String password, String adresse, String tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.adresse = adresse;
        this.tel = tel;
    }

    public Client() {
    }
}
