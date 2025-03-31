package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Rank;

public class BlackjackHand extends Hand {

	// NO FEILDS

	@Override
	public int getHandValue() {
		int total = 0;
		int aceCount = 0;
		// Decide if Ace is 1 or 11
		for (Card card : cardsInHand) {
			if (card.getValue() == 11) { // if card value = 11 = ace
				aceCount++;
			} else {
				total += card.getValue();
			}
		}
		if (total > 21 && aceCount > 0) {
			total -= 10;
			return total;
		} else
			return total;
	}

	public void displayHand() {
		for (Card card : cardsInHand) {
			System.out.println(card);
		}
	}

	public boolean isBlackjack() {
		if (getHandValue() == 21) {
			return true;
		}
		return false;
	}

	public boolean isBust() {
		if (getHandValue() > 21) {
			return true;
		}
		return false;
	}
}
