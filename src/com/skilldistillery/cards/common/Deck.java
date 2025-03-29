package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Deck {

	// DO NOT GENERATE A GETTER FOR CARDS

	private List<Card> deck;

	public Deck() {
		deck = new ArrayList<Card>(52);
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(suit, rank));
			}
		}
	}

	public int checkDeckSize() {
		int deckSize = deck.size();
		return deckSize;
	}

	public Card dealCard() {
		if (checkDeckSize() < 1) {
			return null;
		}
		return deck.remove(0);
	}

	public void shuffleDeck() {
		Collections.shuffle(deck);
	}

}
