package com.olba.model;

public class Grade {

    private int grade;
    private String discipline;

    public Grade( int grade, String discipline ) {
        this.grade = grade;
        this.discipline = discipline;
    }


    public int getGrade() {
        return grade;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setGrade( int grade ) {
        this.grade = grade;
    }

    public void setDiscipline( String discipline ) {
        this.discipline = discipline;
    }
}