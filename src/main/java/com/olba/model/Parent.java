package com.olba.model;

import javax.persistence.*;

@Entity
@Table
public class Parent {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String first_name;
    private String last_name;
    private String e_mail;
    private String phone;
    private String classroom_name;

    public Parent(String first_name, String last_name, String e_mail, String phone, String classroom_name) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.e_mail = e_mail;
        this.phone = phone;
        this.classroom_name = classroom_name;

    }

    public Parent() {

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

    public String getClassroom_name() {
        return classroom_name;
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

    public void setClassroom_name(String classroom_name) {
        this.classroom_name = classroom_name;
    }


}
