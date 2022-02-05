package MyLine;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class MyLine {
    private final double x1; //  x coordinate of first endpoint
    private final double y1; // y coordinate of first endpoint
    private final double x2; // x coordinate of second endpoint
    private final double y2; // coordinate of second endpoint
    private final Color myColor; // color of this shape
    private final double thickness;

    //constructor with input values
    public MyLine(double x1, double y1, double x2, double y2, Color color, double thickness){
        this.x1 = x1; // set x coordinate of first endpoint
        this.y1 = y1; // set y coordinate of first endpoint
        this.x2 = x2; // set x coordinate of second endpoint
        this.y2 = y2 ; // set y coordinate of second endpoint
        this.thickness = thickness;
        myColor = color; // set the color
    }//end MyLine constructor

    public void draw (Group pane){
        Line line = new Line(x1, y1, x2, y2);
        line.setStroke(myColor);
        line.setStrokeWidth(thickness);
        pane.getChildren().add(line);
    }//end method draw
}//end class MyLine
