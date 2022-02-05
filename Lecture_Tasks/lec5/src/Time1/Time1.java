package Time1;

public class Time1 {
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    //set a new time value using universal time : ensure that
    // the data remains consistent b setting invalid values to zero
    public void setTime(int h , int m , int s){
        hour = ( (h >= 0 && h < 24) ? h : 0 ); // valudate
        minute = ((m >= 0 && m < 60) ? m : 0 );
        second = ( (s >= 0 && s < 60 )? s :0 );
    }//end method setTime

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d" , hour, minute, second);
    }///end method toUniversalString

    //convert toString in standard time format (H:MM:SS or PM)
    public String toString(){
        return String.format("%d:%02d:%02d %s",
                ( (hour == 0 || hour == 12)? 12 : hour % 12 ),
                minute,second,(hour < 12 ? "AM" : "PM") );
    }//end method toString
}//end class Time1
