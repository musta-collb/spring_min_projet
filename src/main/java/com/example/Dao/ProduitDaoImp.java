package com.example.Dao;

import com.example.demo.Produit;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ProduitDaoImp implements ProduitDao{

    @Override
    public <S extends Produit> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Produit> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Produit> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Produit> findAll() {
        return null;
    }

    @Override
    public Iterable<Produit> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Produit entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Produit> entities) {

    }

    @Override
    public void deleteAll() {

    }
}

