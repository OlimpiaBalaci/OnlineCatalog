package com.olba.model;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table

public class Classroom {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String class_name;
    private String students_list;
    private String teachers_list;
    private Date year;

    public Classroom(int id, String class_name, String students_list, String teachers_list, Date year ) {
        this.class_name = class_name;
        this.students_list = students_list;
        this.teachers_list = teachers_list;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getClass_name() {
        return class_name;
    }

    public String getStudents_list() {
        return students_list;
    }

    public String getTeachers_list() {
        return teachers_list;
    }

    public Date getYear() {
        return year;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClass_name(String class_name ) {
        this.class_name = class_name;
    }

    public void setStudents_list( String students_list ) {
        this.students_list = students_list;
    }

    public void setTeachers_list( String teachers_list ) {
        this.teachers_list = teachers_list;
    }

    public void setYear( Date year ) {
        this.year = year;
    }
}
