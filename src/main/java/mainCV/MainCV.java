package mainCV;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainCV extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        VBox mainPane = FXMLLoader.load(getClass().getResource("/CV.fxml"));
        Scene scene = new Scene(mainPane);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("CV Dariusz Szmyciński");
    }
}
