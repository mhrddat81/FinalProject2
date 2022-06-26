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
/*
    public boolean submit(TextField field1,TextField field2, Text text, Text text2){
        if (checkInput(field1, text)){
            if (field2.getText().length()==0){
                text2.setText("Enter something");
                text2.setVisible(true);
                return false;
            }
            text2.setVisible(false);
            return true;
        }
        return false;
    }
 */
}
