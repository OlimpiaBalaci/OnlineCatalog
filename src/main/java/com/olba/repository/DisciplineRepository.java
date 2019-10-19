package com.olba.repository;

import com.olba.model.Discipline;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class DisciplineRepository implements CrudRepository<Discipline, Integer>{
    private final EntityManager entityManager;

    public DisciplineRepository( EntityManager entityManager ) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<Discipline> findById( Integer id ) {
        return Optional.empty();
    }

    @Override
    public List<Discipline> findAll() {
        return null;
    }

    @Override
    public Optional<Discipline> save( Discipline object ) {
        return Optional.empty();
    }

    @Override
    public Discipline deleteById( Integer id ) {
        return null;
    }
}
