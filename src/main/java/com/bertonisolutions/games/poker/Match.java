package com.bertonisolutions.games.poker;

import com.bertonisolutions.games.poker.deck.Deck;

public class Match {

	public static void main(String args[]) {
		int fp = 0;
		int sp = 0;
		int none = 0;
		for (int i = 0; i < 1000; i++) {
			Deck deck = new Deck();
			deck.shuffle();

			Game game = new Game(deck.getPlayerHand(), deck.getPlayerHand());
			Boolean fiw = game.firstPlayeWin();
			if (fiw == null) {
				none++;
			} else if (fiw) {
				fp++;
			} else {
				sp++;
			}
		}

		System.out.printf("1: %d\n2: %d \n3: %d \n%s%s\n%.2f %s | %.2f %s ", fp, sp, none, "---PLAYER1---|",
				"---PLAYER2---", (fp * 100.0 / ((fp + sp + none) * 1.0)), "%", (sp * 100.0 / ((fp + sp + none) * 1.0)),
				"%");

	}

}
