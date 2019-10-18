package com.olba.controller;

import com.olba.model.Student;
import com.olba.model.Teacher;
import com.olba.repository.StudentRepository;
import com.olba.repository.TeacherRepository;
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
    public Label firstNameTeacher;
    public TextField txtFirstNameTeacher;
    public Label lastNameTeacher;
    public TextField txtLastNameTeacher;
    public TextField txtEMailTeacher;
    public TextField txtPhoneTeacher;
    public Label eMailTeacher;
    public Label phoneTeacher;
    public Label gradeTeacher;
    public TextField txtGradeTeacher;
    public Label hiringDateTeacher;
    public DatePicker dbkHiringDateTeacher;
    public Label statusTeacher;
    public CheckBox checkBoXStatusTeacher;
    public Button btnSaveTeacher;
    private StudentRepository studentRepository;//we make connection only once time
    private TeacherRepository teacherRepository;


    public void initialize() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Catalog");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        studentRepository = new StudentRepository(entityManager);
        teacherRepository = new TeacherRepository(entityManager);
    }

    public void saveStudent(ActionEvent actionEvent) {
        Student student = new Student();
        if (txtFirstName.getText().isEmpty()) {
            System.out.println("The FirstName can not be empty!");
        } else {
            student.setFirst_name(txtFirstName.getText());
        }
//        student.setFirst_name(txtFirstName.getText());
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

    public void saveTeacher( ActionEvent actionEvent ) {
        Teacher teacher = new Teacher();
        if (txtFirstNameTeacher.getText().isEmpty()) {
            System.out.println("The FirstNameTeacher can not be empty!");
        } else {
            teacher.setFirst_name(txtFirstName.getText());
        }
        teacher.setFirst_name(txtFirstNameTeacher.getText());
        teacher.setLast_name(txtLastNameTeacher.getText());
        teacher.setE_mail(txtEMailTeacher.getText());
        teacher.setPhone(txtPhoneTeacher.getText());
        teacher.setGrade(txtGradeTeacher.getText());
        teacher.setHiringDate(dbkHiringDateTeacher.getValue());
        //teacher.setStatus();

        teacherRepository.save(teacher);
        System.out.println("Teacher added successfully" + txtFirstName);

    }
}
