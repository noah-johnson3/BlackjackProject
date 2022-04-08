package com.skilldistillery.blackjack.cards;

public enum Rank {
	TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9),TEN(10), Jack(10), Queen(10), King(10), Ace(11);

	private int rankValue;

	Rank(int value) {
		rankValue = value;

	}

	public int getValue() {
		return rankValue;
	}

}
