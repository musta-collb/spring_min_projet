package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String designation;
    private float prix;
    private String detail;
    private String unite;

    public Produit(String designation, float prix, String detail, String unite) {
        this.designation = designation;
        this.prix = prix;
        this.detail = detail;
        this.unite = unite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    protected Produit() {
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", prix=" + prix +
                ", detail='" + detail + '\'' +
                ", unite=" + unite +
                '}';
    }
}
