package com.bertonisolutions.games.poker.model;

public enum ValueCard {
	TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;

	@Override
	public String toString() {
		switch(super.toString()){
			case "TWO":
				return "2";
			case "THREE":
				return "3";
			case "FOUR":
				return "4";
			case "FIVE":
				return "5";
			case "SIX":
				return "6";
			case "SEVEN":
				return "7";
			case "EIGHT":
				return "8";
			case "NINE":
				return "9";
			case "TEN":
				return "10";
			case "JACK":
				return "J";
			case "QUEEN":
				return "Q";
			case "KING":
				return "K";
			case "ACE":
				return "A";
			default:
				throw new RuntimeException("not valid value");
		}
	}
	
	public int getValueInt() {
		switch(super.toString()){
			case "TWO":
				return 2;
			case "THREE":
				return 3;
			case "FOUR":
				return 4;
			case "FIVE":
				return 5;
			case "SIX":
				return 6;
			case "SEVEN":
				return 7;
			case "EIGHT":
				return 8;
			case "NINE":
				return 9;
			case "TEN":
				return 10;
			case "JACK":
				return 11;
			case "QUEEN":
				return 12;
			case "KING":
				return 13;
			case "ACE":
				return 14;
			default:
				throw new RuntimeException("not valid value");
		}
	}
	
	public static ValueCard toValueCard(int value){
		switch(value){
			case 1:
				return ValueCard.ACE;
			case 2:
				return ValueCard.TWO;
			case 3:
				return ValueCard.THREE;
			case 4:
				return ValueCard.FOUR;
			case 5:
				return ValueCard.FIVE;
			case 6:
				return ValueCard.SIX;
			case 7:
				return ValueCard.SEVEN;
			case 8:
				return ValueCard.EIGHT;
			case 9:
				return ValueCard.NINE;
			case 10:
				return ValueCard.TEN;
			case 11:
				return ValueCard.JACK;
			case 12:
				return ValueCard.QUEEN;
			case 13:
				return ValueCard.KING;
			default:
				throw new RuntimeException("not valid value");
		}
	}
}
