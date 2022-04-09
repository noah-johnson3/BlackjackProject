package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<>();
	
	
	public Deck() {
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				cards.add(new Card(rank, suit));

			}

		}

	}

	public int cardsLeftInDeck() {

		return cards.size();
	}

	public Card dealCard() {
		return cards.remove(0);
	}
	public void dealCard(Hand hand) {
		hand.addCard(dealCard());
		hand.addCard(dealCard());
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}
}
