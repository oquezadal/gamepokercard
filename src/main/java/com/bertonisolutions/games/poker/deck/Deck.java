package com.bertonisolutions.games.poker.deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bertonisolutions.games.poker.model.Card;
import com.bertonisolutions.games.poker.model.PlayerHand;
import com.bertonisolutions.games.poker.model.Suit;
import com.bertonisolutions.games.poker.model.ValueCard;

public class Deck {

	private List<Card> cards;
	
	public Deck(){
		cards = new ArrayList<>();
		this.loadCards();
	}
	
	private void loadCards(){
		for (int i = 0; i < 13; i++) {
			cards.add(new Card(Suit.SPADES, ValueCard.toValueCard(i + 1)));
			cards.add(new Card(Suit.HEARTS, ValueCard.toValueCard(i + 1)));
			cards.add(new Card(Suit.DIAMONDS, ValueCard.toValueCard(i + 1)));
			cards.add(new Card(Suit.CLUBS, ValueCard.toValueCard(i + 1)));
		}
	}
	
	public void shuffle(){
		Collections.shuffle(cards);
	}
	
	public Card popCard(){
		return cards.remove(cards.size()-1);
	}
	
	public PlayerHand getPlayerHand(){
		PlayerHand player = new PlayerHand();
		for(int i = 0; i<5;i++){
			player.addCard(this.popCard());
		}
		return player;
	}
	
	@Override
	public String toString(){
		return this.cards.toString();
	}
	
}
