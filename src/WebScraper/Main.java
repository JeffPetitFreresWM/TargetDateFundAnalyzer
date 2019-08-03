package WebScraper;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Target Date Fund Analyzer");
        primaryStage.setScene(new Scene(root, 1000, 8000));
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}
