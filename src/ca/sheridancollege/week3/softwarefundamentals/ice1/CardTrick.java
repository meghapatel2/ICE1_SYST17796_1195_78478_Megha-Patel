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
            System.out.println("The chosen card is Ace of " + c.getSuit());
         }
         else if (value == 11) {
            System.out.println("The chosen card is Joker of " + c.getSuit());
         }
         else if (value == 12) {
            System.out.println("The chosen card is Quuen of " + c.getSuit());
         }
         else if (value == 13) {
            System.out.println("The chosen card is King of " + c.getSuit());
         }
         else {
            System.out.println("The chosen card is" +  c.getValue() + " of " + c.getSuit());

         }
         //Then report the result here
      }

   }
}
