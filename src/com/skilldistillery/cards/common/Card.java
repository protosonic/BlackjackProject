package com.skilldistillery.cards.common;

import java.util.Objects;

public class Card {
	// FEILDS 
	private Suit suit;
	private Rank rank;
	
	//CTORS
	public Card(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}
	// GETTERS & SETTERS
	public int getVlaue() {
		return rank.getValue();
	}
	
	//OTHER METHODS
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;
	}
	// TOSTRING
	@Override
	public String toString() {
		return (rank + " of " + suit);
	}


}
