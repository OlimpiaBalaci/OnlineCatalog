package com.olba.repository;

import com.olba.model.Student;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class StudentRepository implements CrudRepository<Student, Integer>{
    public StudentRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    private EntityManager entityManager;


    @Override
    public Optional<Student> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Optional<Student> save(Student student) {
        entityManager.getTransaction().begin();//mandatory to start a transaction in order to have file save
        entityManager.persist(student);//in this way we save student in table Student
        entityManager.getTransaction().commit();//to commit the transaction in database
        return Optional.empty();
    }

    @Override
    public Student deleteById(Integer id) {

        // try to find the entity in database
        Student student = entityManager.find(Student.class, id);
        try {
            entityManager.getTransaction().begin();

            entityManager.remove(student);
            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return student;

    }
}
