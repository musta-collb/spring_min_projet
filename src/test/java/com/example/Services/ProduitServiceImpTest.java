package com.example.Services;

import com.example.Repositories.ProduitRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ProduitServiceImpTest {
    @Mock
    public ProduitRepository produitRepository;
    public ProduitService produitService;
    private AutoCloseable autoCloseable;



    @Test
    public void shouldAutoWireProduitRepo(){
        assertThat(produitService.getProduitDao()).isNotNull();
    }

}