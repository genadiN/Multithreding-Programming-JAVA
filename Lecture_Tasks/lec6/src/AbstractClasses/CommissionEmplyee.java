package AbstractClasses;

import CommissionEmployee.CommissionEmployee;

public class CommissionEmplyee extends Employee{
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    //five-argument constructor
    public CommissionEmplyee(String first, String last, String ssn,
                             double sales, double rate){
        super(first, last, ssn);
        setCommissionRate(rate);
        setGrossSales(sales);
    }

    //set commission rate
    public void setCommissionRate(double rate){
        commissionRate = ( rate > 0.0 && rate < 1) ? rate : 0.0;
    }//end method setCommissionRate

    //return commission rate
    public double getCommissionRate(){
        return commissionRate;
    }//end method getCommissionRate

    //set gross sales amount
    public void setGrossSales(double sales){
        grossSales = sales < 0.0 ? 0.0 : sales;
    }//end method setGrossSales

    //return gross sales amount
    public double getGrossSales(){
        return grossSales;
    }//end method getGrossSales

    //calculate earnings; override abstract method earnings in Employee
    public  double earnings(){
        return getCommissionRate() * getGrossSales();
    }//end method earnings

    //return String representation of CommissionEmployee object
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate" , getCommissionRate());
    }//end method toString

    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
