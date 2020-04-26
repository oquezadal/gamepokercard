package com.bertonisolutions.games.poker.model;

public class Card implements Comparable<Card> {

	private Suit suit;
	private ValueCard value;

	public Card() {
	}

	public Card(Suit suit, ValueCard value) {
		this.suit = suit;
		this.value = value;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public ValueCard getValue() {
		return value;
	}

	public void setValue(ValueCard value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return this.value.toString() + this.suit;
	}

	@Override
	public int compareTo(Card o) {
		int r = this.getValue().compareTo(o.getValue());
		if(r == 0){
			return r;
		} else {
			int me = this.getValue().getValueInt();
			int other = o.getValue().getValueInt();
			return me - other;
		}
	}

}
