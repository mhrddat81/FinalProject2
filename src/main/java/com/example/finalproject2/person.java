package com.example.finalproject2;

public class person {
    public String name;
    public String lastName;
    public String field;
    public long phone;
    public String email;
    public String username;
    public String password;
    public long id;


    public person(String name,String lastName,Long id,String field,String email,String username,String password,Long phone){
        this.email=email;
        this.id=id;
        this.field=field;
        this.lastName=lastName;
        this.name=name;
        this.password=password;
        this.phone=phone;
        this.username=username;
    }
}
