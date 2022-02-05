package Parcell;

//example shows how you can nest an inner class
//within any arbitrary scope
public class Parcel5 {
    private void internalTracking(boolean b){
        if(b){
            class TrackingSlip{
                private String id;
                TrackingSlip(String s){
                    id = s;
                }
                String getSlip(){ return id; }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
        // can not use it here! Out of scope
        // ! TrackingSlip ts  = new TrackingSLip("x");
    }
    public void track(){internalTracking(true);  }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        p.track();
    }
}
//class TrackingSlip is nested inside the scope of an if statement
//it is not available outside the scope in which it is defined
