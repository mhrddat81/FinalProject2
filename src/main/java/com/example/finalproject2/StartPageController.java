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
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StartPageController {



    private Stage stage;
   private Scene scene;
   private Parent root;
    static double ii;


    @FXML
    public Label signUpMassage;
    public Button SendEmailBtn;
    public ProgressBar prgs;

    @FXML
    public Text nametxt,Lastnametxt, fieldtxt,phonetxt,emailtxt,usernametxt,passwordtxt,idtxt,datetxt;
    public TextField nameTXT,fieldTXT,LastnameTXT,phoneTXT,emailTXT,usernameTXT,passwordTXT,idTXT;
    public DatePicker dateTXT;



    private boolean nameCheck(TextField field, Text text){
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
       return true;
    }

    private boolean idCheck(TextField field, Text text){
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
        return true;
    }

    private boolean phoneCheck(TextField field,Text text){
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
        if (!(field.getText().length()==10 || field.getText().length()==6)){
            text.setText("invalid input");
            text.setVisible(true);
            return false;
        }
        return true;
    }

    private boolean usernameCheck(TextField field,Text text){
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
        return true;
    }

    private boolean passwordCheck(TextField field ,Text text) {
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
        return true;
    }

    private boolean emailCheck(TextField field,Text text){

        if (field.getText().length()==0){
            text.setText("enter something !");
            text.setVisible(true);
            return false;
        }
        return true;

    }

    public boolean checkall(){
        boolean a = nameCheck(nameTXT, nametxt);
        boolean b = nameCheck(LastnameTXT, Lastnametxt);
        boolean c = nameCheck(fieldTXT,fieldtxt);
        boolean d = idCheck(idTXT, idtxt);
        boolean e = phoneCheck(phoneTXT,phonetxt);
        boolean f = usernameCheck(usernameTXT,usernametxt);
        boolean g = passwordCheck(passwordTXT, passwordtxt);
        boolean h = emailCheck(emailTXT,emailtxt);


        return (a && b && c && d && e && f && g && h);

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

        if(checkall()){
            TextInputDialog dialog = new TextInputDialog("hello");
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("StartPage.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
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
