package com.example.Repositories;

import com.example.Entities.Cooperative;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CooperativeRepository extends JpaRepository<Cooperative, Long> {
//    @Query("Select c form Cooperative where email=:email and password=:password")
//    public Cooperative findByEmailPassword(@Param("email") String email, @Param("password") String password);
}
