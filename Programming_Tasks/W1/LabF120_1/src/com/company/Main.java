package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input '1' for 'celsius or '2' for 'fahrenheit' ");
        int temperature = scanner.nextInt();
        if(temperature == 1 ){
            double cel , fah ;
            System.out.println("Enter Celsius temperature: ");
            cel = scanner.nextDouble();
            fah = 9.0 / 5 * (cel ) + 32;
            System.out.printf("Temperature to fahrenheit is equal to %.2f" , fah );
        }else if( temperature == 2 ){
            double fahrenheit = 0.0 ;
            System.out.println("Enter Fahrenheit temperature: ");
            fahrenheit = scanner.nextDouble();
            double celsius = (5.0 / 9.0) * (fahrenheit - 32);
            System.out.println(fahrenheit + " fahrenheit is equal to " + celsius  + " celsius");
        }
    }
}
