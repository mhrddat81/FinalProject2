package com.example.finalproject2;

public class Person {
    public String name;
    public String lastName;
    public String field;
    public String phone;
    public String email;
    public String username;
    public String password;
    public String id;

    public Person(String username,String pass){
        this.password=pass;
        this.username=username;
    }

    public Person(String name,String lastName,String id,String field,String email,String username,String password,String phone){
        this.email=email;
        this.id=id;
        this.username=username;
        this.field=field;
        this.lastName=lastName;
        this.name=name;
        this.password=password;
        this.phone=phone;
    }
}
