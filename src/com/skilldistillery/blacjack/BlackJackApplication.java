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
		boolean keepGoing = true;
		greeting();
		setup();

	}

	public void greeting() {
		System.out.println("Hello welcome to the casino");
	}

	public void setup() {
		dealer.shuffle();

		player.addCardToHand(dealer.dealCard());
		player.addCardToHand(dealer.dealCard());

		dealer.addCardToHand(dealer.dealCard());
		dealer.addCardToHand(dealer.dealCard());

		System.out.println("player : " + player.getHand());
		System.out.println("dealer : " + "[face-down, " + dealer.getHand().getCards().get(1) + "]");

		if (player.getHandValue() == 21) {
			player.getPlayerHand().isBlackjack();
			System.out.println("You got Blackjack! You win!");
			playAgain();
			System.exit(0);
		}

		if (dealer.getHandValue() == 21) {
			dealer.getPlayerHand().isBlackjack();
			System.out.println("The dealer got Blackjack! They win!");
			playAgain();
			System.exit(0);
		}

		player.getHandValue();
		playerTurn();
		if (player.getPlayerHand().isBust()) {
			System.out.println("You busted!");
			playAgain();
		}

//		System.out.println("dealer : " + dealer.getHand());
		dealer.getHandValue();
		dealerTurn();
		if (dealer.getPlayerHand().isBust()) {
			System.out.println("Dealer busted!");
			playAgain();
		}
	}

	public void playerTurn() {
		boolean keepGoing = true;
		String playerChoice = null;

		while (keepGoing) {

			System.out.println("Do you want to hit? yes/No?");
			playerChoice = sc.nextLine();
			if (playerChoice.equalsIgnoreCase("yes")) {

				System.out.println(player.getPlayerHand());
				player.addCardToHand(dealer.dealCard());
				System.out.println(player.getPlayerHand());
				if (player.getPlayerHand().isBust()) {

					keepGoing = false;
				}
			} else if (playerChoice.equalsIgnoreCase("no")) {
				
				
				keepGoing = false;
				break;
			}
		}

	}

	public void dealerTurn() {
		boolean keepGoing = true;
		String dealerChoice = null;

		while (keepGoing) {
			if (dealer.getHandValue() < 17 || dealer.getHandValue() < player.getHandValue()) {
				dealer.addCardToHand(dealer.dealCard());
				dealer.dealerHand();
				keepGoing = false;
			} else if (dealer.getHandValue() >= 17) {
				keepGoing = false;
			}

		}

	}

	public void playAgain() {
		System.out.println("Play again?");
		String userInput = sc.nextLine();
		if (userInput.equalsIgnoreCase("no")) {
			System.exit(0);
		} else {
			BlackJackApplication app = new BlackJackApplication();
			app.run();
		}

	}

}
