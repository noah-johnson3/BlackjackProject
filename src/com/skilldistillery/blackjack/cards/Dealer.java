package com.skilldistillery.blackjack.cards;

import java.util.Collections;

public class Dealer extends Player{

	Deck deck = new Deck();
	
	

	public void shuffle() {
		deck.shuffle();
	}


	public Card dealCard() {
		return deck.dealCard();
	}

	public void drawCard() {
		Card card1 = deck.dealCard();
		Card card2 = deck.dealCard();

	}

	public Deck getDeck() {
		deck.getCards();
		return deck;
	}
	public Hand getHand(){
		return getPlayerHand();
	}
	public void dealerHand() {
		for (int i = 1; i < getPlayerHand().cards.size(); i++) {
			System.out.println("Dealer has : " + getPlayerHand().cards.get(i));
		}
	}

}
