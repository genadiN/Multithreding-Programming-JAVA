package Task4Lab5;

public class SavingAccountTest {
    public static void main(String[] args) {
        SavingsAccount object1 = new SavingsAccount(1 , 100 , 12345678 );
        System.out.println(object1);
        SavingsAccount object2 = new SavingsAccount(5 , 50 , 45678923);
        System.out.println(object2);
        object1.calculateMonthlyInterest();
        System.out.println("\n" + object1);
        object2.calculateMonthlyInterest();
        object1.isGreater(object2);

        System.out.println(object1);
        System.out.println(object2);

        object1.modifyInterestRate(6);
        object1.calculateMonthlyInterest();
        System.out.println("\n" + object1);

    }
}

