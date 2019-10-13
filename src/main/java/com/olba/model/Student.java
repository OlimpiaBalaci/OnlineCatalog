package com.olba.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String first_name;
    private String last_name;
    private String e_mail;
    private Date date_of_birth;
    private String phone;
    private String classroom;
    private int year;

    public Student( int id, String first_name, String last_name, String e_mail, Date date_of_birth, String phone, String classroom, int year) {
       this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.e_mail = e_mail;
        this.date_of_birth = date_of_birth;
        this.phone = phone;
        this.classroom = classroom;
        this.year = year;
    }
//a fost de tes
 /*   public String showStudent() {

        return first_name + " " + last_name + " " + e_mail + " " + date_of_birth + " " + phone + " " + classroom + " " + year;
    }*/

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

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public String getPhone() {
        return phone;
    }

    public String getClassroom() {
        return classroom;
    }

    public int getYear() {
        return year;
    }

    public void setId( int id ) {
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

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void setYear(int year) {
        this.year = year;
    }
}