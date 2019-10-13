package com.olba.model;

import java.util.Date;

public class Parent {
    private String first_name;
    private String last_name;
    private String e_mail;
    private String phone;
    private String classroom;

    public Parent( String first_name, String last_name, String e_mail, String phone, String classroom ) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.e_mail = e_mail;
        this.phone = phone;
        this.classroom = classroom;

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

    public String getClassroom() {
        return classroom;
    }


    public void setFirst_name( String first_name ) {
        this.first_name = first_name;
    }

    public void setLast_name( String last_name ) {
        this.last_name = last_name;
    }

    public void setE_mail( String e_mail ) {
        this.e_mail = e_mail;
    }


    public void setPhone( String phone ) {
        this.phone = phone;
    }

    public void setClassroom( String classroom ) {
        this.classroom = classroom;
    }


}
