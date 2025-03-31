package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Rank;

public class BlackjackHand extends Hand {

	// NO FEILDS

	@Override
	public int getHandValue() {
		int total = 0;
		int aceCount = 0;
		// Decide if Ace is 1 or 11 somewhere
		for (Card card : cardsInHand) {
			if (card.getVlaue() == 11) { // if card value = 11 = ace
				aceCount++;
			} else {
				total += card.getVlaue();
			}
		}
		while (total > 21 && aceCount > 0) {
			total -= 10;
			aceCount--;
		}
		return total;
	}

	public void displayHand() {
		for (Card card : cardsInHand) {
			System.out.println(card);
		}
	}

	// Boolean for is blackjack?
	public boolean isBlackjack() {
		if (getHandValue() == 21) {
			return true;
		}
		return false;
	}

	// Boolean for is bust?
	public boolean isBust() {
		if (getHandValue() > 21) {
			return true;
		}
		return false;
	}
}
