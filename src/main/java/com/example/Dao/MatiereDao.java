package com.example.Dao;

import com.example.Entities.Cooperative;
import com.example.Entities.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatiereDao extends JpaRepository<Matiere, Long> {
}
