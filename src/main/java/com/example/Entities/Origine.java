package com.example.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="origine")
public class Origine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String origine;

    private String detail;

    @OneToOne(mappedBy = "origine", fetch = FetchType.LAZY)
    private Matiere matiere;

    public Origine(String origine) {
        this.origine = origine;
    }

    public Origine() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public String getOrigine() {
        return origine;
    }

    public Origine(String origine, String detail) {
        this.origine = origine;
        this.detail = detail;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Origine{" +
                "id=" + id +
                ", origine='" + origine + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
