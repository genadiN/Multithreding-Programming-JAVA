package com;

import java.util.Arrays;

public class Point {
    private static int idCounter = 1;
    public final String P_ID;
    private int[] coordinates;

    //general- purpose constructor
    public Point(int[] coordinates) {
        setCoordinates(coordinates);
        P_ID = String.format("%06d", idCounter++);
    }

    // default constructor
    public Point() {
        this(new int[]{0, 0});
    }

    // copy constructor
    public Point(Point point) {
        this(point.coordinates);
    }

    // int[] reference mutable type
    public final int[] getCoordinates() {
// var temp = new int[coordinates.length];
// for (int i = 0; i < coordinates.length; i++) {
// temp[i] = coordinates[i];
// }
// return temp;
        return new int[]{coordinates[0], coordinates[1]};
    }

    public final void setCoordinates(int[] coordinates) {
// if (coordinates != null && coordinates.length ==2) {
// this.coordinates = new int[coordinates.length];
// for (int i = 0; i < coordinates.length; i++) {
// this.coordinates[i]= coordinates[i];
// }
// } else {
// this.coordinates = new int[2]; // [0,0]
// }
        this.coordinates = coordinates != null && coordinates.length == 2 ?
                new int[]{coordinates[0], coordinates[1]} :
                new int[2];
    }

    // helper get method
    public final Point getsPoint() {
// Point is reference mutable type
        return new Point(coordinates);
    }

    // helper set method
    public final void setsPoint(Point p) {
// Point is reference mutable type
        coordinates = p != null ?
                new int[]{p.coordinates[0], p.coordinates[1]} :
                new int[2];
    }

    @Override
    public String toString() {
        return String.format("Point %s: %s", P_ID,
                Arrays.toString(coordinates)
        );
    }
}