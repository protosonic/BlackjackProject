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

	}

	// Method for dealing starting hands
	// PrintWelcome method (cool ASCII?)
	// Method for checking winner (isBlackjack boolean?)
	// Method to take user commands to hit or stay?

	// Personal stretch goal ideas
	// - Ask for # of players, ask for player names and iterate numOfPlayers to
	// associate their names. (Good luck, pal!)
	// - Include betting? (Yea right!)
	// - Add play again option using try/catch with custom exception?

}
