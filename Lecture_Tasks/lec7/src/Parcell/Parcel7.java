package Parcell;

public class Parcel7 {
    private int counter = 2;
    public Wrapping wrap(int x , final String dest){
        return new Wrapping(x){
            private String label = dest;
            public int value(){
                return super.value() * counter;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Wrapping w = p.wrap(10,"Captured string");
    }
}
class Wrapping{
    private int i;
    public Wrapping(int x){i = x;}
    public int value(){return i;}
}
