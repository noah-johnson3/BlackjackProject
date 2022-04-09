package com.skilldistillery.blackjack.cards;

public class Player {
	
	Hand playerHand = new BlackjackHand();
	
	

	public void addCardToHand(Card card) {
		playerHand.addCard(card);
	}
	public int getHandValue(){
		return playerHand.getHandValue();
	}


	public Hand getHand(){
		return playerHand;
	}
	

}
