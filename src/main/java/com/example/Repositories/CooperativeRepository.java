package com.example.Repositories;

import com.example.Entities.Cooperative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CooperativeRepository extends JpaRepository<Cooperative, Long> {
//    @Query("Select c form Cooperative where email=:email and password=:password")
//    public Cooperative findByEmailPassword(@Param("email") String email, @Param("password") String password);

    @Query("select c from Cooperative c where c.nomCooperative=:nom")
    public Cooperative findByNom(@Param("nom") String nomCooperatvie);

    Cooperative findByEmailEquals(String email);
}
