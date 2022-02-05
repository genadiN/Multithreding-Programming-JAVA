package ThisTest;

public class ThisTest {
    public static void main(String[] args) {
        SimmpleTime time = new SimmpleTime(15, 30, 19);
        System.out.println(time.buildString());
    }//end main
}//end class ThisTest

class SimmpleTime{
    private int hour;
    private int minute;
    private int second;

    //if the constructor uses parameter names identical to
    // instance variable names the "this" reference is
    //required to distinguish between names
    public SimmpleTime(int hour, int minute , int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }//end SimpleTime constructor

    public String buildString(){
        return String.format("%24s: %s\n%24s: %s",
                "this.toUniversalString()" , this.toUniversalString(),
                "toUniversalString()" , toUniversalString());
    }//end method buildString

    //convert to string in universal time format(HH:MM:SS)
    public String toUniversalString(){
        //"this" is not required here to access instance variables,
        //because method does not have local variables with same
        //names as instance variables
        return String.format("%02d:%02d:%02d" ,
        this.hour, this.minute, this.second);
    }//ebd method toUniversalString
}// end class SimpleTime

