package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.cards.common.Card;

public abstract class Hand {

	// NO GETTER FOR cardsInHand

	protected List<Card> cardsInHand;

	public Hand() {
		cardsInHand = new ArrayList<>();
	}

	public abstract int getHandValue();

	public void addCard(Card card) {
		cardsInHand.add(card);
	}

	public void clear() {
		cardsInHand.clear();
	}

	@Override
	public String toString() {
		return "Cards in hand:\n" + cardsInHand;
	}

}
