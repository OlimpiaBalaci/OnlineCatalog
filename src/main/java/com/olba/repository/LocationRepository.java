package com.olba.repository;

import com.olba.model.Message;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class LocationRepository implements CrudRepository<Message, Integer> {

    private final EntityManager entityManager;

    public LocationRepository( EntityManager entityManager ) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<Message> findById( Integer id ) {
        return Optional.empty();
    }

    @Override
    public List<Message> findAll() {
        return null;
    }

    @Override
    public Optional<Message> save( Message object ) {
        return Optional.empty();
    }

    @Override
    public Message deleteById( Integer id ) {
        return null;
    }
}

