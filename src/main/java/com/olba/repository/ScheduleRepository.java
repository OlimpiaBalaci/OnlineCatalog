package com.olba.repository;

import com.olba.model.Schedule;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

    public class ScheduleRepository implements CrudRepository<Schedule, Integer>{
        public ScheduleRepository( EntityManager entityManager) {
            this.entityManager = entityManager;
        }

        private EntityManager entityManager;


        @Override
        public Optional<Schedule> findById( Integer id) {
            return Optional.empty();
        }

        @Override
        public List<Schedule> findAll() {
            return null;
        }

        @Override
        public Optional<Schedule> save(Schedule schedule) {
            entityManager.getTransaction().begin();//mandatory to start a transaction in order to have file save
            entityManager.persist(schedule);//in this way we save student in table Schedule
            entityManager.getTransaction().commit();//to commit the transaction in database
            return Optional.empty();
        }

        @Override
        public Schedule deleteById(Integer id) {
            return null;
        }
    }


