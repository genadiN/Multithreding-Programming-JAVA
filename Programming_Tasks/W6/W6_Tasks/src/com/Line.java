package com;

import com.Point;

public class Line extends Point {
    private static int idCounter = 1;
    public final String L_ID;
    private Point ePoint;

    // general- purpose constructor
    public Line(Point point, Point ePoint) {
        super(point);
        setePoint(ePoint);
        L_ID = String.format("%06d", idCounter++);
    }
    // default constructor
    public Line() {
        this(new Point(), new Point());
    }
    // copy constructor
    public Line(Line line) {
        this(line.getsPoint(), line.ePoint);
    }

    public final Point getePoint() {
// Point is reference mutable type
        return new Point(ePoint);
    }

    public final void setePoint(Point ePoint) {
// Point is reference mutable type
        this.ePoint = ePoint != null ? new Point(ePoint) : new Point();
    }

    // helper get method
    public final Point getPoint() {
// Point is reference mutable type
        return super.getsPoint();
    }

    // helper set method
    public final void setPoint(Point p) {
        if (p != null) {
            var c = p.getCoordinates();
// Point is reference mutable type
            super.setsPoint(p);
        }
        else{
            setCoordinates(new int[2]);
        }
    }

    public double measure(){
        var coord1 = super.getCoordinates();
        var coord2 = ePoint.getCoordinates();
        var xDelta = coord1[0] - coord2[0];
        var yDelta = coord2[1] - coord2[1];
        return Math.sqrt(xDelta * xDelta + yDelta * yDelta);
    }
    @Override
    public String toString() {
        return String.format("Line: sPoint= %s, ePoint = %s", super.toString(), ePoint);

    }
}