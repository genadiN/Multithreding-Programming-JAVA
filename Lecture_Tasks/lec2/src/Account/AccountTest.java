package Account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(50.00);
        Account account2 = new Account(-7.53);

        System.out.printf("account1 balance: $%.2f%n" ,
                account1.getBalance());
        System.out.printf("account2 balance: $%.2f%n" ,
                account2.getBalance());

        Scanner input = new Scanner( System.in );
        double depositAmount;

        System.out.print("Enter deposit amount for account1: ");
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf( "%n adding %.2f to account1 balance%n ",
                 depositAmount );
        account1.credit(depositAmount); // add to account1 balance

        // display balances
        System.out.printf("account1 balance: $%.2f%n" ,
                account1.getBalance());
        System.out.printf("account1 balance: $%.2f%n" ,
                account2.getBalance());

        System.out.print("Enter deposit amount or account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to account2 balance %n",
                depositAmount);
        account2.credit(depositAmount); // add to account2 balance

        // display balances
        System.out.printf("account1 balance: $%.2f %n" ,
                account1.getBalance());
        System.out.printf("account2 balance: $%.2f %n" ,
                account2.getBalance());
    }// end main
} // end class AccountTest
