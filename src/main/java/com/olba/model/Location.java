package com.olba.model;

public class Location {
    private String name; // classroom courses, lab classrom, gym etc

    public Location( String name ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }
}
