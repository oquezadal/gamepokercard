package com.bertonisolutions.games.poker.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerHand {

	private List<Card> cards;

	public PlayerHand() {
		cards = new ArrayList<>(5);
	}

	public void addCard(Card card) {
		if (cards.size() == 5) {
			throw new RuntimeException("Just five cards per player, return to deck");
		}
		cards.add(card);
	}

	public List<Card> getHand() {
		return cards;
	}

	public String showHand() {
		StringBuilder cards = new StringBuilder();
		for (Card card : this.cards) {
			cards.append(card);
		}
		return cards.toString();
	}

	private boolean isAllCardsSameSuit() {
		Card aux = cards.get(0);
		for (int i = 1; i < 5; i++) {
			if (!aux.getSuit().equals(cards.get(i).getSuit())) {
				return false;
			}
		}
		return true;
	}

	public boolean isRoyalFlush() {
		if (isAllCardsSameSuit()) {
			for (Card card : cards) {
				if (card.getValue() != ValueCard.TEN && card.getValue() != ValueCard.JACK
						&& card.getValue() != ValueCard.QUEEN && card.getValue() != ValueCard.KING
						&& card.getValue() != ValueCard.ACE) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public boolean isStraightFlush() {
		if (isAllCardsSameSuit()) {
			Collections.sort(cards);
			final ValueCard aux = cards.get(0).getValue();
			for (int i = 1; i < 5; i++) {
				if (cards.get(i).getValue().getValueInt() != (aux.getValueInt() + i)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public boolean isFourOfKind() {
		int rep = 0;
		Collections.sort(cards);
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (cards.get(i).getValue() == cards.get(j).getValue()) {
					rep++;
				}
			}
		}
		if (rep == 6) {
			return true;
		}
		return false;
	}

	public String getKicker() {
		if (isFourOfKind()) {

		}
		return null;
	}

	public boolean isFullHouse() {
		int rep = 0;
		int pair = 0;
		Collections.sort(cards);
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (cards.get(i).getValue() == cards.get(j).getValue()) {
					if(rep == 3){
						pair++;
					} else {
						rep++;
					}
				}
			}
		}
		if (pair == 1) {
			return true;
		}
		return false;
	}

	public boolean isFlush() {
		return isAllCardsSameSuit();
	}

	public boolean isStraight() {
		Collections.sort(cards);
		final ValueCard aux = cards.get(0).getValue();
		for (int i = 1; i < 5; i++) {
			if (cards.get(i).getValue().getValueInt() != (aux.getValueInt() + i)) {
				return false;
			}
		}
		return true;
	}

	public boolean isThreeOfKind() {
		int rep = 0;
		Collections.sort(cards);
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (cards.get(i).getValue() == cards.get(j).getValue()) {
					rep++;
				}
			}
		}
		if (rep == 3) {
			return true;
		}
		return false;
	}

	public boolean isTwoPairs() {
		int rep = 0;
		Collections.sort(cards);
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (cards.get(i).getValue() == cards.get(j).getValue()) {
					rep++;
				}
			}
		}
		if (rep == 2) {
			return true;
		}
		return false;
	}

	public boolean isOnePair() {
		int rep = 0;
		Collections.sort(cards);
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (cards.get(i).getValue() == cards.get(j).getValue()) {
					rep++;
				}
			}
		}
		if (rep == 1) {
			return true;
		}
		return false;
	}

	public Card getHighCard() {
		Collections.sort(cards);
		return cards.get(4);
	}

	@Override
	public String toString() {
		return cards.toString();
	}

}
