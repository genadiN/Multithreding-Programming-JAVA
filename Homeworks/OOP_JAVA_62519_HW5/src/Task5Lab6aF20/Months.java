package Task5Lab6aF20;

import java.time.Month;

public enum Months {
    JAN("January" ) , FEB("February") , MAR("March"),
    APR("April") , MAY("May") , JUN("Juni"),
    JUL("July") , AUG("August"), SEP("September"),
    OCT("October") , NOV("November") , DEC("December");


    private String value;
    public static Months[] Month = {JAN , FEB , MAR , APR ,
     MAY, JUN , JUL , AUG , SEP , OCT , NOV , DEC};

    // Constructor with parameters
    Months(String value) {
       setValue(value);
    }

    // Getter
    public String getValue(){
        return value;
    }

    // Setter
    public void setValue(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s" , getValue());
    }
}
