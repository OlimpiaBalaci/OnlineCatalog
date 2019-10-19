package com.olba.controller;

import com.olba.model.Parent;
import com.olba.model.Schedule;
import com.olba.model.Student;
import com.olba.model.Teacher;
import com.olba.repository.ParentRepository;
import com.olba.repository.ScheduleRepository;
import com.olba.repository.StudentRepository;
import com.olba.repository.TeacherRepository;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalTime;

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
    public Label classRoomName;
    public Label teacherName;
    public Label locationName;
    public Label date;
    public Label startDate;
    public Label endDate;
    public Label timeSlot;
    public Label details;
    public Label discipline;
    public TextField txtClassRoomName;
    public TextField txtTeacherName;
    public TextField txtLocationName;
    public DatePicker dbkDateSchedule;
    public DatePicker dbkStartDate;
    public DatePicker dbkEndDate;
    public TextField txtTimeSlot;
    public TextField txtDetails;
    public TextField txtDiscipline;
    public Button btnSaveSchedule;
    public Label parentFirstName;
    public Label parentLastName;
    public Label parentEMail;
    public Label parentPhone;
    public TextField txtParentFirstName;
    public TextField txtParentLastName;
    public TextField txtParentEMail;
    public TextField txtParentPhone;
    public Button btnSaveParent;
    public MenuItem mnuItemAddStudent;
    public MenuItem mnuItemAddTeacher;
    public MenuItem mnuItemAddSchedule;
    public MenuItem mnuItemAddParent;
    public MenuItem mnuItemDeleteStudent;
    public MenuItem mnuItemDeleteTeacher;
    public MenuItem mnuItemDeleteSchedule;
    public MenuItem mnuItemDeleteParent;
    private StudentRepository studentRepository;//we make connection only once time
    private TeacherRepository teacherRepository;
    private ScheduleRepository scheduleRepository;
    private ParentRepository parentRepository;


    public void initialize() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Catalog");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        studentRepository = new StudentRepository(entityManager);
        teacherRepository = new TeacherRepository(entityManager);
        scheduleRepository = new ScheduleRepository(entityManager);
        parentRepository = new ParentRepository(entityManager);
    }

    public void saveStudent( ActionEvent actionEvent ) {
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

    public void deleteStudent( ActionEvent actionEvent ) {
       studentRepository.deleteById(1);

        System.out.println("Student deleted successfully");

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
        System.out.println("Teacher added successfully");

    }

    public void saveSchedule( ActionEvent actionEvent ) {

        Schedule schedule = new Schedule();
        schedule.setClassroom_name(txtClassRoomName.getText());
        schedule.setTeacher_name(txtTeacherName.getText());
        schedule.setLocation(txtLocationName.getText());
        schedule.setDate(dbkDateSchedule.getValue());
        LocalTime localTime = null;
        schedule.setStart(dbkStartDate.getValue());
        schedule.setEnd(dbkEndDate.getValue());
        schedule.setTime_slot(txtTimeSlot.getText());
        schedule.setDetails(txtDetails.getText());
        schedule.setDiscipline(txtDiscipline.getText());

        scheduleRepository.save(schedule);
        System.out.println("Schedule added successfully");

    }

    public void saveParent( ActionEvent actionEvent ) {

        Parent parent = new Parent();
        parent.setFirst_name(txtParentFirstName.getText());
        parent.setLast_name(txtParentLastName.getText());
        parent.setE_mail(txtParentEMail.getText());
        parent.setPhone(txtParentPhone.getText());


        parentRepository.save(parent);
        System.out.println("Parent added successfully");

    }

    public void openAddStudent( ActionEvent actionEvent ) {

    }

    public void openAddTeacher( ActionEvent actionEvent ) {

    }

    public void openAddSchedule( ActionEvent actionEvent ) {

    }

    public void openAddParent( ActionEvent actionEvent ) {

    }

    public void openDeteleStudent( ActionEvent actionEvent ) {
        deleteStudent(null);

    }

    public void openDeleteTeacher( ActionEvent actionEvent ) {

    }

    public void openDeleteSchedule( ActionEvent actionEvent ) {

    }

    public void openDeleteParent( ActionEvent actionEvent ) {

    }
}
