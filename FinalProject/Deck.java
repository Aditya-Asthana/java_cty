import java.util.Random;


/*
 * author: Aditya Asthana
 * 
 *  Description: The Deck Class. This represents a deck of 52 cards 
 *  The attributes are
 *  numOfCards - total number of cards in the deck
 *  cards - An array of 52 Card objects
 *  inDeck -  An array of 52 boolean values, each index representing if a card at that index 
 *  ie. cards[index] belongs to the deck or it has been already drawn out.
 *  
 */ 

public class Deck {

	//total number of cards in the deck for a full deck it will be 52
	private int numOfCards;
	
	//An array of 52 Card objects
	private Card[] cards = null;
	
	//An array of 52 boolean values
	private boolean[] inDeck = null;
	
	
	String[] suits = { "DIAMONDS","HEARTS", "SPADES", "CLUBS" };

	
	//Default constructor
	public Deck() {
		int count = 0;
		cards = new Card[52];
		inDeck = new boolean[52];
		
		//Initialize deck to have all cards
		for (int i =0 ; i < 52; i++) {
			inDeck[i] = true;
		}

		//Set up cards in a deck in an orderly fashion
		for (int i = 0; i < 4; i++) {
			for( int j = 1 ; j < 14; j++) {
				switch (j) {
				case 1 : cards[count] = new Card(suits[i], "ACE");
				inDeck[count] = true;
				count++;
				break;
				case 2: cards[count] = new Card(suits[i], "TWO");
				inDeck[count] = true;
				count++;
				break;
				case 3: cards[count] = new Card(suits[i], "THREE");
				inDeck[count] = true;
				count++;
				break;
				case 4: cards[count] = new Card(suits[i], "FOUR");
				inDeck[count] = true;
				count++;
				break;
				case 5: cards[count] = new Card(suits[i], "FIVE");
				inDeck[count] = true;
				count++;
				break;
				case 6: cards[count] = new Card(suits[i], "SIX");
				inDeck[count] = true;
				count++;
				break;
				case 7: cards[count] = new Card(suits[i], "SEVEN");
				inDeck[count] = true;
				count++;
				break;
				case 8: cards[count] = new Card(suits[i], "EIGHT");
				count++;
				break;
				case 9: cards[count] = new Card(suits[i], "NINE");
				inDeck[count] = true;
				count++;
				break;
				case 10: cards[count] = new Card(suits[i], "TEN");
				inDeck[count] = true;
				count++;
				break;
				case 11: cards[count] = new Card(suits[i], "JACK");
				inDeck[count] = true;
				count++;
				break;
				case 12: cards[count] = new Card(suits[i], "QUEEN");
				inDeck[count] = true;
				count++;
				break;
				case 13: cards[count] = new Card(suits[i], "KING");
				inDeck[count] = true;
				count++;
				break;
				}

			}
		}

		//Update the number of counts in a deck after init
		numOfCards = count;
		
		//Now randomize the cards for shuffle
		Random rand = new Random();
		for (int j = cards.length - 1; j > 0; j--)
		{
			int index = rand.nextInt(j + 1);
			// Simple swap
			Card card = cards[index];
			cards[index] = cards[j];
			cards[j] = card;
		}

	}


	//getters and setters
	
	public Card[] getCards() {
		return cards;
	}


	public void setCards(Card[] cards) {
		this.cards = cards;
	}


	public boolean[] getInDeck() {
		return inDeck;
	}


	public void setInDeck(boolean[] inDeck) {
		this.inDeck = inDeck;
	}

	public int getNumOfCards() {
		return numOfCards;
	}

	public void setNumOfCards(int numOfCards) {
		this.numOfCards = numOfCards;
	}

	/* We are not removing the card from the array after drawing the card
	 * We instead use the inDeck array to set the boolean to false once a card is drawn
	 * Once a card is drawn we reduce the numOfCards by 1
	 * If numberOfCards == 0 -- then recycle all the cards and reshuffle 
	 */
	public Card[] drawCard(int num) {
		Card[] drawnCards = new Card[num];
		for (int i = 0; i <num; i++) {			
			int index = getIndex();
			if (index !=-1) {
				drawnCards[i] = cards[index];
				inDeck[index] = false;
				numOfCards--;
				if(numOfCards == 0) {
					recycleAndShuffleDeck();
				}
			}
		}

		return drawnCards;

	}

	
	/* Since we are not removing cards from the cards array after drawing a card 
	 * We need to ensure we are not pulling out a card that is already drawn
	 * This method returns the index of a non-drawn card from the deck
	*/
	public int getIndex() {
		Random rand = new Random();
		int index = rand.nextInt(cards.length);
		int count = 0;
		while(!inDeck[index]) {
			index = rand.nextInt(cards.length);
			count++;
			if (count >= cards.length) {
				return -1;
			}
		}
		return index;
	}
	
	//If there are no card remaining in the deck 
	//then recycle and shuffle
	public void recycleAndShuffleDeck() {
		//Initialize deck to have all cards
		for (int i =0 ; i < 52; i++) {
			inDeck[i] = true;
		}

		//Now randomize the cards for shuffle
		Random rand = new Random();
		for (int j = cards.length - 1; j > 0; j--)
		{
			int index = rand.nextInt(j + 1);
			// Simple swap
			Card card = cards[index];
			cards[index] = cards[j];
			cards[j] = card;
		}
		
		numOfCards = cards.length;
		
	}


}
