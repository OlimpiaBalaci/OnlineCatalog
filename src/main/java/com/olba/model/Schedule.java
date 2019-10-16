package com.olba.model;

import javax.persistence.*;
import java.util.Date;

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
    private Date date;
    private Date start;
    private Date end;
    private int time_slot;
    private String details;
    private String discipline;

    public Schedule(String classroom_name, String teacher_name, String location, Date date, Date start, Date end, int time_slot, String details, String discipline) {
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

    public String getClassroom_name() {
        return classroom_name;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public String getLocation() {
        return location;
    }

    public Date getDate() {
        return date;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public int getTime_slot() {
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

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public void setTime_slot(int time_slot) {
        this.time_slot = time_slot;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
}
