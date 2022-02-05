package Parcell;

import Coffee.Coffee;

//a method that returns an anonymous inner class
public class Parcel6 {
    public Contents cont(){
       /* class MyContents implements  Contents{
            private int i = 11;
            public int value(){
                return i ;
            }
           return new MyContents();
        }*/
        return  new Contents() {
            private int i = 11;
            public int value() {
                return i;
            }
        };
        //semicolon required in this case
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        Contents c = p.cont();
    }
}

//Contents is created using a default constructor
//this is required for the above to compile


//or is required for the above to compile
//class Contents{
// itn value() { return 0; } }

