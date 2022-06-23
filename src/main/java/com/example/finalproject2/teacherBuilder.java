package com.example.finalproject2;

import java.util.ArrayList;

public class teacherBuilder {
    private String name;
    private String lastName;
    private Long id;
    private String field;
    private String email;
    private String username;
    private String password;
    private Long phone;
    private ArrayList<String> course;

    public teacherBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public teacherBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public teacherBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public teacherBuilder setField(String field) {
        this.field = field;
        return this;
    }

    public teacherBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public teacherBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public teacherBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public teacherBuilder setPhone(Long phone) {
        this.phone = phone;
        return this;
    }

    public teacherBuilder setCourse(ArrayList<String> course) {
        this.course = course;
        return this;
    }

    public teacherBuilder createTeacher() {
        return new teacherBuilder().setName(name).setLastName(lastName).setId(id).
                setField(field).setEmail(email).setUsername(username).setPassword(password).
                setPhone(phone).setCourse(course).createTeacher();
    }
}