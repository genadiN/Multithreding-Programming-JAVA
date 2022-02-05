package com.example.homwork2;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

public class Zad2 extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, 300, 300);
        double width = scene.getWidth();
        double height = scene.getHeight();
        int widthInt = (int) width;
        int counter =0;
        for(int i = widthInt; i >= 0; i -= 20){
            //Line line = new Line(j, i, i, height);
            Line line = new Line(0, i, i, height);
            line.setStroke(Color.BLUE);
            line.setStrokeWidth(1);
            group.getChildren().add(line);
        }
        stage.setTitle("Lines");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
