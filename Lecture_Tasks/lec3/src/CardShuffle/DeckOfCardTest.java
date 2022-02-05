package CardShuffle;

public class DeckOfCardTest {
    public static void main(String[] args) {
        DeckOfCards myCards = new DeckOfCards();
        myCards.shuffle(); // place Cards in random order

        //print all Cards in the order in which they are dealt
        for(int i = 0 ; i < 13 ; i++){
            //deal and print 4 Cards
            System.out.printf("%-20s%-20s%-20s%-20s\n",
                    myCards.dealCard() , myCards.dealCard(),
                    myCards.dealCard() , myCards.dealCard() );
        }//end for
    }// end main
} //end class DeckOfCardsTest
