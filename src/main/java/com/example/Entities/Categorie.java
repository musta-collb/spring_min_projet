package com.example.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="categorie")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","produits"})
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String label;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "categorie", cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST, CascadeType.REFRESH})
    private List<Produit> produits;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public Categorie(String label, List<Produit> produits) {
        this.label = label;
        this.produits = produits;
    }

    public Categorie(String label) {
        this.label = label;
    }

    public Categorie() {
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "id=" + id +
                ", label='" + label + '\'' +
                '}';
    }
}
