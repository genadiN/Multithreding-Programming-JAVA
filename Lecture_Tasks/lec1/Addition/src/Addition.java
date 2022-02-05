import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = 0 , number2 = 0; // declaring two numbers
        int sum = 0; // declaring sum of two numebrs;
        System.out.print("Enter first number: ");
        number1 = input.nextInt(); // read the first number from the user;

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("Sum is %d%n" , sum);
    }
}
