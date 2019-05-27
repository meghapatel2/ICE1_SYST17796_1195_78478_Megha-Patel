package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.awt.BorderLayout;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        Card[] suit = new Card[4];
        
        Card[] value = new Card[13];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            int random = (int) (Math.random() * 13 + 1);
            c.setValue(random);
            
            int random2 = (int) (Math.random() * 4);
            
           c.setSuit(Card.SUITS[random2]);
           // System.out.println("Your 7 cards are");
            System.out.println(c.getValue() + "\t" + c.getSuit());
            //System.out.println(c.getSuit());
    }
    
}
}
