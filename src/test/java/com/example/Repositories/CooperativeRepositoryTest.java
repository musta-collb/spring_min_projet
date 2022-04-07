package com.example.Repositories;

import com.example.Entities.Cooperative;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.hibernate.annotations.NotFound;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

@DataJpaTest
public class CooperativeRepositoryTest {
    @Autowired
    private CooperativeRepository cooperativeRepository;
    @Test
    public void shouldSaveEntity(){
        //Given
        Cooperative cooperative = new Cooperative("testingCoop", "RegionTesting", "adressTesting", "telTesting", "emailTesting", "pwTesting", "sectionTesting");
        //when
        cooperativeRepository.save(cooperative);
        List<Cooperative> cooperatives = cooperativeRepository.findAll();
        Cooperative coop = cooperatives.get(0);
        //then
        assertThat(coop).isNotNull();
        assertThat(coop.getAdresse()).isEqualTo("adressTesting");
        assertThat(coop.getNomCooperative()).isEqualTo("testingCoop");
        assertThat(coop.getRegion()).isEqualTo("RegionTesting");
        assertThat(coop.getTel()).isEqualTo("telTesting");
        assertThat(coop.getEmail()).isEqualTo("emailTesting");
        assertThat(coop.getPassword()).isEqualTo("pwTesting");
        assertThat(coop.getSectionActivite()).isEqualTo("sectionTesting");
    }
    @Test
    public void shouldRetriveEntityById(){
        //Cooperative coop = cooperativeRepository.getById(1L);wroking because entity already exists
        //Given
        Cooperative cooperative = new Cooperative("testingCoop", "RegionTesting", "adressTesting", "telTesting", "emailTesting", "pwTesting", "sectionTesting");

        //When
        cooperativeRepository.save(cooperative);
        Cooperative coop = cooperativeRepository.getById(cooperative.getId());
        //Then

        assertThat(coop).isNotNull();
        assertThat(coop.getId()).isEqualTo(cooperative.getId());
        assertThat(coop.getAdresse()).isEqualTo("adressTesting");
        assertThat(coop.getNomCooperative()).isEqualTo("testingCoop");
        assertThat(coop.getRegion()).isEqualTo("RegionTesting");
        assertThat(coop.getTel()).isEqualTo("telTesting");
        assertThat(coop.getEmail()).isEqualTo("emailTesting");
        assertThat(coop.getPassword()).isEqualTo("pwTesting");
        assertThat(coop.getSectionActivite()).isEqualTo("sectionTesting");
    }
    @Test
    public void  shouldDeleteEntity(){
        //Given
        Cooperative cooperative = new Cooperative("testingCoop", "RegionTesting", "adressTesting", "telTesting", "emailTesting", "pwTesting", "sectionTesting");
        //When
        cooperativeRepository.save(cooperative);
        Cooperative coop = cooperativeRepository.getById(cooperative.getId());

        cooperativeRepository.delete(coop);
        //Then
        try {
            Cooperative coo = cooperativeRepository.getById(cooperative.getId());
        }catch (Exception e){
            assertThat(e).isInstanceOf(org.springframework.dao.DataRetrievalFailureException.class);
            assertThat(e.getMessage()).isEqualTo("Unable to find com.example.Entities.Cooperative with id %s; nested exception is javax.persistence.EntityNotFoundException: Unable to find com.example.Entities.Cooperative with id %s",cooperative.getId(), cooperative.getId());
        }

    }

    @AfterEach
    void tearDown() {
        cooperativeRepository.deleteAll();
    }
}