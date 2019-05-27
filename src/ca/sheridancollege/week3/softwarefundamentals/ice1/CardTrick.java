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
public class CardTrick
{

   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         Random rnd = new Random();
         int value = rnd.nextInt(13) + 1;
         c.setValue(value);
         int a = rnd.nextInt(3);
         c.setSuit(Card.SUITS[a]);
         if (value == 1) {
            System.out.println("Ace of " + c.getSuit());
         }
         else if (value == 11) {
            System.out.println("Joker of " + c.getSuit());
         }
         else if (value == 12) {
            System.out.println("Quuen of " + c.getSuit());
         }
         else if (value == 13) {
            System.out.println("King of " + c.getSuit());
         }
         else {
            System.out.println(c.getValue() + " of " + c.getSuit());

         }
         //Then report the result here
      }

   }
}
