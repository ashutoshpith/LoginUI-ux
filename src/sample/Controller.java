package sample;

import DBase.Conn;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller  implements Initializable {



    @FXML
    private Circle circleBox;

    @FXML
    private Label userLabel;

    @FXML
    private Label passLabel;

    @FXML
    private JFXTextField usernameTxt;

    @FXML
    private JFXTextField passTxt;

    @FXML
    private JFXButton loginBtn;

    @FXML
    void ClickLogin(ActionEvent event) {
        Conn conn=new Conn();
        conn.isConnected();

        

    }





















    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
