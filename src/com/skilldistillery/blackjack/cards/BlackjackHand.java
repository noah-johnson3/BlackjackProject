package com.skilldistillery.blackjack.cards;

public class BlackjackHand extends Hand {

	@Override
	protected int getHandValue() {
		int handTotal = 0;
		for (Card card : cards) {
			handTotal += card.getValue();

		}
		return handTotal;
	}

	public int isBlackjack() {
		int sum = 0;
		for (int i = 0; i < cards.size(); i++) {
			sum += cards.get(i).getValue();
		}
		return sum;
	}

	public boolean isBust() {
		int sum = 0;
		for (int i = 0; i < cards.size(); i++) {
			sum += cards.get(i).getValue();
		}
		if (sum > 21) {
			return true;
		} else {
			return false;
		}
	}
}
