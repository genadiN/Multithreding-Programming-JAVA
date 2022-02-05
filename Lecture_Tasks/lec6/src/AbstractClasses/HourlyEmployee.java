package AbstractClasses;

public class HourlyEmployee extends Employee{
    private double wage; // wage per hour
    private double hours; // hours worked for week

    //five argument constructor
    public HourlyEmployee(String first, String last, String ssn,
                          double hourlyWage, double hoursWorked){
        super(first , last , ssn);
        setWage(hourlyWage); // validate hourly wage
        setHours( hourlyWage); // validate hours worked
    }//end five-ergument HourlyEmployee constructor

    //set wage
    public void setWage(double hourlyWage) {
        wage = (hourlyWage < 0.0) ? 0 : hourlyWage;
    }//end method setWage

    //return wage
    public double getWage(){
        return wage;
    }//end method getWage

    //set hours worked
    public void setHours(double hourlyWorked) {
        hours = (hourlyWorked >= 0.0  && hourlyWorked <= 168.0) ? hourlyWorked : 0.0;
    }//end method setHours

    //return hours worked
    public double getHours(){
        return hours;
    }//end method getHours

    //calculate earnings; override abstract method earnings in Employee
    public double earnings(){
        if(getHours() <= 40) { // no overtime
            return  getHours() * getWage();
        }else{
            return 40 * getWage() + (getHours() - 40) * getWage()* 1.5;
        }//end else
    }//end method earnings

    ///return String representation of hourlyEmployee object
    public String toString(){
        return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWage(),
                "hours worked", getHours());
    }//end method toString

    @Override
    public double getPaymentAmount() {
        return 0;
    }
}//end class HourlyEmployee
