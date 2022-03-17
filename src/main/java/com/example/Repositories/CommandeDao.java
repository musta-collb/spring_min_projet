package com.example.Repositories;

import com.example.Entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeDao extends JpaRepository<Commande, Long> {
}
