package com.example.Repositories;

import com.example.Entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
    @Query("SELECT c.produits FROM Cooperative c WHERE c.id=:Id")
    public List<Produit> recupererProduitsParCooperative(@Param("Id") long id);
}
