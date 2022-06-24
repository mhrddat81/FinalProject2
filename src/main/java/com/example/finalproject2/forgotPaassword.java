package com.example.finalproject2;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class forgotPaassword {

    @FXML
    TextField EmailTXT,EmailCTXT;
    Text Emailtxt,EmailCtxt;

    public boolean checkInput(TextField field, Text text){
       if (field.getText().length()==0){
           text.setText("Enter something");
           text.setVisible(true);
           return false;
       }
        text.setVisible(false);
       return true;
    }


}
