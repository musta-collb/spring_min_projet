package com.example.Services;

import com.example.Entities.Produit;
import com.example.Repositories.ProduitRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.mockito.Mockito.verify;

@DataJpaTest
class ProduitServiceImpTest {
    @Mock
    public ProduitRepository produitRepository;

    public ProduitServiceImp produitServiceImp = null;

    @BeforeEach
    void setUp() {
        produitServiceImp = new ProduitServiceImp(produitRepository);
    }

    @Test
    public void shouldEnvocToSaveProduit(){
        Produit produit = new Produit("testingProduit", 13.45F, "detailTesting", "uniteTesting");
        produitServiceImp.ajouterProduit(produit);
        verify(produitRepository).save(produit);

    }

    @Test
    public void shouldEnvocToGetById(){
        produitServiceImp.recupererProduit(1L);
        verify(produitRepository).getById(1L);
    }

}