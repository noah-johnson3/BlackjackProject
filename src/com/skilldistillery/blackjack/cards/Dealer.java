package com.skilldistillery.blackjack.cards;

import java.util.Collections;

public class Dealer extends Player{

	Deck deck = new Deck();
	
	

	public void shuffle() {
		deck.shuffle();
	}

//	public void addCardToHand(Card card) {
//		dealerHand.addCard(card);
//	}
//	public int getHandValue(){
//		return dealerHand.getHandValue();
//				
//	}

	public Card dealCard() {
		return deck.dealCard();
	}

	public void drawCard() {
		Card card1 = deck.dealCard();
		Card card2 = deck.dealCard();
		System.out.println("Here are your two cards dealer: " + card1 + " " + card2);

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
