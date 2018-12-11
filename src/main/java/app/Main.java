package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(new Pane(), 800, 600));
        primaryStage.show();
    }

    public static void main(String []args) {
        launch(args);
    }
}
