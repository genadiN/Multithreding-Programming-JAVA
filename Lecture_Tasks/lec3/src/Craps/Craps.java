package Craps;

import java.util.Random;

public class Craps {
    //create random number generator for use in method rollDice
    private Random randomNumbers = new Random();

    //enumeration with constants that represent the game status
    private enum Status{CONTINUE , WON , LOST};

    // constants that represent common rolls of the dice
    private final static int SNAKE_EYES = 2;
    private final static int TREY = 3;
    private final static int SEVEN = 7;
    private final static int YO_LEVEN = 11;
    private final static int BOX_CARS = 12;

    //plays one game of craps
    public void play(){
        int myPoint = 0; // point if no win or loss on first roll
        Status gameStatus; /// cna contain CONTINUE , WON , LOST

        int sumOfDice = rollDice(); // first roll of the die

        //determine game status and point based on first roll
        switch(sumOfDice){
            case SEVEN: // win with 7 on first roll
            case YO_LEVEN: // win with 11 on first roll
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: // loose with 2 on first roll
            case TREY: // lose with 3 on first roll
            case BOX_CARS: // lose with 12 on first roll
                gameStatus = Status.LOST;
                break;
            default: // didn't win or lose, se remember point
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("point is %d\n" , myPoint);
                break; // optional at end of switch
        }//end of switch statement

        //while game is not complete
        while(gameStatus == Status.CONTINUE){
            sumOfDice = rollDice(); // roll dice again

            //determine game status
            if(sumOfDice == myPoint){ // win by making points
                gameStatus = Status.WON;
            }else if(sumOfDice == SEVEN){ // lose by rolling 7 before point
                gameStatus = Status.LOST;
            }
        }//end while

        //display won or lost message
        if(gameStatus == Status.WON){
            System.out.printf("%s\n", "Player wins");
        }else{
            System.out.printf("%s\n" , "Player loses");
        }
    }// end method play

    public int rollDice(){
        //pick random die values
        int die1 = 1 + randomNumbers.nextInt( 6 );
        int die2 = 1 + randomNumbers.nextInt( 6 );

        int sum = die1 + die2;

        //display results of this roll
        System.out.printf("Player rolled %d + %d = %d\n" ,
                die1 , die2 , sum);
        return sum; // returm sum of dice
    }// end method rollDice
}//end class Craps.Craps
