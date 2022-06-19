package com.example.finalproject2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUpCheck {
    @FXML
    public Label signUpMassage;
    public Button SendEmailBtn;
    public ProgressBar prgs;
    public Text FirstNameTxt,LastNameTxt,FieldTxt,phonetxt,emailtxt,usernametxt,passwordtxt,idtxt;
    public TextField nameTxt,fieldTxt,LastnameTxt,phoneTXT,emailTXT,usernameTXT,passwordTXT,idTXT;

    public boolean checkAll(){
        boolean a=NameAndFieldCheck(nameTxt,FirstNameTxt);
        boolean b=NameAndFieldCheck(LastnameTxt, LastNameTxt);
        boolean c=NameAndFieldCheck(fieldTxt, FieldTxt);
        boolean d=PhoneCheck(phoneTXT, phonetxt);
        boolean e=PasswordCheck(passwordTXT, passwordtxt, usernameTXT, usernametxt);
        boolean f=EmailCheck(emailTXT, emailtxt);
        boolean g=IdCheck(idTXT,idtxt);

       return (a && b && c && d && e && f && g);
    }

    public boolean NameAndFieldCheck(TextField field, Text text){
        text.setVisible(false);
        if (field.getText()==null){
            text.setVisible(true);
            text.setText("Enter Something");
            return false;
        }
        else if (field.getText().length()>15){
            text.setVisible(true);
            text.setText("Less than 15 digits");
            return false;
        }
        else if (field.getText().length()<2){
            text.setVisible(true);
            text.setText("More than 3 digits");
            return false;
        }
        return true;
    }

    public boolean PhoneCheck(TextField field, Text text){
        text.setVisible(false);
        Pattern pattern =Pattern.compile("(0)?[9][0-9]{9}");
        Matcher match = pattern.matcher(field.getText());
        if (field.getText().length()!=11){
            text.setVisible(true);
            text.setText("Must be 11 digits");
            return false;
        }
        else if (!match.find() && match.group().equals(field.getText())){
            text.setVisible(true);
            text.setText("Number not valid");
            return false;
        }
        return true;
    }

    public boolean PasswordCheck(TextField passwordTXT, Text passwordtxt,TextField usernameTXT,Text usernametxt){
        passwordtxt.setVisible(false);
        if (passwordTXT.getText().length()<8){
            passwordtxt.setText("more than 8 char");
            passwordtxt.setVisible(true);
            return false;
        }

        if (usernameTXT.getText().length()<4||usernameTXT.getText().length()>15){
            usernametxt.setVisible(true);
            usernametxt.setText("between 8 and 15 char");
            return false;
        }
        return true;
    }

    public boolean EmailCheck(TextField emailTXT,Text emailtxt){
        emailtxt.setVisible(false);
       if(Pattern.compile("^(.+)@(\\S+)$").matcher(emailTXT.getText()).matches()) {
           emailtxt.setVisible(true);
           emailtxt.setText("invalid email");
           return false;
       }
       return true;
    }

    public boolean IdCheck(TextField idTXT,Text idtxt){
        idtxt.setVisible(false);
        if (idTXT.getText().length()==0){
            idtxt.setText("Enter something");
            return false;
        }
        else if (!(idTXT.getText().length()==10 ||idTXT.getText().length()==6)){
            idtxt.setText("invalid Id");
            return false;
        }
        return true;
    }




}
