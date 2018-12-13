package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    /**
     * Holds a reference to the resource folder of all fxml files
     */
    public static String VIEWS = "/views/";


    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(VIEWS + "login.fxml"));
            Scene scene = new Scene(root,600,800);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String []args) {
        launch(args);
    }
}
