package com.olba;

import com.olba.constants.Constants;
import com.olba.model.Student;
import com.olba.db.DatabaseWrapper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //for student
        Student student = new Student(1, "Olimpia", "Balaci", "olimpia.balaci@gmail.com", "11/06/1982",
                "0728478802", "9B", "2019"
        );
        //String str = student.showStudent();
        //System.out.println(str);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Catalog");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Connected succesfully!");
    }
}
