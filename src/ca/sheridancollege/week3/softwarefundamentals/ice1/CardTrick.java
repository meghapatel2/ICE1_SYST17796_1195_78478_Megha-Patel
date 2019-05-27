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
      Random rnd = new Random();


      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         int n1 = rnd.nextInt(13);
         int n2 = rnd.nextInt(4);

         c.setValue(n1);
         c.setSuit(Card.SUITS[n2]);
         System.out.println(c.getValue() + "  " + c.getSuit());
         System.out.println("The values are the ones printed above.");
      }

   }
}
