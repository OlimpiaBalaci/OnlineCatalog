package com.olba.repository;

import com.olba.model.Grade;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class GradeRepository implements CrudRepository<Grade, Integer> {
    private final EntityManager entityManager;

    public GradeRepository( EntityManager entityManager ) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<Grade> findById( Integer id ) {
        return Optional.empty();
    }

    @Override
    public List<Grade> findAll() {
        return null;
    }

    @Override
    public Optional<Grade> save( Grade object ) {
        return Optional.empty();
    }

    @Override
    public Grade deleteById( Integer id ) {
        return null;
    }
}
