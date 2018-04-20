package sample;

import DBase.Conn;
import DBase.InteractDb;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller  implements Initializable {

    InteractDb interactDb=new InteractDb();


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
    private Label userInfoLabel;

    @FXML
    private Label showConnectionLabel;



    @FXML
    void ClickLogin(ActionEvent event) throws SQLException {

        if (interactDb.isLogin(usernameTxt.getText(),passTxt.getText())){
            passLabel.setText("login");
        }else{
            passLabel.setText("not");
        }



    }





















    @Override
    public void initialize(URL location, ResourceBundle resources) {


            if (interactDb.isDatabaseConnected()){
            showConnectionLabel.setText("Connected");
            }else {
                showConnectionLabel.setText("not");
            }



    }
}
