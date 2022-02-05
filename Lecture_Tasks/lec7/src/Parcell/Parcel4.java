package Parcell;

public class Parcel4 {
    public Destination dest(String s){
        //inner class in a method
        class PDestination implements Destination{
            private String label;
            private PDestination(String whereTo){
                label = whereTo;
            }
            public String readLabel() {return label;}

        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Destination d = p.dest("Tanzania");
    }
}
//PDestination cannot be accessed outside of dest()
//Upcasting occurs in the return statement-
//nothing comes out of dest() except
// a reference to Destination,
//the base class
