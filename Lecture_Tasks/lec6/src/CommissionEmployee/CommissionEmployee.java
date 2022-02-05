package CommissionEmployee;

public class CommissionEmployee extends Object{
    private String firstName;
    private String lastName;
    private String  socialSecurityNumber;
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percent

    //five-argument construtor
    public CommissionEmployee(String first , String last, String ssn,
                              double sales , double rate){
        //implicit call to Objet constructor occurs here
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales(sales); // validate and store gross sales
        setCommissionRate(rate);// validate and store commission rate
    }//end five-argument CommissionEmployee constructor

    //set first name
    public void setFirstName(String first){
        if(first != null){
            firstName = first;
        }else{
            firstName = "No name";
        }
    }//end setFirstName method

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
        socialSecurityNumber = ssn;
    }//end method setSocialSecurityNumber

    //return social security number
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }//end method getSocialSecurityNumber

    //set commission rate
    public void setCommissionRate(double rate) {
        commissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
    }//end method setCommissionRate

    //return commission rate
    public double getCommissionRate(){
        return commissionRate;
    }//end method getCommissionRate

    //set gross sales method
    public void setGrossSales(double sales) {
        grossSales = sales < 0.0 ? 0.0: sales;
    }//end method setGrossSales

    //return gross sales amount
    public double getGrossSales(){
        return grossSales;
    }//end method getGrossSales

    //calculate earnings
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }//end method earnings

    //return String representation of CommissionEmployee obejct
    public String toString(){
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "commission employee", getFirstName(), getLastName(),
                "social security number" ,getSocialSecurityNumber(),
                "gross sales" , getGrossSales(),
                "commission rate", getCommissionRate());
    }//end method toString
}//end class CommissionEmployee
