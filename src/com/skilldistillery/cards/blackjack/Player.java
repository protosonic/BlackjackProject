package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class Player {

	// NO MORE FEILDS
	// NO GETTER FOR THE HAND
	protected BlackjackHand hand;

	public Player() {
		// Player "has a" hand
		hand = new BlackjackHand();
	}

	public void hit(Card card) {
		this.hand.addCard(card);
	}

	public int getHandValue() {
		return hand.getHandValue();
	}

	public void displayHand() {
		hand.displayHand();
	}

	public void clearHand() {
		hand.clear();
	}

	@Override
	public String toString() {
		return hand + "\nHand value: " + hand.getHandValue();
	}
}
