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
 *
 * @author Megha
 */
//Razan alsaddi
public class CardTrick
{

   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         Random rnd = new Random();
         c.setValue(rnd.nextInt(13) + 1);
         c.setSuit(Card.SUITS[rnd.nextInt(4)]);
         //Then report the result here
         System.out.println("Card suit is " + c.getSuit() + " and its value is " + c.getValue());
      }
      Random rnd2 = new Random();
      int magic = rnd2.nextInt(7);
      System.out.println("\nYour lucky card is " + magicHand[magic].getSuit() + " with the value of " + magicHand[magic].getValue());
   }
}
