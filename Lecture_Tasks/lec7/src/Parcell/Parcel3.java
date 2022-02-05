package Parcell;

import java.util.concurrent.Callable;

public class Parcel3 {
    private class PContents implements Contents{
        private int i = 11;
        public int value() { return i; }
    }
    protected class PDestination implements Destination{
        private String label;
        private PDestination(String whereTo) {
           label = whereTo;
        }
        public String readLabel(){return label; }
    }
    public Destination dest(String s){
        return new PDestination(s);
    }
    public Contents cont(){
        return new PContents();
    }
}

class Test{
    public static void main(String[] args) {
        Parcel3 p= new Parcel3();
        Contents c = p.cont();
        Destination d = p.dest("Tanzania" );
        //Illegal can not access private class
        //Parcel3.PContents pc = p.new PContents();
    }
}
