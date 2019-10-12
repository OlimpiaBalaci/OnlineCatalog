package com.olba.model;

public class Student {
    private int id_pk_ai;
    private String first_name;
    private String last_name;
    private String e_mail;
    private String date_of_birth;
    private String phone;
    private String classroom;
    private String year;

    public Student(int id_pk_ai, String first_name, String last_name, String e_mail, String date_of_birth, String phone, String classroom, String year) {
       this.id_pk_ai = id_pk_ai;
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

    public int getId_pk_ai() {
        return id_pk_ai;
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

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public String getPhone() {
        return phone;
    }

    public String getClassroom() {
        return classroom;
    }

    public String getYear() {
        return year;
    }

    public void setId_pk_ai(int id_pk_ai) {
        this.id_pk_ai = id_pk_ai;
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

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
