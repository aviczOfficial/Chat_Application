package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class UserLoginFormController {

    public TextField txtUsrNm;
    public AnchorPane UserLoginCT;
    static String userName;
    public JFXButton btLog;


    public void btnLogin(ActionEvent actionEvent) throws IOException {
        userName=txtUsrNm.getText();
        Stage stage = (Stage) txtUsrNm.getScene().getWindow();
        stage.close();
        Stage stage1=new Stage();
        stage1.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ChatRoomForm.fxml"))));
        stage1.setResizable(false);
        stage1.setTitle("Group Chat Application");
        stage1.centerOnScreen();
        stage1.show();

    }
}
