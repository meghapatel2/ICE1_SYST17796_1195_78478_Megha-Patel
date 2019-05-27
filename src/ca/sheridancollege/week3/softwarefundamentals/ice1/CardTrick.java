/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

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
      Scanner in = new Scanner(System.in);

      System.out.println("Choose a number from 1 to 7 and find out your lucky card!");
      int card = in.nextInt();
      int luckyCard = card - 1;

      for (int i = 0; i < magicHand.length; i++) {
         int n1 = rnd.nextInt(13);
         int n2 = rnd.nextInt(4);
         Card c = new Card();
         c.setValue(n1 + 1);
         c.setSuit(Card.SUITS[n2]);
         magicHand[i] = c;



         System.out.println("Card suit is " + c.getSuit() + " and its value is " + c.getValue() + ".");

         //Then report the result here
      }
      System.out.println("\nYour lucky card is " + magicHand[luckyCard].getSuit() + " with the value of " + magicHand[luckyCard].getValue());

   }
}
