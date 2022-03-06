package com.example.Entities;

import javax.persistence.*;

@Entity
@Table(name="matiere")
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;


}
