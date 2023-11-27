package com.example.switchpage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class HelloController {

    @FXML
    private TextField login_email;
    @FXML
    private PasswordField login_password;
    @FXML
    private AnchorPane login_form;

    @FXML
    private Button login_page_btn;
    @FXML
    private TextField signup_Adressfield;
    @FXML
    private AnchorPane signup_form;

    @FXML
    private Button signup_page_btn;
    @FXML
    private Button signup_btn;
    @FXML
    private Button login_btn;
    @FXML
    private TextField signup_email;
    @FXML
    private PasswordField signup_password;

    @FXML
    private TextField signup_username;
    Alert alert = new Alert(Alert.AlertType.INFORMATION);


    public void switchForm(ActionEvent event) {
        if (event.getSource() == signup_page_btn) {
            signup_form.setVisible(true);
            login_form.setVisible(false);
        } else if (event.getSource() == login_page_btn) {
            signup_form.setVisible(false);
            login_form.setVisible(true);
        }
    }

    public void signup(ActionEvent event) {
        if (event.getSource() == signup_btn)
            signupValidation();

    }

    public void signupValidation() {
        if ( !signup_Adressfield.getText().isEmpty() && !signup_username.getText().isEmpty() && !signup_email.getText().isEmpty() && !signup_password.getText().isEmpty())
        {
            alert.setTitle("Accounted Created");
            alert.setHeaderText(null);
            alert.setContentText("welcome " + signup_username.getText());
            alert.showAndWait();
        }
        else {
           alert.setTitle("Enter complete details");
            alert.setHeaderText(null);
            alert.setContentText("credentials");
            alert.showAndWait();
        }
    }
    public void login(ActionEvent event){
        if (event.getSource() == login_btn)
            loginValidation();

    }
     public void loginValidation(){

if (login_password.getText().equals(signup_password.getText()) && login_email.getText().equals(signup_email.getText()) && !login_email.getText().isEmpty() && !login_password.getText().isEmpty()) {
    System.out.println("email adress = " + login_email.getText());
    System.out.println("password = " + login_password.getText());
    alert.setTitle("Welcome back");
    alert.setHeaderText(null);
    alert.setContentText("Welcome back user");
    alert.showAndWait();
} else
{
    alert.setTitle("enter details");
        alert.setHeaderText(null);
        alert.setContentText("invalid details");
        alert.showAndWait();
}
     }

}

