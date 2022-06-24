package com.example.finalproject2;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;


public class StartPageController {

    private Stage stage;
    private Scene scene;

    @FXML
    public Button SendEmailBtn, secondSignUpBtn;
    public ProgressBar prgs;

    @FXML
    public Text nametxt,Lastnametxt, fieldtxt,phonetxt,emailtxt,usernametxt,passwordtxt,idtxt,datetxt;
    public TextField nameTXT,fieldTXT,LastnameTXT,phoneTXT,emailTXT,usernameTXT,passwordTXT,idTXT;
    public DatePicker dateTXT;

    @FXML
   public  TextField UsernameTXT,PasswordTXT,captchaTXT;
    public Text Usernametxt, Passwordtxt,captchatxt;
    public Button loginBtn;

    @FXML
    public Label captchaLbl;

    @FXML
    public TextField EmailTXT,EmailCTXT;
    public Text Emailtxt,EmailCtxt;



    public boolean signupCheckall(){
        SignUpCheck s = new SignUpCheck();
        boolean a = s.nameCheck(nameTXT, nametxt);
        boolean b = s.nameCheck(LastnameTXT, Lastnametxt);
        boolean c = s.nameCheck(fieldTXT,fieldtxt);
        boolean d = s.idCheck(idTXT, idtxt);
        boolean e = s.phoneCheck(phoneTXT,phonetxt);
        boolean f = s.usernameCheck(usernameTXT,usernametxt);
        boolean g = s.passwordCheck(passwordTXT, passwordtxt);
        boolean h = s.emailCheck(emailTXT,emailtxt);

        return (a && b && c && d && e && f && g && h);
    }

    public boolean loginCheckall(){

        loginCheck l =new loginCheck();
        boolean a2 = l.usernameCheck(UsernameTXT, Usernametxt);
        boolean b2 = l.passwordCheck(PasswordTXT, Passwordtxt);
        return (a2 && b2);
    }

    public boolean forgotCheckall(){
        forgotPaassword f =new forgotPaassword();

        boolean a = f.checkInput(EmailTXT,Emailtxt);

        return (a);
    }

    public void captcha()  {

    }

    @FXML
    protected void onLoginBtnClicked(ActionEvent event) throws IOException {

        if (loginCheckall()) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("StudentMainPnl.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
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

        if(signupCheckall()){
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
        if (forgotCheckall()) {
            prgs.setVisible(true);
            Timeline timeline = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(prgs.progressProperty(), 0)),
                    new KeyFrame(Duration.minutes(1), e -> {
                        prgs.setVisible(false);
                        System.out.println("Minute over");
                    }, new KeyValue(prgs.progressProperty(), 1))
            );
            timeline.setCycleCount(Animation.INDEFINITE);
            timeline.play();
        }
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
