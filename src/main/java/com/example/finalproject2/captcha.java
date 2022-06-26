package com.example.finalproject2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.util.Objects;

public class captcha {

    @FXML
    public Label captchaLbl;
    public TextField captchaTXT;
    public Text captchatxt;

    Image image14518 =new Image(Objects.requireNonNull(getClass().getResourceAsStream("\"C:\\Users\\ASUS\\Pictures\\Saved Pictures\\14518.png\"")));
    Image image = new Image(getClass().getResourceAsStream("14518.png"));

    public void setCaptcha(Image image){
        captchaLbl.setGraphic(new ImageView(image));
    }

    public boolean captchaCkeckall(TextField field,Text text){
        if (!("image"+field.getText()).equals("image14518")){
            text.setText("Wrong input");
            text.setVisible(true);
            return false;
        }
        text.setVisible(false);
        return true;
    }


}
