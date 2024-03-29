package com.olba.model;

import javax.persistence.*;

@Entity
@Table
public class Message {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String parent_name;
    private String teacher_name;
    private String message;
    private String classroom_name;

    public Message(String parent_name, String teacher_name, String message, String classroom_name) {
        this.parent_name = parent_name;
        this.teacher_name = teacher_name;
        this.message = message;
        this.classroom_name = classroom_name;
    }

    public int getId() {
        return id;
    }

    public String getParent_name() {
        return parent_name;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public String getMessage() {
        return message;
    }

    public String getClassroom_name() {
        return classroom_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setParent_name(String parent_name) {
        this.parent_name = parent_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setClassroom_name(String classroom_name) {
        this.classroom_name = classroom_name;
    }
}
