package Task4Lab5;

public class SavingsAccount {
    private int mAnnualInterestRate;
    private int mSavingsBalance;
    private int mNumber;

    // Default constructor
    public SavingsAccount(){
        mAnnualInterestRate = 0;
        this.mSavingsBalance = 0;
        this.mNumber = 0;
    }

    // Constructor with parameters
    public SavingsAccount(int rate , int balance , int number){
        setmAnnualInterestRate(rate);
        setmSavingsBalance(balance);
        setmNumber(number);
    }

    // Copy constructor
    public SavingsAccount(SavingsAccount account){
       mAnnualInterestRate = account.getmAnnualInterestRate();
        this.mSavingsBalance = account.mSavingsBalance;
        this.mNumber = account.mNumber;
    }

    // Getters
    public int getmAnnualInterestRate(){
        return mAnnualInterestRate;
    }

    public int getmSavingsBalance(){
        return mSavingsBalance;
    }

    public int getmNumber(){
        return mNumber;
    }

    // Setters
    public void setmAnnualInterestRate(int rate){
        mAnnualInterestRate = rate;
    }

    public void setmSavingsBalance(int balance){
        this.mSavingsBalance = balance;
    }

    public void setmNumber(int mNumber){
        this.mNumber = mNumber;
    }

    // Calculate monthly interest and add to the balance
    public void calculateMonthlyInterest(){
        int newRate= getmSavingsBalance() * mAnnualInterestRate / 12;
        this.mSavingsBalance += newRate;
    }

    // Change interest rate
    public  void modifyInterestRate(int newRate){
        this.mAnnualInterestRate = newRate;
    }

    public void isGreater(SavingsAccount acc){
        System.out.println(
            Integer.compare(getmSavingsBalance() , acc.getmSavingsBalance() ) );
    }

    public String toString(){
        return String.format("Rate and balance in the account are:" + " %d  %d" ,
                mAnnualInterestRate , getmSavingsBalance());
    }
}
