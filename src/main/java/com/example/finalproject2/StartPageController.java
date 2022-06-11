package com.example.finalproject2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class StartPageController {

   private Stage stage;
   private Scene scene;
   private Parent root;

    @FXML
    private Label welcomeLbl;
    @FXML
    protected void onLoginBtnClicked() {
        welcomeLbl.setText("login is activated!");
    }
    @FXML
    protected void onFirstSignUpBtnCLicked(ActionEvent event ) throws IOException {
        welcomeLbl.setText("signUp is activated!");
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("SignUpPage.fxml")));
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onForgotPasswordClicked(ActionEvent event)throws IOException{
        welcomeLbl.setText("forgot password is activated!");
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ForgotPassword.fxml")));
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onBackBtnClicked(ActionEvent event)throws IOException{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("StartPage.fxml")));
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onSecondSignUpBtnClicked(ActionEvent event)throws IOException{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("StartPage.fxml")));
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
