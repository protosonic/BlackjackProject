package com.skilldistillery.cards.common;

public enum Suit {
	
	HEARTS("Hearts"),
	DIAMONDS("Diamonds"),
	SADES("Spades"),
	CLUBS("Clubs");
	
	private final String name;

	Suit(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
