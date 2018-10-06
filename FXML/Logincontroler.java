package hellojdbc;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Logincontroler {
    public void esqueceuSenhaClick(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("recu.fxml"));
        Stage primaryStage=new Stage();
        primaryStage.setTitle("Today's Tasks");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    public void criarContaClick(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("criarconta.fxml"));
        Stage primaryStage=new Stage();
        primaryStage.setTitle("Today's Tasks");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void entraConta(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("appgeral.fxml"));
        Stage primaryStage=new Stage();
        primaryStage.setTitle("Today's Tasks");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
