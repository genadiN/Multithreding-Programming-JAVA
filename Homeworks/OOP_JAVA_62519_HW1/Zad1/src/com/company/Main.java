package com.company;

public class Main {
    public static void main(String[] args) {
        double counterAllNumbers = 0 , counterDividingBy12 = 0;
        int startNumber = 0;
        for(int i = 30000 ; i < 100000; i++){
            startNumber = i;
            if(startNumber % 10 >= 6 && startNumber % 10 <= 9) {
                startNumber /= 10;
                if (startNumber % 10 >= 1 && startNumber % 10 <= 6) {
                    startNumber /= 10;
                    if (startNumber % 10 >= 4 && startNumber % 10 <= 9) {
                        startNumber /= 10;
                        if (startNumber % 10 >= 2 && startNumber % 10 <= 8) {
                            if (startNumber / 10 >= 3 && startNumber / 10 <= 9) {
                                counterAllNumbers++;
                                if (i % 12 == 0) {
                                    counterDividingBy12 = counterDividingBy12 + 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.printf("The probability is %.3f%%\n", counterDividingBy12 / counterAllNumbers );
        System.out.printf("The all numbers with this properties are: %.0f\n" , counterAllNumbers );
        System.out.printf("The numbers that can divide bt 12 with this properties are: %.0f\n", counterDividingBy12);
    }
}
