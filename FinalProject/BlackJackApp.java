/*
 * author: Aditya Asthana
 * 
 *  Description: The main BlackJack app
 *  
 */ 

public class BlackJackApp {

	public static void main(String[] args) {		
		Deck deck;

		//input class to collect user input
		UserInput input = new UserInput();

		//create a deck of cards
		deck = new Deck();

		//Create a player and draw 2 cards from the deck for the player
		// display the player's cards and show the points 
		Player player = new Player();
		Card[] playerCards = deck.drawCard(2);
		System.out.println("*********************");
		System.out.println("Players draws 2 cards");
		player.setFirstCard(playerCards[0]);
		player.setSecondCard(playerCards[1]);
		player.displayCards("Player");

		player.calculateBasePoints(input);

		System.out.println("Player points are : " + player.getPoints());
		System.out.println("*********************");
		System.out.println();
		
		

		if (player.getPoints() < 21) {

			//Players points are less than 21 
			//Create a dealer draw 2 cards and displays the first card
			Player dealer = new Player();
			Card[] dealerCards = deck.drawCard(2);
			System.out.println("*********************");
			System.out.println("Dealer draws 2 cards");
			dealer.setFirstCard(dealerCards[0]);
			dealer.setSecondCard(dealerCards[1]);
			dealer.calculateBasePoints(input);

			//First card face up
			System.out.println("Dealers open card is:");
			System.out.println(dealer.getFirstCard().toString());  

			boolean playerStay = false;  //Set to true when player stays
			boolean dealerStay = false;  //Set to true when dealer stays
			boolean gameOver = false;  //set to false when one party wins

			//Ask player to hit or stay
			int choice = getUserChoice(input);

			while(!gameOver) {

				//player hits
				if((choice == 1) && (!playerStay)) {
					System.out.println("*********************");
					System.out.println("Player wants to HIT:");
					//display new card
					playGame(deck, player, input, "Player");
					//display player points
					System.out.println("Player's new points are : " + player.getPoints()); 
					//if players points == 21 check dealer points and then decide
					if ((player.getPoints() == 21) && (dealer.getPoints() == 21)) {
						System.out.println("Dealers points are : " + dealer.getPoints());
						System.out.println("DEALER HAS WON!!");
						gameOver = true;
						break;
					} else if ((player.getPoints() == 21) && (dealer.getPoints() != 21)){
						System.out.println("Dealers points are : " + dealer.getPoints());
						System.out.println("PLAYER HAS WON!!");
						gameOver = true;
						break;
					} else  if((player.getPoints() > 21)) { 
						//if players points > 21 player loses
						System.out.println("PLAYER HAS LOST!!");
						gameOver = true;
						break;
					} else {
						//go back and check for hit/stay for player
						choice = getUserChoice(input);
						continue;
					}
				//player stays
				} else if((choice == 2) && (!dealerStay)) {
					if(!playerStay) {
						System.out.println("*********************");
						System.out.println("Player has STAYED:");
						System.out.println("*********************");
						System.out.println("Dealers cards are:");
						dealer.displayCards("Dealer");
						playerStay = true;
					}
					System.out.println("Dealers points are : " + dealer.getPoints());
					//if dealer points =  21  dealer WINS
					if (dealer.getPoints() == 21) {
						System.out.println("DEALER HAS WON!!");
						gameOver = true;
						break;
					//if dealer points > 21 dealer has lost
					} else if (dealer.getPoints() > 21) {
						System.out.println("DEALER HAS LOST!!");
						gameOver = true;
						break;
					} else if(dealer.getPoints() > 17) { 
						//as per rules of the game dealer will stay if his points > 17 and <21
						dealerStay = true;
						System.out.println("*********************");
						System.out.println("DEALER has STAYED: - Checking points");
						System.out.println("PLAYER POINTS: " + player.getPoints());
						System.out.println("DEALER POINTS: " + dealer.getPoints());
						if(dealer.getPoints() >= player.getPoints()) {
							System.out.println("DEALER HAS WON!!");
							gameOver = true;
							break;
						} else {
							System.out.println("PLAYER HAS WON!!");
							gameOver = true;
							break;
						}
					} else {
						System.out.println("*********************");
						System.out.println("Dealer to HIT:");
						//display new card
						playGame(deck, dealer, input, "Dealer");
					}
				}
			}
		} else if (player.getPoints() > 21) {
			System.out.println("PLAYER HAS LOST!!");
		} else if (player.getPoints() == 21) {
			System.out.println("PLAYER HAS WON!!");
		}
	}

	/*
	 * This method draws 1 card from the deck, displays the card and calculates the points
	 * of a participant (player or dealer)
	 * arguments: 
	 * Deck - current card deck
	 * Player - participant type player or dealer
	 * UserInput - used to determine the ACE value (1,11) if an ACE is drawn
	 * String - used to append "player" or "dealer" in display string
	 */
	public static void playGame( Deck deck, Player user, UserInput input, String playerType ) {
		Card[]	subsCard = deck.drawCard(1);
		System.out.println("*********************");
		System.out.println( playerType + " new card is : " + subsCard[0].toString());
		user.setSubsequentCards(subsCard[0]);
		user.updateSubsequentPoints(input);
	}

	/*
	 *  This method collects user input 1 for hit, 2 for stay, it will filter out any
	 *  bad inputs till the correct input is received
	 *  argument: 
	 *  UserInput - for collecting user choice 1 or 2
	 */
	public static int getUserChoice(UserInput input) {
		int choice = -1;
		while((choice !=1) && (choice !=2)) {
			System.out.println("*********************");
			System.out.println("Player enter 1 for Hit 2 for Stay:");
			choice = input.getUserChoiceInteger();
		}
		return choice;
	}
}
