package com.olba.model;

public class Student {
    private String first_name;
    private String last_name;
    private String e_mail;
    private String date_of_birth;
    private String phone;
    private String classroom;
    private String year;

    public Student( String first_name, String last_name, String e_mail, String date_of_birth, String phone, String classroom, String year ) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.e_mail = e_mail;
        this.date_of_birth = date_of_birth;
        this.phone = phone;
        this.classroom = classroom;
        this.year = year;
    }
    public String showStudent() {

        return first_name + last_name;
    }
}
