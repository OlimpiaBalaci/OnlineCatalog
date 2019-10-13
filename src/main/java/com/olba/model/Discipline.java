package com.olba.model;

public class Discipline {
    private String discipline_name;
    private int school_level;
    private String status;

    public Discipline( String discipline_name, int school_level, String status ) {
        this.discipline_name = discipline_name;
        this.school_level = school_level;
        this.status = status;
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

    public void setDiscipline_name( String discipline_name ) {
        this.discipline_name = discipline_name;
    }

    public void setYear( int school_level ) {
        this.school_level = school_level;
    }

    public void setStatus( String status ) {
        this.status = status;
    }
}
