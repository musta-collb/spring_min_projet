package com.example.Repositories;

import com.example.Entities.Produit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class ProduitRepositoryTest {
    @Autowired
    public ProduitRepository produitRepository;

    @Test
    public void shouldCreateEntity(){
        //Given
        Produit produit = new Produit("testingProduit", 13.45F, "detailTesting", "uniteTesting");
        //when
        produitRepository.save(produit);
        List<Produit> produits = produitRepository.findAll();
        Produit produit1 = produits.get(0);
        //then
        assertThat(produit1).isNotNull();
        assertThat(produit1.getDesignation()).isEqualTo("testingProduit");
        assertThat(produit1.getPrix()).isEqualTo(13.45F);
        assertThat(produit1.getDetail()).isEqualTo("detailTesting");
        assertThat(produit1.getUnite()).isEqualTo("uniteTesting");
    }
    @Test
    public  void shouldRetriveEntityById(){
        //given
        Produit produit = new Produit("testingProduit", 13.45F, "detailTesting", "uniteTesting");
        //produit.setId(12L);//Assign Id
        //when
        produitRepository.save(produit);
        System.out.println(produit.getId());
        Produit produit1 = produitRepository.getById(produit.getId());
        //then
        assertThat(produit1).isNotNull();
        assertThat(produit1.getId()).isEqualTo(produit.getId());
        assertThat(produit1.getDesignation()).isEqualTo("testingProduit");
        assertThat(produit1.getPrix()).isEqualTo(13.45F);
        assertThat(produit1.getDetail()).isEqualTo("detailTesting");
        assertThat(produit1.getUnite()).isEqualTo("uniteTesting");

    }
    @Test
    public void deleteEntityById(){
        //given
        Produit produit = new Produit("testingProduit", 13.45F, "detailTesting", "uniteTesting");
        //when
        produitRepository.save(produit);
        long id = produit.getId();
        produitRepository.delete(produit);
        try {
            Produit produit1 = produitRepository.getById(id);
        }catch (Exception e){
            assertThat(e).isInstanceOf(org.springframework.dao.DataRetrievalFailureException.class);
            assertThat(e.getMessage()).isEqualTo("Unable to find com.example.Entities.Produit with id %s; nested exception is javax.persistence.EntityNotFoundException: Unable to find com.example.Entities.Produit with id %s",produit.getId(), produit.getId());
        }
    }

    @Test
    public  void shouldUpdateEntity(){
        //given
        Produit produit = new Produit("testingProduit", 13.45F, "detailTesting", "uniteTesting");
        //when
        produitRepository.save(produit);
        Produit produit1 = produitRepository.getById(produit.getId());
        produit1.setDesignation("testing2Produit");
        produit1.setPrix(13.49F);
        produitRepository.save(produit1);
        assertThat(produitRepository.getById(produit.getId())).isEqualTo(produit1);
    }
    @AfterEach
    void tearDown() {
        produitRepository.deleteAll();
    }
}