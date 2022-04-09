package com.skilldistillery.blackjack.cards;

public class Player {
	
	private Hand playerHand = new BlackjackHand();
	
	public void addCardToHand(Card card) {
		getPlayerHand().addCard(card);
	}
	public int getHandValue(){
		return getPlayerHand().getHandValue();
	}


	public Hand getHand(){
		return getPlayerHand();
	}
	public BlackjackHand getPlayerHand() {
		return (BlackjackHand) playerHand;
	}
	public void setPlayerHand(Hand playerHand) {
		this.playerHand = playerHand;
	}
	

}
