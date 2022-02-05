package AbstractClasses;

public class BasePlusCommissionEmployee extends CommissionEmplyee{
    private double baseSalary; // base salary per week

    //six-argument construtor
    public BasePlusCommissionEmployee(String first , String last, String ssn,
                                      double sales , double rate , double salary){
        //implicit call to Objet constructor occurs here
        super(first , last, ssn, sales, rate);
        setBaseSalary(salary);
    }//end five-argument CommissionEmployee constructor

    //set base salary
    public void setBaseSalary(double salary) {
        baseSalary = (salary < 0.0) ? 0.0 : salary;
    }//end method setBaseSalary

    //return base salaary
    public double getBaseSalary(){
        return baseSalary;
    }//end method getBaseSalary

    //calculate earnings; override method earnings in CommissionEmployee
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }//end method earnings

    //return String representation of CommissionEmployee obejct
    public String toString(){
        return String.format("%s %s\n%s: %.2f", "base salaried",
                super.toString(),"base salary", getBaseSalary()
        );
    }//end method toString
}
