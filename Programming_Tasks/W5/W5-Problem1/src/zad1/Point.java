package zad1;

public class Point {
    private double[] coords; // (x ,y)

    public Point(){
        this(new double[2]);
        // new double[]{0,0}
    }

    public Point(Point point){
       this(point.getCoords());
    }

    public Point(double[] point){
        setCoords(point);
    }

    public double[] getCoords(){
        double[] copy;
        // or coords.length
        copy = new double[2];
        for(int i = 0 ; i < copy.length ; i++){
            copy[i] = coords[i];
        }
        return copy;
    }

    public void setCoords(double[] coords){
        if(coords != null && coords.length == 2){
            this.coords =  new double[2];
            for(int i = 0 ; i < coords.length ; i++){
                // we can make validation
                // for positive coordinates;
                this.coords[i] = coords[i];
            }
        }else{
            this.coords = new double[2];
            // (0,0)
        }
        this.coords = coords;
    }

    @Override
    public String toString(){
        return String.format("(%.2f; %.2f)" ,
            coords[0] , coords[1]);
    }
}
