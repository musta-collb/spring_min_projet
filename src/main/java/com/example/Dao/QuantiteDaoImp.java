package com.example.Dao;

import com.example.Entities.Cooperative;
import com.example.Entities.Quantite;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class QuantiteDaoImp implements QuantiteDao{

    @Override
    public List<Quantite> findAll() {
        return null;
    }

    @Override
    public List<Quantite> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Quantite> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Quantite> findAllById(Iterable<Long> longs) {
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
    public void delete(Quantite entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Quantite> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Quantite> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Quantite> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Quantite> findById(Long aLong) {
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
    public <S extends Quantite> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Quantite> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Quantite> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Quantite getOne(Long aLong) {
        return null;
    }

    @Override
    public Quantite getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Quantite> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Quantite> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Quantite> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Quantite> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Quantite> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Quantite> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Quantite, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
