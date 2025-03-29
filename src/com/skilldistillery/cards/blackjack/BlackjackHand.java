package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class BlackjackHand extends Hand {

	// NO FEILDS

	@Override
	public int getHandValue() {
		int total = 0;
		for (Card card : cardsInHand) {
			total += card.getVlaue();
			return total ;
		}
		return 0;
	} 
	public void displayHand() {
		for (Card card : cardsInHand) {
			System.out.println(card);
		}
	}
	// Decide if Ace is 1 or 11 somewhere
	// Boolean for is blackjack?
	// Boolean for is bust?
}
