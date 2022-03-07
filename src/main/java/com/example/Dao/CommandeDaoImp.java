package com.example.Dao;

import com.example.Entities.Commande;
import com.example.Entities.Cooperative;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class CommandeDaoImp implements CommandeDao{

    @Override
    public List<Commande> findAll() {
        return null;
    }

    @Override
    public List<Commande> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Commande> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Commande> findAllById(Iterable<Long> longs) {
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
    public void delete(Commande entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Commande> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Commande> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Commande> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Commande> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Commande> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Commande> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Commande> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Commande getOne(Long aLong) {
        return null;
    }

    @Override
    public Commande getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Commande> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Commande> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Commande> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Commande> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Commande> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Commande> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Commande, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
