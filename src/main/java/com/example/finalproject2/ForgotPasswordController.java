package com.example.finalproject2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ForgotPasswordController {

    public Button SendEmailBtn;

    @FXML
    public void onSendEmailBtnClicked() {
        SendEmailBtn.setText("Email sent");
        SendEmailBtn.setDisable(true);
    }
}
