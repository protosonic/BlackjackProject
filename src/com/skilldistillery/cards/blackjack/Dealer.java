package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class Dealer extends Player {

	// NO MORE FEILDS
	// NO GETTER FOR DECK
	private Deck deck;

	public Dealer() {
		super();
		deck = new Deck();
	}

	public Card dealCard() {
		return deck.dealCard();
	}

	public void shuffle() {
		deck.shuffleDeck();
	}

	@Override
	public String toString() {
		return "Dealer has: " + hand + "with a value of: " + hand.getHandValue();
	}
}
