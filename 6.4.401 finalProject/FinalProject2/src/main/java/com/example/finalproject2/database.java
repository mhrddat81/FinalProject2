package com.example.finalproject2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;

import java.sql.DriverManager;
import java.sql.*;


public class database {
    Connection connection = null;
    public void connect(){
            try {
              Class.forName("com.mysql.jdbc.Driver").newInstance();
              connection =  DriverManager.getConnection(
                      "jdbc:mysql://localhost:3306/finalprojectdatabase","root","");
            } catch (InstantiationException e) {
              e.printStackTrace();
            } catch (IllegalAccessException e) {
              e.printStackTrace();
            } catch (ClassNotFoundException e) {
              e.printStackTrace();
            } catch (SQLException e) {
              e.printStackTrace();
            }
        }
    public void close(){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    public  void insert(String tablename , String name2,String lastname1,String field1,String username1,
                              String password1,String id1,String email1,String phonenunmber1,String urlpic){
        try {
            this.connect();
            //noinspection deprecation
             String sql = "INSERT  INTO "+tablename+"(firstname,lastName,field" +
                    ",username,password,id,email,phonenumber,pictureURL)" +
                    "values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt=connection.prepareStatement(sql);
            stmt.setString(1,name2);
            stmt.setString(2,lastname1);
            stmt.setString(3,field1);
            stmt.setString(4,username1);
            stmt.setString(5,password1);
            stmt.setString(6,id1);
            stmt.setString(7,email1);
            stmt.setString(8,phonenunmber1);
            stmt.setString(9,urlpic);
            stmt.executeUpdate();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        this.close();
    }
    public ObservableList<Person> getDBPerson() {
        String query = "SELECT * FROM student";
        ObservableList<Person> persons = FXCollections.observableArrayList();

        try(Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query))
        {
            while(result.next())
            {
                Person person = new Person(result.getString("username"), result.getString("password"));
                persons.add(person);
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return persons;
    }
    public int isvalid(String username,String pass){
        try {
            this.connect();
            boolean found=false;
            FilteredList<Person> filteredList = new FilteredList(this.getDBPerson());
            loop:for (Person person:filteredList) {
                if(person.username.equals(username)&&person.password.equals(pass)) {
                    return 2;
                }else if(person.username.equals(username)&&!person.password.equals(pass)) {
                    return 1;
                }
            }
            return 0;
        } catch ( Exception e) {
            throw new RuntimeException(e);
        }finally {
            this.close();
        }
    }

}
