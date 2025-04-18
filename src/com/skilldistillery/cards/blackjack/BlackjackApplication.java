package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class BlackjackApplication {

	// NO MORE FEILDS
	// NO DECK TYPE VARIABLES AT ALL
	// NO HAND VARIABLES
	private Scanner sc;
	private Dealer dealer;
	private Player player;

	public BlackjackApplication() {
		this.sc = new Scanner(System.in);
		this.dealer = new Dealer();
		this.player = new Player();
	}

	public static void main(String[] args) {
		new BlackjackApplication().launch();

	}

	public void launch() {

		int playerWins = 0;
		int dealerWins = 0;

		printWelcome();

		do {
			// Print score at top
			System.out.println("\t\t[SCORE]\n" + "\tPlayer: " + playerWins + "\n\tDealer: " + dealerWins + "\n");

			// Clear hands before round
			player.clearHand();
			dealer.clearHand();

			// Sets playerTurn back to true
			boolean playerTurn = true;

			boolean keepPlaying = true;
			dealFirstRound();

			// Handle Blackjacks
			int blackjackResult = handleBlackjack();
			if (blackjackResult == 1) {
				playerWins++;
				keepPlaying = keepPlaying();
				continue;
			} else if (blackjackResult == 2) {
				dealerWins++;
				keepPlaying = keepPlaying();
				continue;
			}
			// Players turn
			while (playerTurn) {

				int choice = userMove();

				if (choice == 1) { // Player hits
					player.hit(dealer.dealCard());
					System.out.println(player + "\n");

					if (player.hand.isBust()) {
						System.out.println("You busted! Dealer wins.\n");
						dealerWins++;
						break;
					}
				} else { // player stands
					playerTurn = false;
				}
			}
			// Dealers turn & determine winner
			if (!player.hand.isBust()) {
				dealerMove();
				dealer.displayHand();

				int winner = determineWinner();
				if (winner == 1) {
					playerWins++;
					continue;
				}
				if (winner == 2) {
					dealerWins++;
					continue;
				}
			}
		} while (keepPlaying());
	}

	// Method for dealing and displaying starting hands
	public void dealFirstRound() {
		dealer.shuffle();
		player.hit(dealer.dealCard());
		dealer.hit(dealer.dealCard());
		player.hit(dealer.dealCard());
		dealer.hit(dealer.dealCard());

		System.out.println(player + "\n");
		System.out.println("\nDealer hand: [hidden], " + dealer.hand.cardsInHand.get(1)); // display un-hidden card
	}

	// Method determines if dealer or player have blackjack, if not it passes zero.
	public int handleBlackjack() {
		if (!dealer.hand.isBlackjack() && player.hand.isBlackjack()) {
			System.out.println("BLACKJACK!");
			System.out.println(dealer + "\n");
			System.out.println(player + "\n");
			System.out.println("You got a Blackjack and the dealer did not \n" + "You win!\n");
			return 1;
		}
		if (dealer.hand.isBlackjack() && player.hand.isBlackjack()) {
			System.out.println("BLACKJACK!");
			System.out.println(dealer + "\n");
			System.out.println(player + "\n");
			System.out.println("The dealer also got a Blackjack \n" + "The round will push\n");
			return 2;
		}
		return 0;
	}

	// Method determines Winner and passes 1 for player win, 2 for dealer win, or 0
	// for tie
	public int determineWinner() {
		if (dealer.hand.isBust()) {
			System.out.println("Dealer busts! You win!\n");
			return 1;
		} else if (dealer.hand.getHandValue() > player.hand.getHandValue()) {
			System.out.println("Dealer wins.\n");
			return 2;
		} else if (dealer.hand.getHandValue() < player.hand.getHandValue()) {
			System.out.println("You win!\n");
			return 1;
		} else {
			System.out.println("Its a push.\n");
		}
		return 0;
	}

	// Method to take user commands to hit or stay?
	public int userMove() {
		int userChoice = 0;
		while (userChoice != 1 && userChoice != 2) {
			System.out.println("What would you like to do?");
			System.out.println("1). Hit");
			System.out.println("2). Stand");

			if (sc.hasNextInt()) {
				userChoice = sc.nextInt();
				sc.nextLine();

				if (userChoice != 1 && userChoice != 2) {
					sc.nextLine();
					System.out.println("Please enter a valid option");
				}
			}
		}
		return userChoice;
	}

	// Method for dealer move
	public void dealerMove() {
		while (dealer.hand.getHandValue() < 17) {
			System.out.println("Dealer hits...\n");
			dealer.hit(dealer.dealCard());
		}
	}

	// Method asking user to
	public boolean keepPlaying() {
		int userChoice = 0;
		boolean keepPlaying = true;

		while (userChoice != 1 && userChoice != 2) {
			System.out.println("Press 1 to continue playing\n" + "or press 2 to quit");
			userChoice = sc.nextInt();

			if (userChoice != 1 && userChoice != 2) {
				System.out.println("Please enter a valid option");
			} else if (userChoice == 1) {
				keepPlaying = true;
			} else if (userChoice == 2) {
				keepPlaying = false;
			}
		}
		return keepPlaying;
	}

	// PrintWelcome method (cool ASCII?)
	public void printWelcome() {
		String asciiArt = """
				 ___ _         _    _         _
				| _ ) |__ _ __| |__(_)__ _ __| |__
				| _ \\ / _` / _| / /| / _` / _| / /
				|___/_\\__,_\\__|_\\_\\/ \\__,_\\__|_\\_\\
				                 |__/
							""";
		System.out.println("******************************");
		System.out.println(asciiArt);
		System.out.println("Welcome, press enter to continue...\n");
		System.out.println("******************************");
		sc.nextLine();
	}
}