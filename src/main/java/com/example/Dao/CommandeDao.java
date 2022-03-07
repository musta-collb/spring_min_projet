package com.example.Dao;

import com.example.Entities.Commande;
import com.example.Entities.Cooperative;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeDao extends JpaRepository<Commande, Long> {
}
