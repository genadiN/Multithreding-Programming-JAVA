package Date;

public class Date {
    private int month; // 1 -12
    private int day; // 11-31 based on month
    private int year; // any year

    //constructor call checkMonth to confirm proper value for month
    //call checkDay to confirm proper value for day
    public Date(int theMonth, int theDay, int theYear){
        month = checkMonth( theMonth);// validate month
        year = theYear; // validate the year;
        day = checkDay(theDay); /// validate the day

        System.out.printf("Date object constructor for date %s\n", this);
    }//end Date constructor

    //utility method to confirm proper month value
    private int checkMonth(int month){
        if(month > 0 && month < 12){
            return month;
        }else{ // mpnth is invalid
            System.out.printf(
                    "Invalid month (%d) set to 1.", month);
            return 1; // maintain object in consistent state
        }//end else
    }//end method checkMonth

    //utility method to confirm proper day value based on month and year
    private int checkDay(int day){
        int daysPerMonth[] ={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //check if day in range for month
        if( day > 0 && day <= daysPerMonth[month] ){
            return day;
        }

        //check for leap year
        if(month == 2 && day == 29 && (year % 400 == 0 ||
                (year %4 == 0 && year %100 != 0) ) ){
            return day;
        }//end if

        System.out.printf("Invalid day(%d) set to 1", day);
        return 1; // maintain object in consistent state
    }//end method checkDay

    //return a String of the form month/day/year
    public String toString(){
        return String.format("%d/%d/%d" , month , day , year);
    }//end method toString
}//end class Date
