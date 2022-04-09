package com.skilldistillery.blackjack.cards;

import java.util.Collections;

public class Dealer {

	Deck deck = new Deck();
	Hand dealerHand = new BlackjackHand();
	
	

	public void shuffle() {
		deck.shuffle();
	}

	public void addCardToHand(Card card) {
		dealerHand.addCard(card);
	}
	public int getHandValue(){
		return dealerHand.getHandValue();
				
	}

	public Card dealCard() {
		return deck.dealCard();
	}

	public void drawCard() {
		deck.shuffle();
		Card card1 = deck.dealCard();
		Card card2 = deck.dealCard();
		System.out.println("Here are your two cards dealer: " + card1 + " " + card2);

	}

	public Deck getDeck() {
		deck.getCards();
		return deck;
	}
	public Hand getHand(){
		return dealerHand;
	}

}
