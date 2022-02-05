package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Input 1 to see from original number to encrypted " +
				"\nInput 2 to see from encrypted number to original number");
		int function = input.nextInt();
		if(function == 1){
			int number = input.nextInt();
			int originalNumber = number;
			if(number >= 1000 && number < 10000){
				int digit1 = (number % 10 + 7) % 10;
				number /= 10;
				int digit2 = (number % 10 + 7 ) % 10;
				number /= 10;
				int digit3 = ( number % 10 + 7 ) % 10;
				int digit4 = ( number / 10 + 7 ) % 10;
				number = digit2 * 1000 + digit1 * 100 + digit4 * 10 + digit3 * 1;
				System.out.println(originalNumber + " is encrypted to : " + number);
			}
		}else if(function == 2){
			int encryptedNumber = input.nextInt();
			if(encryptedNumber >= 0 && encryptedNumber < 10000){
				int digit4 = encryptedNumber % 10;
				encryptedNumber /= 10;
				int digit3 = encryptedNumber % 10;
				encryptedNumber /= 10;
				int digit2 = encryptedNumber % 10;
				int digit1 = encryptedNumber /= 10;
				int newDigit1 = digit3;
				int newDigit2 = digit4;
				int newDigit3 = digit1;
				int newdigit4 = digit2;
				if(newDigit1 >= 0 && newDigit1 <= 6){
					newDigit1 += 10;
				}
				if( newDigit2 >= 0 && newDigit2 <= 6){
					newDigit2 += 10;
				}
				if( newDigit3 >= 0 && newDigit3 <= 6 ){
					newDigit3 += 10 ;
				}
				if( newdigit4 >= 0 && newdigit4 <= 6){
					newdigit4 += 10;
				}
				newDigit1 -=7;
				newDigit2 -= 7;
				newDigit3 -= 7;
				newdigit4 -= 7;
				System.out.println(newDigit1* 1000 + newDigit2 * 100 + newDigit3 * 10 + newdigit4);
			}
		}

    }
}
