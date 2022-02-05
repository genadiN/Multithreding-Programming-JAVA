package com.example.gettingstarted;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = new Group();
        stage.setTitle("Hello!");
        stage.setScene(new Scene(root , 300, 275));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}