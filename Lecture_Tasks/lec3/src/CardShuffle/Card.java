package CardShuffle;

public class Card {
    private String face; // face to card("Ace" , "Deuce" , ...
    private String suit; // suit of card( "Hearts" , Diamonds, ... )

    //two argument constructor initializes card's face and suit
    public Card(String cardFace, String cardSuit){
        face = cardFace; // initialize face to card
        suit = cardSuit; // initialize suit of card
    }// end two-argument Card constructor

    //return String representation of Card
    public String toString(){
        return face + "0f" + suit;
    }//end method toString
}//end class Card
