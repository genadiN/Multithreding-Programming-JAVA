package Account;

public class Account {
    private double balance; // instance variable that stores the balance

    //constructor
    public Account(double balance){
        if(balance > 0.0){
            this.balance = balance;
        }
    }

    // credit (void) an amount to the account
    public void credit(double amount){
        balance = balance + amount; // add amount to balance
    }// end method credit

    //return the account balance
    public double getBalance(){
        return balance;// gives the value of the balance to the calling method
    }// end method getBalance
}//end class Account
