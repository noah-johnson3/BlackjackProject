package com.skilldistillery.blacjack;

import java.util.Scanner;

import com.skilldistillery.blackjack.cards.BlackjackHand;
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
		greeting();
		setup();

	}

	public void greeting() {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("$                                $");
		System.out.println("$  Hello welcome to the casino   $");
		System.out.println("$                                $");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
	}

	public void setup() {
		startGame();

		System.out.println("player : " + player.getHand() + " player total : " + player.getHandValue());
		System.out.println("dealer : " + "[face-down, " + dealer.getHand().getCards().get(1) + "]\n");

		if (isBlackJack(player)) {
			playAgain();
		}

		if (isBlackJack(dealer)) {
			playAgain();
		}
		playerTurn();
		dealerTurn();
		System.out.println("dealer : " + dealer.getHand());
		if (player.getPlayerHand().isBust()) {
			System.out.println("You busted!");
			playAgain();
			
			System.out.println("Dealer total : " + dealer.getHandValue());
			dealerTurn();
		}
		if (dealer.getPlayerHand().isBust()) {
			System.out.println("Dealer busted!");
			playAgain();
		}
		if (player.getHandValue() > dealer.getHandValue()) {
			System.out.println("player wins!");
			playAgain();
		} else if (dealer.getHandValue() > player.getHandValue()) {
			System.out.println("Dealer wins!");
			playAgain();
		} else {
			System.out.println("Its a draw!");
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

				player.addCardToHand(dealer.dealCard());
				cardTotals();
				System.out.println("Player has : " + player.getPlayerHand());
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

		while (keepGoing) {
			if (17 > dealer.getHandValue()) {
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
		String userInput = scannerNextLine();
		if (userInput.equalsIgnoreCase("no")) {
			System.exit(0);
		} else {
			BlackJackApplication app = new BlackJackApplication();
			app.run();
		}

	}
	public String scannerNextLine() {
		String input = sc.nextLine();
		sc.nextLine();
		return input;
	}
	public void startGame() {
		dealer.shuffle();

		player.addCardToHand(dealer.dealCard());
		player.addCardToHand(dealer.dealCard());

		dealer.addCardToHand(dealer.dealCard());
		dealer.addCardToHand(dealer.dealCard());
	}
	public boolean isBlackJack(Player player) {
		if (player.getPlayerHand().isBlackjack() == 21) {
			System.out.println(player.getClass().getSimpleName() + " got Black Jack! " + player.getClass().getSimpleName() + " wins!");
			return true;
		} else {
			return false;
		}
	}
	public void cardTotals() {
		System.out.println("Player total : " + player.getHandValue());
	}
}
