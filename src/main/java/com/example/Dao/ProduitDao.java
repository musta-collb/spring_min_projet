package com.example.Dao;

import com.example.demo.Produit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitDao extends CrudRepository<Produit, Long> {
}
