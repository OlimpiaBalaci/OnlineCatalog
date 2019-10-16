package com.olba.model;

import javax.persistence.*;

@Entity
@Table
public class Grade {

    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int grade;
    private String discipline;

    public Grade(int grade, String discipline) {
        this.grade = grade;
        this.discipline = discipline;
    }

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
}