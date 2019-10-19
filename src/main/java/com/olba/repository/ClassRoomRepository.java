package com.olba.repository;

import com.olba.model.Classroom;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class ClassRoomRepository implements CrudRepository<Classroom, Integer> {
    private final EntityManager entityManager;

    public ClassRoomRepository( EntityManager entityManager ) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<Classroom> findById( Integer id ) {
        return Optional.empty();
    }

    @Override
    public List<Classroom> findAll() {
        return null;
    }

    @Override
    public Optional<Classroom> save( Classroom object ) {
        return Optional.empty();
    }

    @Override
    public Classroom deleteById( Integer id ) {
        return null;
    }
}
