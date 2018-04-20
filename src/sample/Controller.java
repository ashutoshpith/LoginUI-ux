package sample;


import DBase.Conn;
import DBase.InteractDb;
import DBase.showUserInfo;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import jdk.nashorn.api.tree.PropertyTree;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller  implements Initializable {

    InteractDb interactDb=new InteractDb();



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
    private Arc arc;







    @FXML
    void ClickLogin(ActionEvent event) throws SQLException {
                if (interactDb.isLogin(usernameTxt.getText(),passTxt.getText())){
            passLabel.setText("login");


                    InteractDb interactDb=new InteractDb();
                    PreparedStatement preparedStatement=interactDb.preparedStatement;
                    ResultSet resultSet=interactDb.resultSet;
                    Connection connection=interactDb.connection;
            try {

                String sql = "SELECT * FROM login.users WHERE id=1";
                preparedStatement = connection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery();
                if(resultSet.next())
                {
                    userInfoLabel.setText(resultSet.getString("info"));
                    System.out.println("work");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

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




        RotateTransition rt = new RotateTransition(Duration.millis(3000), arc);
        rt.setByAngle(2*3.14*5);
        rt.setCycleCount(12);
        rt.setAutoReverse(true);

        rt.play();


    }
}
