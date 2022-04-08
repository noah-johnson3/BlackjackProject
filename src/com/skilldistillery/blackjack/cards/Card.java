package com.skilldistillery.blackjack.cards;

import java.util.Arrays;
import java.util.Objects;

public class Card {
	
	private Rank ranks;
	private Suit suits;
	
	
	@Override
	public String toString() {
		return ranks + " of " + suits;
	}


	public Card(Rank ranks, Suit suits) {
		super();
		this.ranks = ranks;
		this.suits = suits;
	}


	@Override
	public int hashCode() {
		return Objects.hash(ranks, suits);
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
		return ranks == other.ranks && suits == other.suits;
	}


	public int getValue() {
		return ranks.getValue();
	}

}
