package hellojdbc;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class criarconta {
    public void voltaLogin(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Stage primaryStage=new Stage();
        primaryStage.setTitle("Today's Tasks");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    public void retornalogin(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Stage primaryStage=new Stage();
        primaryStage.setTitle("Today's Tasks");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
