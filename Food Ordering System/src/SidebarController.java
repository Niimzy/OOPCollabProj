package com.example.demonewproj;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class SidebarController {

    @FXML
    private Button button_1;

    @FXML
    private Button button_2;

    @FXML
    private Button button_3;

    @FXML
    private Button button_4;

    @FXML
    private AnchorPane form1;

    @FXML
    private AnchorPane form2;

    @FXML
    private AnchorPane form3;

    @FXML
    private AnchorPane form4;


    public void switchForm(ActionEvent event){

        if (event.getSource() == button_1){
            form1.setVisible(true);
            form2.setVisible(false);
            form3.setVisible(false);
            form4.setVisible(false);
        } else if (event.getSource() == button_2) {
            form1.setVisible(false);
            form2.setVisible(true);
            form3.setVisible(false);
            form4.setVisible(false);
        } else if (event.getSource() == button_3) {
            form1.setVisible(false);
            form2.setVisible(false);
            form3.setVisible(true);
            form4.setVisible(false);
        } else if (event.getSource() == button_4) {
            form1.setVisible(false);
            form2.setVisible(false);
            form3.setVisible(false);
            form4.setVisible(true);
        }

    }
}