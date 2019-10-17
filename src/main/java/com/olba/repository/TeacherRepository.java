package com.olba.repository;

import com.olba.model.Teacher;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class TeacherRepository implements CrudRepository<Teacher, Integer> {

    public TeacherRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    private EntityManager entityManager;

    @Override
    public Optional<Teacher> findById(Integer id){
        return Optional.empty();
    }
@Override
public List<Teacher> findAll(){
        return null;
}
    @Override
    public Optional<Teacher> save(Teacher teacher){
        entityManager.getTransaction().begin();
        entityManager.persist(teacher);
        entityManager.getTransaction().commit();
        return Optional.empty();
    }

    @Override
    public Teacher deleteById(Integer id){
        return null;
    }
}
