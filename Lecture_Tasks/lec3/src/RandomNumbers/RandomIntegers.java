package RandomNumbers;

import java.util.Random;

public class RandomIntegers {
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int face; // stores each random integer generated

        //loop 20 times
       /* for(int counter = 1; counter <= 20 ; counter++){
            //pick random integer rom 1 to 6
            face = 1 + randomNumbers.nextInt(6);

            System.out.printf("%d " , face);//display generated value

            //if counter is divisble by 5, start a new line of output
            if(counter % 5 == 0){
                System.out.println();
            }
        }//end for*/

        //maintains count of rolled
        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;
        for(int roll = 1; roll <= 6000 ; roll++){
            face = 1 + randomNumbers.nextInt(6);
            switch(face){
                case 1:
                    ++frequency1;
                    break;
                case 2 :
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
                    break;
            }//end switch
        }//end for

        System.out.println("Face\tFrequency");
        System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n" ,
                frequency1 , frequency2, frequency3,
                frequency4, frequency5, frequency6);
    }//end main
}//end class RandomNumbers
