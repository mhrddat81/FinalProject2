package com.example.finalproject2;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

public class SignUpCheck {

    @FXML
    public Text nametxt,Lastnametxt, fieldtxt,phonetxt,emailtxt,usernametxt,passwordtxt,idtxt,datetxt;
    public TextField nameTXT,fieldTXT,LastnameTXT,phoneTXT,emailTXT,usernameTXT,passwordTXT,idTXT;
    public DatePicker dateTXT;



    public boolean nameCheck(TextField field, Text text){

        if (field.getText().length()==0){
            text.setText("enter Something !");
            text.setVisible(true);
            return false;
        }
        else if(field.getText().length()>12){
            text.setText(" Too long !");
            text.setVisible(true);
            return false;
        }
        else if (field.getText().length()<3){
            text.setText(" Too short !");
            text.setVisible(true);
            return false;
        }
        for (int i = 0; i < field.getText().length(); i++) {
            if (!Character.isLetter(field.getText().charAt(i))) {
                text.setText("Only letters !");
                text.setVisible(true);
                return false;
            }
        }
        text.setVisible(false);
        return true;

    }

    public boolean idCheck(TextField field, Text text){
        if (field.getText().length()==0){
            text.setText("enter Something");
            text.setVisible(true);
            return false;
        }
        else if(field.getText().length()>12){
            text.setText("ID is too long");
            text.setVisible(true);
            return false;
        }
        else if (field.getText().length()<3){
            text.setText("ID is too short");
            text.setVisible(true);
            return false;
        }
            for (int i = 0; i < field.getText().length(); i++) {
                if (!Character.isDigit(field.getText().charAt(i))) {
                    text.setText("Only Numbers !");
                    text.setVisible(true);
                    return false;
                }
            }
        if (!(field.getText().length()==10 || field.getText().length()==6)){
            text.setText("invalid input");
            text.setVisible(true);
            return false;
        }
        text.setVisible(false);
        return true;
    }

    public boolean phoneCheck(TextField field,Text text){
        if (field.getText().length()==0){
            text.setText("enter Something !");
            text.setVisible(true);
            return false;
        }
        for (int i = 0; i < field.getText().length(); i++) {
            if (!Character.isLetter(field.getText().charAt(i))) {
                text.setText("only Numbers");
                text.setVisible(true);
                return false;
            }
        }
        for (int i = 0; i < field.getText().length(); i++) {
            if (!Character.isDigit(field.getText().charAt(i))) {
                text.setText("Only Numbers !");
                text.setVisible(true);
                return false;
            }
        }

        text.setVisible(false);
        return true;
    }

    public boolean usernameCheck(TextField field,Text text){
        if (field.getText().length()==0){
            text.setText("enter Something !");
            text.setVisible(true);
            return false;
        }
        else if(field.getText().length()>12){
            text.setText(" Too long !");
            text.setVisible(true);
            return false;
        }
        else if (field.getText().length()<3){
            text.setText(" Too short !");
            text.setVisible(true);
            return false;
        }
        text.setVisible(false);
        return true;
    }

    public boolean passwordCheck(TextField field ,Text text) {
        if (field.getText().length() == 0) {
            text.setText("enter Something !");
            text.setVisible(true);
            return false;
        }
        if (field.getText().length() < 4) {
            text.setText("Too short !");
            text.setVisible(true);
            return false;
        }
        text.setVisible(false);
        return true;
    }

    public boolean emailCheck(TextField field,Text text){

        if (field.getText().length()==0){
            text.setText("enter something !");
            text.setVisible(true);
            return false;
        }
        text.setVisible(false);
        return true;

    }







}
