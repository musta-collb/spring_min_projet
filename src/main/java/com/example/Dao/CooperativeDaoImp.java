package com.example.Dao;

import com.example.Entities.Cooperative;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class CooperativeDaoImp implements CooperativeDao{

    @Override
    public List<Cooperative> findAll() {
        return null;
    }

    @Override
    public List<Cooperative> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Cooperative> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Cooperative> findAllById(Iterable<Long> longs) {
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
    public void delete(Cooperative entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Cooperative> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Cooperative> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Cooperative> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Cooperative> findById(Long aLong) {
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
    public <S extends Cooperative> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Cooperative> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Cooperative> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Cooperative getOne(Long aLong) {
        return null;
    }

    @Override
    public Cooperative getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Cooperative> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Cooperative> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Cooperative> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Cooperative> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Cooperative> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Cooperative> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Cooperative, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
