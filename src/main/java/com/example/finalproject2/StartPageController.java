package com.example.finalproject2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;


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

    public void captcha() throws FileNotFoundException {
        InputStream stream = new FileInputStream("\"C:\\Users\\ASUS\\Desktop\\codes\\FinalProject2\\captcha images\"");
        Image image = new Image(stream);
        ImageView imageView = new ImageView();
        imageView.setImage(image);
        captchaLbl.setGraphic(new ImageView(image));

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
