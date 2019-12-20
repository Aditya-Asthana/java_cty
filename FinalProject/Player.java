/*
 * author: Aditya Asthana
 * 
 *  Description: The Player Class. This represents the cards and the points of Player or a dealer  
 *  The attributes are
 *  firstCard, secondCard - the initial first card and the second card for the player or the
 *  dealer
 *  subsequentCards - cards following the first 2 cards
 *  points -  points scored by the player of dealer
 *  
 */ 

public class Player {

	private Card firstCard;
	private Card secondCard;
	private Card subsequentCards;
	private int points; 
	
	
	//Getters and Setters
	
	public Card getFirstCard() {
		return firstCard;
	}

	public void setFirstCard(Card firstCard) {
		this.firstCard = firstCard;
	}

	public Card getSecondCard() {
		return secondCard;
	}

	public void setSecondCard(Card secondCard) {
		this.secondCard = secondCard;
	}

	public Card getSubsequentCards() {
		return subsequentCards;
	}

	public void setSubsequentCards(Card subsequentCards) {
		this.subsequentCards = subsequentCards;
	}
	
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

    // This method calculates the points for the first 2 cards
	// It prompts the user for choosing points (1,11) if happens to be an ACE
	public void calculateBasePoints(UserInput input) {
		
		//displayCards();

		if ((firstCard !=null) && (firstCard !=null))  {
			String rankFirst= firstCard.getRank();
			String rankSecond= secondCard.getRank();

			if ((rankFirst.equals("ACE")) ) {
				System.out.println("What points would you like to give to the  FIRST ACE:  1 OR 11");
				//add check later
				points += input.getUserChoiceInteger();			
			} else {
				points += getPoints(rankFirst);
			}

			if ((rankSecond.equals("ACE")) ) {
				System.out.println("What points would you like to give to the  SECOND ACE:  1 OR 11");
				//add check later
				points += input.getUserChoiceInteger();
			} else {
				points += getPoints(rankSecond);
			}

		}

	}
	
	//Update the points for the subsequent cards
	public void updateSubsequentPoints(UserInput input) {		
		//Now add the subsequent card points
		if (subsequentCards !=null) {
			if ((subsequentCards.getRank().equals("ACE")) ) {
				System.out.println("What points would you like to give to the ACE:  1 OR 11");
				//add check later
				points += input.getUserChoiceInteger();
			} else {
				points += getPoints(subsequentCards.getRank());
			}
		}

	}
	
	// Get the points for a card
	private int getPoints(String cardRank) {
	   int points = 0;
	   switch (cardRank) {
	   case "TWO" :
		   points = 2;
		   break;
	   case "THREE" :
		   points = 3;
		   break;
	   case "FOUR" :
		   points = 4;
		   break;
	   case "FIVE" :
		   points = 5;
		   break;
	   case "SIX" :
		   points = 6;
		   break;
	   case "SEVEN" :
		   points = 7;
		   break;
	   case "EIGHT" :
		   points = 8;
		   break;
	   case "NINE" :
		   points = 9;
		   break;
	   case "TEN":
	   case "JACK":
	   case "QUEEN":
	   case "KING":
		    	points = 10;
		   break;
	   }
	   
	   return points;
	}
	
	
	//Method called to display the first 2 cards of a player 
	public void displayCards(String user) {
		
		System.out.println(user + " cards are: " + firstCard.toString() +
							" , " + secondCard.toString());
		
	}
}
