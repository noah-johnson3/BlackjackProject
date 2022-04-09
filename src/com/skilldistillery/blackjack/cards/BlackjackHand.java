package com.skilldistillery.blackjack.cards;

public class BlackjackHand extends Hand{

	@Override
	protected int getHandValue() {
		//iterating over the list of cards
		int handTotal = 0;
		for (Card card : cards) {
			handTotal += card.getValue();
			
		}
		System.out.println(handTotal);
		// totaling up each individual Ranks values i.e. 5,6 = 11
		// Ranks.values() = "size"
		return handTotal;
	}
	public boolean isBlackjack() {
		return false;
		
	}
	public boolean isBust() {
		return false;
	}

}
