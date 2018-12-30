package app.controllers;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class LoginController {

    @FXML
    private JFXTextField txtHost;

    @FXML
    private JFXTextField txtUsername;

    @FXML
    private JFXPasswordField txtPassword;

    public void login(ActionEvent event) {
        System.out.println("Host: " + txtHost.getText());
        System.out.println("Password: " + txtPassword.getText());
        System.out.println("Username: " + txtUsername.getText());
        
    }

}
