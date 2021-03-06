package Time2;

public class Time2 {
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    //Time2 no argument constructor initializes each instance variable
    //to zero, ensures that TIme2 objects start in a consistent state
    public Time2(){
        this(0, 0 ,0); // invoke TIme2 constructor with three arguments
    }// end Time2 no argument constructor

    public Time2(int h){
        this(h , 0, 0); // invoke Time22 constructor with three arguments
    }//end Time2 one-argument constructor

    // Time2 constructor: hour and minute supplied, second defaulted to 0
    public Time2(int h , int m){
        this(h, m , 0);// invoke Time2 constructor with three arguments
    }//end Time2 two-argument constructor

    //time2 constructor:hour, minute and second supplied
    public Time2(int h , int m , int s){
        setTime(h, m ,s);// invoke settime to validate time
    }//end Time2 three-argument constructor

    //Time2 constructor : another Time2 object supplied
    public Time2(Time2 time){
        //invoke Time2 three argument constructor
        this(time.getHour() , time.getMinute() , time.getSecond());
    }//end Time2 constructor with a Time2 object

    //set methods
    //set a new time value using universal time: ensure that
    //the data remains consistent be setting invalid values to zero
    public void  setTime(int h , int m , int s){
        setHour( h ); // set the hour
        setMinute( m ); //set the minute
        setSecond( s ); // set the second
    }//end method setTime

    public void setHour(int h){
        hour = ( h >= 0 && h < 24  ) ? h : 0;
    }//end method setHour

    public void setMinute(int m){
        minute = (m >= 0 && m < 60) ? m : 0;
    }//end method setMinute

    public void setSecond(int s){
        second = (s >= 0 && s < 60 ) ? s : 0;
    }//end method setSecond

    //get methods
    //get hour value
    public int getHour(){
        return hour;
    }//end method getHour

    public int getMinute(){
        return minute;
    }//end method getMinute

    public int getSecond(){
        return second;
    }//end method getSecond

    public String toUniversalString(){
        return String.format(
                "%02d:%02d:%02d" , getHour() , getMinute(), getSecond());
    }//end method toUniversalString

    //convert to Stirng in standard-time format (H:MM:SS AM or PM)
    public String toString(){
        return String.format("%d:%02d:%02d %s",
                (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ,
                getMinute(), getSecond(), ( getHour() < 12 ) ? "AM" : "PM" );
    }//end method toString
}//end class Time2
