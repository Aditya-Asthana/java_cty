/*
 * author: Aditya Asthana
 * 
 *  Description: The Card Class. It has 2 attributes 
 *  Suit - one of diamonds, hearts, spades and clubs
 *  Rank - Value of the card from ACE to KING
 *  
 */

public class Card {

	// diamond, hearts, spades, clubs
	private String suit;
	
	//Rank values fron ACE, TWO, THREE, .. to KING
	private String rank;
	
	//default constructor
	public Card() {
		
	}
	
	//Constructor with parameters
	public Card(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	
	//Getters and setters
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	
	/* toString Method will used for displaying the card 
	 * Format will be  for example
	 * [EIGHT:SPADES]
	 */
	
	public String toString() {
		return "["+ rank + ":" + suit+ "]";
	}

}
