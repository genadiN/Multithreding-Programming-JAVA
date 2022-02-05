package AbstractClasses;

import Payablee.Payable;

public abstract class Employee implements Payable {
    private String firstName;
    private String lastName;
    private String ssn;

    //three-argument constructor
    public Employee(String first, String last, String ssn){
        firstName = first;
        lastName = last;
        ssn = ssn;
    }//end three-argument constructor

    //set first name
    public void setFirstName(String first){
        firstName = first;
    }//end method setFirstName

    //return first name
    public String getFirstName(){
        return firstName;
    }//end method getFirstName

    //set last name
    public void setLastName(String last){
        if(last != null){
            lastName = last;
        }else{
            lastName = "No name";
        }
    }//end method setLastName

    //return last name
    public String getLastName(){
        return lastName;
    }//end method getLastName

    //set social security number
    public void setSocialSecurityNumber(String ssn){
        ssn = ssn;
    }//end method setSocialSecurityNumber

    //return social security number
    public String getSsn(){
        return ssn;
    }//end method getSocialSecurityNumber

    //abstract method override by subclasses
    public abstract double earnings();// no implementation here

    //return String representation of CommissionEmployee obejct
    public String toString(){
        return String.format("%s %s\nsocial security number: %s",
                getFirstName(), getLastName(), getSsn());
    }//end method toString
}
