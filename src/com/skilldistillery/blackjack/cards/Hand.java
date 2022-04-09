package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	protected List<Card> cards = new ArrayList<>();
	
	protected Hand() {
		
	}
	protected void addCard(Card card) {
		cards.add(card);
	}
	protected void clear() {
		
	}
	protected abstract int getHandValue();
	
	@Override
	public String toString() {
		return cards.toString();
	}
	
		
	
}
