/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Bin Chen
 Student Number:991390310
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random()*13)+1);
           //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
           c.setSuit(c.SUITS[(int)(Math.random()*3)]);
           //Then report the result here
           System.out.println(c.getValue()+"  "+c.getSuit());
         // Add a clone statement
           
    }
    
}
}
