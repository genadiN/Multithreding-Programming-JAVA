package Increment;

public class Increment {
    private int total = 0; // total of all increments
    private final int INCREMENT; // constant variable (uninitiazliee)

    //constructor initiazlizes final instance variable INCREMENT
    public Increment(int incrementValue){
        INCREMENT = incrementValue; // initialize constant variable (once)
    }//end Increment constructor

    //add INCREMENT to toal
    public void addIncrementToTotal(){
        total += INCREMENT;
    }//end method addIncrementToTotal

    ///return String representation of an Increment object's data
    public String toString(){
        return String.format("Total = %d\n" , total);
    }//end method toIncrementString
}//end class Increment
