import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1; // first number to compare
        int number2; // second number to compare

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        if(number1 == number2){
            System.out.printf("%d == %d%n" , number1 , number2);
        }
        if(number1 != number2){
            System.out.printf("%d != %d%n" , number1 , number2);
        }
        if(number1 < number2){
            System.out.printf("%d < %d%n" , number1 , number2);
        }
        if(number1 > number2){
            System.out.printf("%d > %d%n" , number1 , number2);
        }
        if(number1 <= number2){
            System.out.printf("%d <= %d%n" , number1 , number2);
        }
        if(number1 >= number2){
            System.out.printf("%d >= %d%n" , number1 , number2);
        }
    }
}
