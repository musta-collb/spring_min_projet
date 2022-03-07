package com.example.Entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date date;

    private String commentaire;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name="client_id")
    private Client client;

    public Commande() {
    }

    @OneToMany(mappedBy = "commande",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Quantite> quantites;

    public Commande(Date date, Client client) {
        this.date = date;
        this.client = client;
    }

    public Commande(Date date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public Commande(Date date, String commentaire) {
        this.date = date;
        this.commentaire = commentaire;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "date=" + date +
                ", commentaire='" + commentaire + '\'' +
                '}';
    }
}
