package net.franklinps.chivallati.TextLab11b;

/**
 * Created by CompSci-04 on 1/15/2015.
 */
public class Deck
{

	private Card[] cards;
	private int size;

	public Deck()
	{
		size = 52;
		cards = new Card[size];

		for ( int i = 0 ; i < 13 ; i++ )
		{

			String rank = "";
			int pointValue = 0;

			if ( i + 1 == 1 ) {
				rank = "Ace";
				pointValue = i + 1;
			}

			if ( i + 1 == 2 ) {
				rank = "Two";
				pointValue = i + 1;
			}

			if ( i + 1 == 3 ) {
				rank = "Three";
				pointValue = i + 1;
			}

			if ( i + 1 == 4 ) {
				rank = "Four";
				pointValue = i + 1;
			}

			if ( i + 1 == 5 ) {
				rank = "Five";
				pointValue = i + 1;
			}

			if ( i + 1 == 6 ) {
				rank = "Six";
				pointValue = i + 1;
			}

			if ( i + 1 == 7 ) {
				rank = "Seven";
				pointValue = i + 1;
			}

			if ( i + 1 == 8 ) {
				rank = "Eight";
				pointValue = i + 1;
			}

			if ( i + 1 == 9 ) {
				rank = "Nine";
				pointValue = i + 1;
			}

			if ( i + 1 == 10 ) {
				rank = "Ten";
				pointValue = i + 1;
			}

			if ( i + 1 == 11 ) {
				rank = "Jack";
				pointValue = 10;
			}

			if ( i + 1 == 12 ) {
				rank = "Queen";
				pointValue = 10;
			}

			if ( i + 1 == 13 ) {
				rank = "King";
				pointValue = 10;
			}


			Card c = new Card( "Spades" , rank , pointValue );

			cards[i] = c;

		}

		for ( int i = 13 ; i < 26 ; i++ )
		{

			String rank = "";
			int pointValue = 0;

			if ( i + 1 == 1 ) {
				rank = "Ace";
				pointValue = i + 1;
			}

			if ( i + 1 == 2 ) {
				rank = "Two";
				pointValue = i + 1;
			}

			if ( i + 1 == 3 ) {
				rank = "Three";
				pointValue = i + 1;
			}

			if ( i + 1 == 4 ) {
				rank = "Four";
				pointValue = i + 1;
			}

			if ( i + 1 == 5 ) {
				rank = "Five";
				pointValue = i + 1;
			}

			if ( i + 1 == 6 ) {
				rank = "Six";
				pointValue = i + 1;
			}

			if ( i + 1 == 7 ) {
				rank = "Seven";
				pointValue = i + 1;
			}

			if ( i + 1 == 8 ) {
				rank = "Eight";
				pointValue = i + 1;
			}

			if ( i + 1 == 9 ) {
				rank = "Nine";
				pointValue = i + 1;
			}

			if ( i + 1 == 10 ) {
				rank = "Ten";
				pointValue = i + 1;
			}

			if ( i + 1 == 11 ) {
				rank = "Jack";
				pointValue = 10;
			}

			if ( i + 1 == 12 ) {
				rank = "Queen";
				pointValue = 10;
			}

			if ( i + 1 == 13 ) {
				rank = "King";
				pointValue = 10;
			}


			Card c = new Card( "Clubs" , rank , pointValue );

			cards[i] = c;

		}

		for ( int i = 26 ; i < 39 ; i++ )
		{

			String rank = "";
			int pointValue = 0;

			if ( i + 1 == 1 ) {
				rank = "Ace";
				pointValue = i + 1;
			}

			if ( i + 1 == 2 ) {
				rank = "Two";
				pointValue = i + 1;
			}

			if ( i + 1 == 3 ) {
				rank = "Three";
				pointValue = i + 1;
			}

			if ( i + 1 == 4 ) {
				rank = "Four";
				pointValue = i + 1;
			}

			if ( i + 1 == 5 ) {
				rank = "Five";
				pointValue = i + 1;
			}

			if ( i + 1 == 6 ) {
				rank = "Six";
				pointValue = i + 1;
			}

			if ( i + 1 == 7 ) {
				rank = "Seven";
				pointValue = i + 1;
			}

			if ( i + 1 == 8 ) {
				rank = "Eight";
				pointValue = i + 1;
			}

			if ( i + 1 == 9 ) {
				rank = "Nine";
				pointValue = i + 1;
			}

			if ( i + 1 == 10 ) {
				rank = "Ten";
				pointValue = i + 1;
			}

			if ( i + 1 == 11 ) {
				rank = "Jack";
				pointValue = 10;
			}

			if ( i + 1 == 12 ) {
				rank = "Queen";
				pointValue = 10;
			}

			if ( i + 1 == 13 ) {
				rank = "King";
				pointValue = 10;
			}


			Card c = new Card( "Hearts" , rank , pointValue );

			cards[i] = c;

		}

		for ( int i = 39 ; i < 52 ; i++ )
		{

			String rank = "";
			int pointValue = 0;

			if ( i + 1 == 1 ) {
				rank = "Ace";
				pointValue = i + 1;
			}

			if ( i + 1 == 2 ) {
				rank = "Two";
				pointValue = i + 1;
			}

			if ( i + 1 == 3 ) {
				rank = "Three";
				pointValue = i + 1;
			}

			if ( i + 1 == 4 ) {
				rank = "Four";
				pointValue = i + 1;
			}

			if ( i + 1 == 5 ) {
				rank = "Five";
				pointValue = i + 1;
			}

			if ( i + 1 == 6 ) {
				rank = "Six";
				pointValue = i + 1;
			}

			if ( i + 1 == 7 ) {
				rank = "Seven";
				pointValue = i + 1;
			}

			if ( i + 1 == 8 ) {
				rank = "Eight";
				pointValue = i + 1;
			}

			if ( i + 1 == 9 ) {
				rank = "Nine";
				pointValue = i + 1;
			}

			if ( i + 1 == 10 ) {
				rank = "Ten";
				pointValue = i + 1;
			}

			if ( i + 1 == 11 ) {
				rank = "Jack";
				pointValue = 10;
			}

			if ( i + 1 == 12 ) {
				rank = "Queen";
				pointValue = 10;
			}

			if ( i + 1 == 13 ) {
				rank = "King";
				pointValue = 10;
			}


			Card c = new Card( "Diamonds" , rank , pointValue );

			cards[i] = c;

		}

	}

	public int getSize() { return size; }

	public boolean isEmpty() { return size == 0; }



}