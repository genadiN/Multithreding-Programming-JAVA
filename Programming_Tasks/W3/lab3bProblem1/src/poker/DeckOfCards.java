package poker;

import java.util.Random;

public class DeckOfCards
{
    private Card deck[]; // array of Card objects
    private int currentCard; // index of next Card to be dealt
    private final int NUMBER_OF_CARDS = 52; // constant number of Cards
    private Random randomNumbers; // random number generator
    private String faces[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
    private String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };

    // constructor fills deck of Cards
    public DeckOfCards()
    {

        deck = new Card[ NUMBER_OF_CARDS ]; // create array of Card objects
        currentCard = 0; // set currentCard so first Card dealt is deck[ 0 ]
        randomNumbers = new Random(); // create random number generator

        // populate deck with Card objects
        for ( int count = 0; count < deck.length; count++ )
            deck[ count ] =
                    new Card( faces[ count % 13 ], suits[ count / 13 ] );
    } // end DeckOfCards constructor

    // shuffle deck of Cards with one-pass algorithm
    public void shuffle()
    {
        // after shuffling, dealing should start at deck[ 0 ] again
        currentCard = 0; // reinitialize currentCard

        // for each Card, pick another random Card and swap them
        for ( int first = 0; first < deck.length; first++ )
        {
            // select a random number between 0 and 51
            int second =  randomNumbers.nextInt( NUMBER_OF_CARDS );

            // swap current Card with randomly selected Card
            Card temp = deck[ first ];
            deck[ first ] = deck[ second ];
            deck[ second ] = temp;
        } // end for
    } // end method shuffle

    // deal one Card
    public Card dealCard()
    {
        // determine whether Cards remain to be dealt
        if ( currentCard < deck.length )
            return deck[ currentCard++ ]; // return current Card in array
        else
            return null; // return null to indicate that all Cards were dealt
    } // end method dealCard
    private int[] totalHand( Card hand[]){
        int number[] = new int[faces.length];//all faces

        for(int i = 0 ; i < hand.length ; i++){
            for(int j = 0 ; j < faces.length ; j++){
                if(hand[i].getFace().equals(faces[j])){
                    number[j]++;
                }
            }
        }
        return number;
    }
    //a
    public int pairs( Card hand[]){
        int couples = 0;
        int numbers[] = totalHand(hand);
        for(int i = 0 ; i < numbers.length ; i++){
            if(numbers[i] == 2){
                // for Test
                System.out.print("Pair of %s\n" + faces[i]);
                couples ++;
            }
        }
        return couples;
    }
    //
//   public int threeeOfKind( Card hand[]){
//      int triples = 0;
//      int numbers[] = totalHand(hand);
//      for(int i = 0 ; i < numbers.length ; i++){
//         if(numbers[i] == 3){
//            // for Test
//            System.out.printf("Three of %s\n" , faces[i]);
//            triples ++;
//            break;
//         }
//      }
//      return triples;
//   }
    //b
    public void twoPairs(int couples){
        if(couples == 2){
            System.out.println("Two pair!");
        }
    }
    //c
    public int threeOfKind( Card hand[]){
        int numbers[] = totalHand(hand);
        for(int i = 0 ; i < numbers.length ; i++){
            if(numbers[i] == 3){
                // for Test
                System.out.printf("Three of %s\n" , faces[i]);
                return 1;
            }
        }
        return 0;
    }
    //d
    public int fourOfKind(Card hand[]){
        int numbers[] = totalHand(hand);
        for(int i = 0 ; i < numbers.length ; i++){
            if(numbers[i] == 4){
                // for Test
                System.out.printf("Four of %s\n" , faces[i]);
                return 1;
            }
        }
        return 0;
    }
    //e
    public void flush(Card hand[]){
        String suit = hand[0].getSuit();
        for(int i = 1 ; i < hand.length ; i++){
            if(!hand[i].getSuit().equals(suit)){
                return ;
            }
        }
        System.out.println("We have Flush in: " + suit);
        System.out.printf("Flush in %s\n" ,suit );
    }

    //f - TO DO

    //g
    public void fullHouse(int couples , int triples){
        if( couples == 1 && triples == 1){
            System.out.println("Full House!");
        }
    }

} // end class DeckOfCards


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/

