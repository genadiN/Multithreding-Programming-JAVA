package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Input five digits numbers");
        number = input.nextInt();
        int originalNumber = number;
        if(number >= 10000 && number < 100000){
            int digit5 = number % 10;
            number /= 10;
            int digit4 = number % 10;
            number /= 10;
            int digit3 = number % 10;
            number /= 10;
            int digit2 = number % 10;
            int digit1 = number / 10;
            String resultString;
            if ( digit1 == digit5 && digit2 == digit4){
                resultString = String.format("The number %d is palindrome" , originalNumber);
            }else{
                resultString = String.format("The number %d is not palindrome" , originalNumber);
            }
            System.out.println(resultString);
        }
    }
}
