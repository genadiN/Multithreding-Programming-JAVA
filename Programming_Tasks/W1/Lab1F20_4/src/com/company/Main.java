package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int number = input.nextInt() , counter = 1 , fourtSystem = 0 , digitCounter = 0;
	    if(number >= 1000 && number < 10000){
	        while(number > 4){
                int newnumber = number / 4;
	            int remainder = number - newnumber * 4;
	            number /= 4;
	            fourtSystem += remainder * counter ;
	            counter *= 10;
            }
	        fourtSystem += number * counter;
            System.out.println("Quartenary number is : " + fourtSystem);
            String s = "";
            while( fourtSystem > 0) {
				int digit = fourtSystem % 10;
				String c = "";
				if (digit == 0) {
					c = "A";
				} else if (digit == 1) {
					c = "C";
				} else if (digit == 2) {
					c = "G";
				} else if (digit == 3) {
					c = "T";
				}
				s = c + s;
				fourtSystem /= 10;
			}
			System.out.println("Encrypted String is :  " + s);
        }
    }
}
