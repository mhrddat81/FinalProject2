package com.example.finalproject2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;



public class StartPageController {

   private Stage stage;
   private Scene scene;
   private Parent root;
    static double ii;


    @FXML
    public Label signUpMassage;
    public Button SendEmailBtn;
    public ProgressBar prgs;
    public Text FirstNameTxt,LastNameTxt,FieldTxt,phonetxt,emailtxt,usernametxt,passwordtxt,idtxt;
    public TextField nameTxt,fieldTxt,LastnameTxt,phoneTXT,emailTXT,usernameTXT,passwordTXT,idTXT;



    private boolean signUpCheck(TextField feild,Text text){    //name , last name , field
            text.setVisible(false);
            if(feild.getText().length()==0){
                text.setText("enter something");
                text.setVisible(true);
                return false;
            }
            if (feild.getText().length()>15){
                text.setText("must be less than 15 char");
                text.setVisible(true);
                return false;
            }
            for (int i = 0; i <feild.getText().length(); i++) {
                if(!Character.isLetter(feild.getText().charAt(i))) {
                    text.setText("must be letter");
                    text.setVisible(true);
                    return false;
                }
            }
            return true;
    }
    private boolean signUpCheckPasswordAndUsername(TextField field,Text text){     // username , password
        text.setVisible(false);
        if(fieldTxt.getText().length()==0) {
            text.setText("enter something");
            text.setVisible(true);
            return false;
        }

            if (fieldTxt.getText().length()<8||fieldTxt.getText().length()>12){
                text.setText("between 8 and 12 letters");
                text.setVisible(true);
                return false;
            }
        for (int i = 0; i <field.getText().length(); i++) {
            if(!(Character.isLetter(field.getText().charAt(i))||Character.isDigit(field.getText().charAt(i)))) {
                text.setText("must be letter or digit");
                text.setVisible(true);
                return false;
            }
        }
        text.setText("");
        text.setVisible(false);
            return true;

    }



    @FXML
    protected void onLoginBtnClicked(ActionEvent event)throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("StudentMainPnl.fxml")));
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    protected void onFirstSignUpBtnCLicked(ActionEvent event ) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("SignUpPage.fxml")));
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);

        stage.show();

    }

    @FXML
    protected void onForgotPasswordClicked(ActionEvent event)throws IOException{

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
        SignUpCheck check =new SignUpCheck();
        if(check.checkAll()){
            TextInputDialog dialog = new TextInputDialog("hello");
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("StartPage.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    public boolean checkall(){
        boolean b=true;
        b=signUpCheck(fieldTxt,FieldTxt);
        b=signUpCheck(LastnameTxt,LastNameTxt);
        b=signUpCheck(nameTxt,FirstNameTxt);
        b=signUpCheckPasswordAndUsername(usernameTXT, usernametxt);
        b=signUpCheckPasswordAndUsername(passwordTXT, passwordtxt);
        return signUpCheck(nameTxt,FirstNameTxt)&&signUpCheck(LastnameTxt,LastNameTxt)
                &&signUpCheck(fieldTxt,FieldTxt)&&signUpCheckPasswordAndUsername(passwordTXT, passwordtxt)
                &&signUpCheckPasswordAndUsername(usernameTXT, usernametxt);
    }

    @FXML
    protected void onSendEmailBtnClicked() {
        SendEmailBtn.setText("Email sent");
        prgs.setVisible(true);

    }

    @FXML
    protected void onSubmitBtnClicked(ActionEvent event)throws IOException{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("StartPage.fxml")));
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}
