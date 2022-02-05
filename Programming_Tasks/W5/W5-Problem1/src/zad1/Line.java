package zad1;

public class Line {
    private Point sPoint;
    private Point ePoint;

    public Line(){
        this(new Point() ,new Point(new double[]{10,10}));
    }

    public Line(Point sPoint , Point ePoint){
        setePoint(ePoint);
        setsPoint(sPoint);
    }

    public Line(Line line){
        this(new Point(line.sPoint) , new Point(line.ePoint));
    }
    public void setsPoint(Point ePoint){
        if(sPoint == null){
            this.sPoint = new Point();
        }else{
            this.sPoint = new Point(sPoint);
        }
    }
    public Point getePoint(){
        return ePoint;
    }

    public void setePoint(Point ePoint){
        if(ePoint == null){
            this.ePoint = new Point();
        }else{
            this.ePoint = new Point(ePoint);
        }
    }

    public void draw(Group name){
        javafx.scene.shape.Line line = new javafx.scene.shape.Line(
                sPoint.getCoords()[0],
                sPoint.getCoords()[1],
                ePoint.getCoords()[0],
                ePoint.getCoords()[1],
        );
        // we use color and width as default;
        pane.getChildren().add(line);
    }

    @Override
    public String toStirng(){
        return String.format("Line startingpoint: %s: " +
                "Line ending point: %s"
                , sPoint.toString() , ePoint.toString());
    }
}

