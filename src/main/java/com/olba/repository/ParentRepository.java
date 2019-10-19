package com.olba.repository;


import com.olba.model.Parent;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class ParentRepository implements CrudRepository<Parent, Integer> {

    public ParentRepository( EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    private EntityManager entityManager;

    @Override
    public Optional<Parent> findById( Integer id){
        return Optional.empty();
    }
    @Override
    public List<Parent> findAll(){
        return null;
    }
    @Override
    public Optional<Parent> save(Parent teacher){
        entityManager.getTransaction().begin();
        entityManager.persist(teacher);
        entityManager.getTransaction().commit();
        return Optional.empty();
    }

    @Override
    public Parent deleteById(Integer id){
        return null;
    }
}

