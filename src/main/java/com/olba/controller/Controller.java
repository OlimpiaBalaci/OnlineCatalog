package com.olba.controller;

import com.olba.model.Student;
import com.olba.repository.StudentRepository;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Date;

public class Controller {
    public Button btnSave;
    public TextField txtLastName;
    public TextField txtFirstName;
    public Label firstName;
    public Label lastName;
    public Label eMail;
    public TextField txtEMail;
    public Label dateOfBirth;
    public Label phone;
    public Label classRoom;
    public Label year;
    public TextField txtPhone;
    public TextField txtClassRoom;
    public DatePicker dbkDateOfBirth;
    public Spinner spnYear;
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
        student.setDate_of_birth(dbkDateOfBirth.getValue());
        student.setPhone(txtPhone.getText());
        student.setClassroom(txtClassRoom.getText());
        student.setYear((Integer) spnYear.getValue());
        /*EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Catalog");
        EntityManager entityManager = entityManagerFactory.createEntityManager(); copied up*/

        /*StudentRepository studentRepository = new StudentRepository(entityManager); copied up*/
        studentRepository.save(student);
        System.out.println("Student added successfully" + txtFirstName);

    }
}
