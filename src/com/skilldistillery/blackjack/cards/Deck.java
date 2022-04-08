package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cardDeck = new ArrayList<>();

	public Deck() {
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				cardDeck.add(new Card(rank, suit));

			}

		}

	}

	public int checkDeckSize() {

		return cardDeck.size();
	}

	public Card dealCard() {
		return cardDeck.remove(0);
	}

	public void shuffle() {
		Collections.shuffle(cardDeck);
	}
}
