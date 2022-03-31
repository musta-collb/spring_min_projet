package com.example.Repositories;

import com.example.Entities.Client;
import com.example.Entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientDao extends JpaRepository<Client, Long> {
   // @Query(value="SELECT p FROM Produit as p WHERE Client.Id=:id ")
    //public List<Produit> recupererProduitsParClients(@Param("id") long id);
}
