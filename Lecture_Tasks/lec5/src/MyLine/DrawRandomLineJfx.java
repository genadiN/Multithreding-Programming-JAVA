package MyLine;


import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.Random;

import static javafx.application.Application.launch;

public class DrawRandomLineJfx {
    private Random randomNumbers = new Random();
    private MyLine line[]; // array on lines;


    public void start (Stage primaryStage){
        Group root = new Group();
        Scene scene = new Scene(root, 500, 300);
        //create lines
        line = new MyLine[5 + randomNumbers.nextInt(5)];
        for(int counter = 0; counter < line.length; counter++){
            //generate random coordinates
            double x1 = randomNumbers.nextInt((int) scene.getWidth());
            double y1 = randomNumbers.nextInt((int) scene.getHeight());
            double x2 = randomNumbers.nextInt((int) scene.getWidth());
            double y2 = randomNumbers.nextInt((int) scene.getHeight());
            double penThickness = 10 * randomNumbers.nextDouble() + 0.5;
            //generate a randoom color
            Color color = Color.rgb(randomNumbers.nextInt(256),
                    randomNumbers.nextInt(256),randomNumbers.nextInt(256) );

            //add the line to the list of lines to be displayed
            line[counter] = new MyLine(x1, y1, x2, y2, color, penThickness);
            line[counter].draw(root);
        }//end for

        primaryStage.setTitle("Draw random lines");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
