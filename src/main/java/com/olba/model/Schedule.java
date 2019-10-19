package com.olba.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Schedule {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String classroom_name;
    private String teacher_name;
    private String location;
    private LocalDate date;
    private LocalDate start;
    private LocalDate end;
    private String time_slot;
    private String details;
    private String discipline;

    public Schedule( String classroom_name, String teacher_name, String location, LocalDate date, LocalDate start, LocalDate end, String time_slot, String details, String discipline) {
        this.classroom_name = classroom_name;
        this.teacher_name = teacher_name;
        this.location = location;
        this.date = date;
        this.start = start;
        this.end = end;
        this.time_slot = time_slot;
        this.details = details;
        this.discipline = discipline;
    }

    public Schedule() {

    }


    public String getClassroom_name() {
        return classroom_name;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public String getTime_slot() {
        return time_slot;
    }

    public String getDetails() {
        return details;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setClassroom_name(String classroom_name) {
        this.classroom_name = classroom_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate( LocalDate date) {
        this.date = date;
    }

    public void setStart( LocalDate start) {
        this.start = start;
    }

    public void setEnd( LocalDate end) {
        this.end = end;
    }

    public void setTime_slot( String time_slot) {
        this.time_slot = time_slot;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
}
