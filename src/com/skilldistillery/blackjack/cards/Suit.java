package com.skilldistillery.blackjack.cards;

public enum Suit {

	HEARTS("Heart"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");

	final private String name;

	Suit(String suit) {
		name = suit;
	}
	
	@Override
	public String toString() {
		return name;
	}
	public String getName() {
		return name;
	}

}
