package net.franklinps.chivallati.TextLab11b;

public class Deck {

	private Card[] cards;
	private int size;

	public Deck( ) {
		size = 52;
		cards = new Card[ size ];

		for ( int i = 0 ; i < 13 ; i++ ) {

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


			Card c = new Card( "Spades", rank, pointValue );

			cards[ i ] = c;

		}

		for ( int i = 13 ; i < 26 ; i++ ) {

			String rank = "";
			int pointValue = 0;

			if ( i + 1 == 14 ) {
				rank = "Ace";
				pointValue = 1;
			}

			if ( i + 1 == 15 ) {
				rank = "Two";
				pointValue = 2;
			}

			if ( i + 1 == 16 ) {
				rank = "Three";
				pointValue = 3;
			}

			if ( i + 1 == 17 ) {
				rank = "Four";
				pointValue = 4;
			}

			if ( i + 1 == 18 ) {
				rank = "Five";
				pointValue = 5;
			}

			if ( i + 1 == 19 ) {
				rank = "Six";
				pointValue = 6;
			}

			if ( i + 1 == 20 ) {
				rank = "Seven";
				pointValue = 7;
			}

			if ( i + 1 == 21 ) {
				rank = "Eight";
				pointValue = 8;
			}

			if ( i + 1 == 22 ) {
				rank = "Nine";
				pointValue = 9;
			}

			if ( i + 1 == 23 ) {
				rank = "Ten";
				pointValue = 10;
			}

			if ( i + 1 == 24 ) {
				rank = "Jack";
				pointValue = 10;
			}

			if ( i + 1 == 25 ) {
				rank = "Queen";
				pointValue = 10;
			}

			if ( i + 1 == 26 ) {
				rank = "King";
				pointValue = 10;
			}


			Card c = new Card( "Clubs", rank, pointValue );

			cards[ i ] = c;

		}

		for ( int i = 26 ; i < 39 ; i++ ) {

			String rank = "";
			int pointValue = 0;

			if ( i + 1 == 27 ) {
				rank = "Ace";
				pointValue = 1;
			}

			if ( i + 1 == 28 ) {
				rank = "Two";
				pointValue = 2;
			}

			if ( i + 1 == 29 ) {
				rank = "Three";
				pointValue = 3;
			}

			if ( i + 1 == 30 ) {
				rank = "Four";
				pointValue = 4;
			}

			if ( i + 1 == 31 ) {
				rank = "Five";
				pointValue = 5;
			}

			if ( i + 1 == 32 ) {
				rank = "Six";
				pointValue = 6;
			}

			if ( i + 1 == 33 ) {
				rank = "Seven";
				pointValue = 7;
			}

			if ( i + 1 == 34 ) {
				rank = "Eight";
				pointValue = 8;
			}

			if ( i + 1 == 35 ) {
				rank = "Nine";
				pointValue = 9;
			}

			if ( i + 1 == 36 ) {
				rank = "Ten";
				pointValue = 10;
			}

			if ( i + 1 == 37 ) {
				rank = "Jack";
				pointValue = 10;
			}

			if ( i + 1 == 38 ) {
				rank = "Queen";
				pointValue = 10;
			}

			if ( i + 1 == 39 ) {
				rank = "King";
				pointValue = 10;
			}


			Card c = new Card( "Hearts", rank, pointValue );

			cards[ i ] = c;

		}

		for ( int i = 39 ; i < 52 ; i++ ) {

			String rank = "";
			int pointValue = 0;

			if ( i + 1 == 40 ) {
				rank = "Ace";
				pointValue = 1;
			}

			if ( i + 1 == 41 ) {
				rank = "Two";
				pointValue = 2;
			}

			if ( i + 1 == 42 ) {
				rank = "Three";
				pointValue = 3;
			}

			if ( i + 1 == 43 ) {
				rank = "Four";
				pointValue = 4;
			}

			if ( i + 1 == 44 ) {
				rank = "Five";
				pointValue = 5;
			}

			if ( i + 1 == 45 ) {
				rank = "Six";
				pointValue = 6;
			}

			if ( i + 1 == 46 ) {
				rank = "Seven";
				pointValue = 7;
			}

			if ( i + 1 == 47 ) {
				rank = "Eight";
				pointValue = 8;
			}

			if ( i + 1 == 48 ) {
				rank = "Nine";
				pointValue = 9;
			}

			if ( i + 1 == 49 ) {
				rank = "Ten";
				pointValue = 10;
			}

			if ( i + 1 == 50 ) {
				rank = "Jack";
				pointValue = 10;
			}

			if ( i + 1 == 51 ) {
				rank = "Queen";
				pointValue = 10;
			}

			if ( i + 1 == 52 ) {
				rank = "King";
				pointValue = 10;
			}


			Card c = new Card( "Diamonds", rank, pointValue );

			cards[ i ] = c;

		}

		shuffleDeck( 1000 );

	}

	public int getSize( ) {
		return size;
	}

	public boolean isEmpty( ) {
		return size == 0;
	}

	public String toString()
	{
		String temp = "";

		for (int k = 0; k < size; k++)
			temp = temp + cards[k].toString() + "\n";

		return temp;
	}

	private void swap( Card[] c , int x , int y )
	{

		Card temp;

		temp = c[x];
		c[x] = c[y];
		c[y] = temp;

	}

	private void shuffleDeck( int shuffleTimes )
	{

		for ( int i = 0 ; i < shuffleTimes ; i++ )
		{

			int randomInt1 = randomInt( 0 , 51 );
			int randomInt2 = randomInt( 0 , 51 );

			swap( cards , randomInt1 , randomInt2 );

		}

	}

	//---------- Random Number Method ---------//


	public static int randomInt( int min, int max ) //generates a random number
	{

		int range = ( max + 1 ) - min; //used to control the maximum value the random method outputs

		return (int) ( ( Math.random( ) * range ) + min ); //returns the value generated to randomNum( int min , int max )

	}

}