package com.example.finalproject2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class loginCheck {

    @FXML
    TextField UsernameTXT,PasswordTXT,captchaTXT;
    Text Usernametxt, Passwordtxt,captchatxt;
    Button loginBtn;

    public boolean usernameCheck(TextField field, Text text){
      if (field.getText().length()==0){
          text.setText("Enter something !");
          text.setVisible(true);
          return false;
      }
        text.setVisible(false);
      return true;
    }

    public boolean passwordCheck(TextField field,Text text){
        if (field.getText().length()==0){
            text.setText("Enter something !");
            text.setVisible(true);
            return false;
        }
        text.setVisible(false);
        return true;
    }



}
