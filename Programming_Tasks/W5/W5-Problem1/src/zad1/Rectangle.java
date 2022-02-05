package zad1;

import javafx.scene.Group;
import javafx.scene.shape.paint.Color;

public class Rectangle {
    private Point uPoint;
    private double width;
    private double height;

    public Rectangle() {
        this(new Point() , 1 , 1);
    }
    public Rectangle( Point uPoint , double width , double height){
        setuPoint(uPoint);
        setHeight(height);
        setWidth(width);
    }
   public Rectangle(Rectangle rectangle){
        this(new Point(rectangle.uPoint)
                , rectangle.getWidth() , rectangle.getHeight());
   }

    public void setuPoint(Point uPoint) {
        if(uPoint != null){
            this.uPoint = new Point(uPoint);
        }
        else{
            this.uPoint = new Point();
        }

    }

    public Point getuPoint() {
        return uPoint;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if( width > 0){
            this.width = width;
        }else{
            this.width = 1;
        }

    }

    public void setHeight(double height) {
        if( height > 0){
            this.height = height;
        }else{
            this.height = 1;
        }
    }

    public double getHeight() {
        return height;
    }

    public void draw(Group pane){
        javafx.scene.shape.Rectangle rectangle
                = new javafx.scene.shape.Rectangle(
                uPoint.getCoords()[0] , uPoint.getCoords()[1,
                width , height;
        );
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(1);

        pane.getChildren().add(rectangle);

    }

    public String toString(){
        return String.format("Upper left corner coordinates: "
                + "Width: %.2f" + "height: %.2f",
                uPoint, width , height);
    }
}
