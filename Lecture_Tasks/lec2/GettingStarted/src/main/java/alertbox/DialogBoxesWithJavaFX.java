package alertbox;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DialogBoxesWithJavaFX extends Application {
    private static Alert alert = new Alert(Alert.AlertType.INFORMATION);
    public static void messageDialog(String infoMessage, String titleBar, String headerMessage){
        alert.setTitle(titleBar);
        alert.setHeaderText(headerMessage);
        alert.setContentText(infoMessage);
        alert.showAndWait();
    }

    @Override
    public void start(Stage primaryStage){
        messageDialog("Welcome\nto\nJava",
                "Information Alert box", null);
        System.exit(0);
    }

    public static void main(String[] args) {
        launch();
    }
}