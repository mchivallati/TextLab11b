// This is the Student starting version of the <Deck> class lab assignment.

public class Lab11bst
{
	public static void main(String args[])
	{
		System.out.println("Lab11bst.JAVA");
		System.out.println();     
      Deck deck = new Deck();
      System.out.println(deck);
	}
}


class Deck 
{
	private Card[] cards;
	private int size;

	public Deck() 
   {
      size = 52;
		cards = new Card[size];
	}    
 }

class Card
{
	private String suit;
	private String rank;
	private int pointValue;

	public Card(String s, String r, int pV)
	{
		suit = s;
		rank = r;
		pointValue = pV;
	}

	public String suit()      { return suit; }
	public String rank()      { return rank; }
	public int pointValue()   { return pointValue; }

	public boolean matches(Card otherCard)
	{
		return otherCard.suit().equals(this.suit())
				&& otherCard.rank().equals(this.rank())
				&& otherCard.pointValue() == this.pointValue();
	}

	public String toString()
	{
		return rank + " of " + suit + " (point value = " + pointValue + ")";
	}
}
