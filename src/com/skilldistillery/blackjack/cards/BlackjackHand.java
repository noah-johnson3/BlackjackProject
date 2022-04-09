package com.skilldistillery.blackjack.cards;

public class BlackjackHand extends Hand{

	@Override
	protected int getHandValue() {
		//iterating over the list of cards
		int handTotal = 0;
		for (Card card : cards) {
			handTotal += card.getValue();
			
		}
//		System.out.println(handTotal);
		// totaling up each individual Ranks values i.e. 5,6 = 11
		// Ranks.values() = "size"
		return handTotal;
	}
	public boolean isBlackjack() {
		if(  cards.size() == 2) {
			return cards.get(0).getValue() + cards.get(1).getValue() == 21;
		}
		return false;
		
	}
	public boolean isBust() {
		if(getHandValue() > 21) {
			System.out.println("You Bust! You Lose!");
		}
		return false;
	}

}
