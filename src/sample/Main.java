package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.setProperty("javax.net.ssl.trustStore", "D:\\RSI_PS6");
        System.setProperty("javax.net.ssl.trustStorePassword", "herbata");
        Parent root = FXMLLoader.load(getClass().getResource("../fxmls/sample.fxml"));
        System.out.println("a");
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
