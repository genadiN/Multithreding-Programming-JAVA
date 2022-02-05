package Date;

public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    private static int count = 0;

    //constructor to initialize name, birthdate and hire date
    public Employee(String first, String last, Date birth, Date hire ){
        firstName = first;
        lastName = last;
        birthDate = birth;
        hireDate = hire;
        count++;
        System.out.printf("Empployee constructor: %s %s : count = %d\n",
                firstName, lastName, count);
    }//end employee constructor

    //substract 1 from static count when garbage
    //collector calls finalize to clean up object;
    //confirm that finalize was calles
    protected void finalize(){
        count--; // decrement static count of employees
        System.out.printf("Employee finalizer: 5s %s; count = %d\n",
                firstName, lastName, count);
    }//end method finalize

    //get first name
    public String getFirstName(){
        return firstName;
    }//end method getFirstName

    //get last name
    public String getLastName(){
        return lastName;
    }//end method getLastName

    //static method to get static count value
    public static int getCount(){
        return count;
    }//end method getCount

    //convert Employee to String format
    public String toString(){
        return String.format("%s, %s    Hired: %s   Birthday: %s" ,
                lastName, firstName, hireDate, birthDate);
    }//end method toString


}//end class Employee
