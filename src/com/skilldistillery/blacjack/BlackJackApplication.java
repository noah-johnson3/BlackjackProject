package com.skilldistillery.blacjack;

import java.util.Scanner;

import com.skilldistillery.blackjack.cards.Dealer;
import com.skilldistillery.blackjack.cards.Player;

public class BlackJackApplication {

	Dealer dealer = new Dealer();
	Player player = new Player();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BlackJackApplication app = new BlackJackApplication();
		app.run();
	}

	public void run() {
		dealer.shuffle();
		dealer.addCardToHand(dealer.dealCard());
		dealer.addCardToHand(dealer.dealCard());
		System.out.println(dealer.getHand());
		
		dealer.getHandValue();
		player.addCardToHand(dealer.dealCard());
		player.addCardToHand(dealer.dealCard());
		System.out.println(player.getHand());
		player.getHandValue();
	}
	
	public void playerTurn() {
		boolean keepGoing = true;
		String playerChoice = null;
		while(keepGoing) {
			System.out.println("Do you want to hit? Yes/No?");
			playerChoice = sc.nextLine();
			player.addCardToHand(dealer.dealCard());
		}
		
	}
	public void dealerTurn() {
		boolean keepGoing = true;
		String userChoice = null;
		while(keepGoing) {
			System.out.println("Do you want to hit? Yes/No?");
			userChoice = sc.nextLine();
			player.addCardToHand(dealer.dealCard());
		}
		
	}
	
	public boolean winCondition() {
		boolean win = false;
		if(player.getHandValue() == 21 || dealer.getHandValue() == 21) {
			System.out.println("Blackjack! You've won!!!!");
			return true;
		} else if (player.getHandValue() > 21) {
			System.out.println("You Bust! Try again next time!");
			return win;
		} else if (player.getHandValue() < 21 && playerHand.getHandValue() > 0) {
			System.out.println("Draw again?");
		}
	}
}
