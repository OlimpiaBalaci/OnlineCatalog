package com.olba.controller;

import com.olba.model.Student;
import com.olba.repository.StudentRepository;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Controller {
    public TextField txtName;
    public Button btnSave;
    public TextField txtLastName;
    public TextField txtFirstName;
    public Label firstName;
    public Label lastName;
    public Label eMail;
    public TextField txtEMail;
    private StudentRepository studentRepository;//we make connection only once time

    public void initialize(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Catalog");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        studentRepository = new StudentRepository(entityManager);
    }

    public void saveStudent(ActionEvent actionEvent) {
        Student student = new Student();
        student.setFirst_name(txtFirstName.getText());
        student.setLast_name(txtLastName.getText());
        student.setE_mail(txtEMail.getText());
        /*EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Catalog");
        EntityManager entityManager = entityManagerFactory.createEntityManager(); copied up*/

        /*StudentRepository studentRepository = new StudentRepository(entityManager); copied up*/
        studentRepository.save(student);

    }
}
