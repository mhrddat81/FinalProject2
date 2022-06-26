package com.example.finalproject2;

import java.sql.DriverManager;
import java.sql.*;


  class Connection {
    public static void insert(String tablename , String name2,String lastname1,String field1,String username1,
                              String password1,String id1,String email1,String phonenunmber1,String urlpic){
        try {
            //noinspection deprecation
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            java.sql.Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/finalprojectdatabase","root","");
            String sql = "INSERT  INTO "+tablename+"(firstname,lastName,field,username,password,id,email,phonenumber,pictureURL)values (?,?,?,?,?,?,?,?,?)";
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
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

     public static void load(String tablename,String subject,String input){
        /*
         try {
             //noinspection deprecation
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             java.sql.Connection connection = DriverManager.getConnection(
                     "jdbc:mysql://localhost:3306/finalprojectdatabase","root","");
             String sql = "SELECT * FROM "+tablename+" where "+subject+" = "+input;
             PreparedStatement stmt=connection.prepareStatement(sql);
             stmt.string();
             stmt.close();
             connection.close();
         } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
             throw new RuntimeException(e);
         }
     }

         */

         try{
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             java.sql.Connection connection = DriverManager.getConnection(
                     "jdbc:mysql://localhost:3306/finalprojectdatabase","root","");
             //get connection to database
             //create a statement
             PreparedStatement checkInfo = connection.prepareStatement("SELECT * FROM student where username naser1");
             //process result set
             checkInfo.executeQuery();
             System.out.println("complete");
         }
         catch(Exception e){
             e.printStackTrace();
         }
     }

     public static void main(String[] args) {
         Connection.load("student", "username","naser1");
     }
}
