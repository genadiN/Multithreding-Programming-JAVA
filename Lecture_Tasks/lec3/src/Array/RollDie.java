package Array;

import java.util.Random;

public class RollDie {
    public static void main(String[] args) {
        Random randomNumbers = new Random(); // random numbers generator
        int frequency[] = new int[ 7 ];

        //roll die 6000 times; use die value as frequency indindex
        for(int roll = 1; roll <= 6000 ; roll++){
            ++frequency[1 + randomNumbers.nextInt( 6 )];
        }

        System.out.printf("%s%10s\n", "Face", "Frequency" );

        //output each array element's value
        for(int face = 1 ; face < frequency.length; face++){
            System.out.printf("%4d%10d\n" , face, frequency[face]);
        }
    }//end main
}// end class RollFie
