package com.olba.model;

import javax.persistence.*;

@Entity
@Table
public class Discipline {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String discipline_name;
    private int school_level;
    private String status;

    public Discipline( int id, String discipline_name, int school_level, String status ) {
        this.id = id;
        this.discipline_name = discipline_name;
        this.school_level = school_level;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getDiscipline_name() {
        return discipline_name;
    }

    public int getSchool_level() {
        return school_level;
    }


    public String getStatus() {
        return status;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public void setDiscipline_name( String discipline_name ) {
        this.discipline_name = discipline_name;
    }

    public void setSchool_level( int school_level ) {
        this.school_level = school_level;
    }

    public void setStatus( String status ) {
        this.status = status;
    }
}
