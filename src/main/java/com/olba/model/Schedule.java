package com.olba.model;

import java.util.Date;

public class Schedule {
    private String classroom_id;
    private String teacher_name;
    private String location;
    private Date date;
    private Date start;
    private Date end;
    private int time_slot;
    private String details;
    private String discipline;

    public Schedule( String classroom_id, String teacher_name, String location, Date date, Date start, Date end, int time_slot, String details, String discipline ) {
        this.classroom_id = classroom_id;
        this.teacher_name = teacher_name;
        this.location = location;
        this.date = date;
        this.start = start;
        this.end = end;
        this.time_slot = time_slot;
        this.details = details;
        this.discipline = discipline;
    }

    public String getClassroom_id() {
        return classroom_id;
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

    public void setClassroom_id( String classroom_id ) {
        this.classroom_id = classroom_id;
    }

    public void setTeacher_name( String teacher_name ) {
        this.teacher_name = teacher_name;
    }

    public void setLocation( String location ) {
        this.location = location;
    }

    public void setDate( Date date ) {
        this.date = date;
    }

    public void setStart( Date start ) {
        this.start = start;
    }

    public void setEnd( Date end ) {
        this.end = end;
    }

    public void setTime_slot( int time_slot ) {
        this.time_slot = time_slot;
    }

    public void setDetails( String details ) {
        this.details = details;
    }

    public void setDiscipline( String discipline ) {
        this.discipline = discipline;
    }
}
