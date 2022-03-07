package com.example.Dao;

import com.example.Entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieDao extends JpaRepository<Categorie, Long> {
}
