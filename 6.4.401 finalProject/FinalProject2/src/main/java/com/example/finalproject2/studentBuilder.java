package com.example.finalproject2;

import java.util.ArrayList;

public class studentBuilder {
    private String name;
    private String lastName;
    private Long id;
    private String field;
    private String email;
    private String username;
    private String password;
    private Long phone;
    private ArrayList <String> course;

    public studentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public studentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public studentBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public studentBuilder setField(String field) {
        this.field = field;
        return this;
    }

    public studentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public studentBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public studentBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public studentBuilder setPhone(Long phone) {
        this.phone = phone;
        return this;
    }

    public studentBuilder setCourse(ArrayList<String> course) {
        this.course = course;
        return this;
    }

    public studentBuilder createStudent() {
        return new studentBuilder().setName(name).setLastName(lastName).setId(id).
                setField(field).setEmail(email).setUsername(username).setPassword(password).
                setPhone(phone).setCourse(course).createStudent();
    }
}