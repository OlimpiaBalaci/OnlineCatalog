package com.olba.model;

import javafx.scene.control.CheckBox;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Teacher {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String first_name;
    private String last_name;
    private String e_mail;
    private String phone;
    private String grade;
    private LocalDate hiringDate;
    private boolean status;

    public Teacher( String first_name, String last_name, String e_mail, String phone, String grade, LocalDate hiringDate, boolean status) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.e_mail = e_mail;
        this.phone = phone;
        this.grade = grade;
        this.hiringDate = hiringDate;
        this.status = status;
    }

    public Teacher() {

    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getE_mail() {
        return e_mail;
    }

    public String getPhone() {
        return phone;
    }

    public String getGrade() {
        return grade;
    }

    public LocalDate getHiringDate() {
        return hiringDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setHiringDate( LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }


}
