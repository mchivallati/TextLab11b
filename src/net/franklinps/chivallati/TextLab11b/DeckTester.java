package net.franklinps.chivallati.TextLab11b;// DeckTester01.java
// This program tests the <Deck01> class.
// //////////////////////////////////////////////////////////
// This program is designed to explain the "Elevens" lab created
// by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Divided into stages and altered August 2014 by Leon Schram.


public class DeckTester
{
	public static void main(String[] args)
	{  
      Deck deck = new Deck();
      System.out.println( deck.toString() );
      System.out.println( deck.getSize() );
      System.out.println( deck.isEmpty() );
	}
}

