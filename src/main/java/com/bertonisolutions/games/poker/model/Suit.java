package com.bertonisolutions.games.poker.model;

public enum Suit {
	SPADES, HEARTS, DIAMONDS, CLUBS;
	
	@Override
	public String toString(){
		switch(super.toString()){
			case "SPADES":
				return "S";
			case "HEARTS":
				return "H";
			case "DIAMONDS":
				return "D";
			case "CLUBS":
				return "C";
			default:
				throw new RuntimeException("not valid value");
		}
	}
}
