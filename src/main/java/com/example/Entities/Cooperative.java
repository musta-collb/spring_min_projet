package com.example.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="cooperative")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","produits"})

public class Cooperative {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "cooperative")
    private List<Produit> produits;

    private String nomCooperative;

    private String region;

    private String adresse;

    private String tel;

    private String email;

    private String password;

    private String sectionActivite;

    public Cooperative(String nomCooperative, String region, String adresse, String tel, String email, String password, String sectionActivite) {
        this.nomCooperative = nomCooperative;
        this.region = region;
        this.adresse = adresse;
        this.tel = tel;
        this.email = email;
        this.password = password;
        this.sectionActivite = sectionActivite;
    }

    public Cooperative() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomCooperative() {
        return nomCooperative;
    }

    public void setNomCooperative(String nomCooperative) {
        this.nomCooperative = nomCooperative;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSectionActivite() {
        return sectionActivite;
    }

    public void setSectionActivite(String sectionActivite) {
        this.sectionActivite = sectionActivite;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    @Override
    public String toString() {
        return "Cooperative{" +
                "id=" + id +
                ", nomCooperative='" + nomCooperative + '\'' +
                ", region='" + region + '\'' +
                ", adresse='" + adresse + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", sectionActivite='" + sectionActivite + '\'' +
                '}';
    }
}
