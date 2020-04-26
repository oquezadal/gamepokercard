package com.bertonisolutions.games.poker;

import com.bertonisolutions.games.poker.model.PlayerHand;

public class Game {

	private PlayerHand firstPlayer;
	private PlayerHand secondPlayer;

	public Game() {
	}

	public Game(PlayerHand firstPlayer, PlayerHand secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public String whoWins(){
		return firstPlayeWin() ? "PLAYER1" : "PLAYER2";
	}
	
	public Boolean firstPlayeWin(){
		if(firstPlayer.isRoyalFlush() && secondPlayer.isRoyalFlush()){
			return null;
		} else if(firstPlayer.isRoyalFlush() && !secondPlayer.isRoyalFlush()){
			return true;
		} else if(!firstPlayer.isRoyalFlush() && secondPlayer.isRoyalFlush()){
			return false;
		}
		if(firstPlayer.isStraightFlush() && secondPlayer.isStraightFlush()){
			return null;
		} else if(firstPlayer.isStraightFlush() && !secondPlayer.isStraightFlush()){
			return true;
		} else if(!firstPlayer.isStraightFlush() && secondPlayer.isStraightFlush()){
			return false;
		}
		
		if(firstPlayer.isFourOfKind() && secondPlayer.isFourOfKind()){
			return null;
		} else if(firstPlayer.isFourOfKind() && !secondPlayer.isFourOfKind()){
			return true;
		} else if(!firstPlayer.isFourOfKind() && secondPlayer.isFourOfKind()){
			return false;
		}
		
		if(firstPlayer.isFullHouse() && secondPlayer.isFullHouse()){
			return null;
		} else if(firstPlayer.isFullHouse() && !secondPlayer.isFullHouse()){
			return true;
		} else if(!firstPlayer.isFullHouse() && secondPlayer.isFullHouse()){
			return false;
		}
		
		if(firstPlayer.isFlush() && secondPlayer.isFlush()){
			return null;
		} else if(firstPlayer.isFlush() && !secondPlayer.isFlush()){
			return true;
		} else if(!firstPlayer.isFlush() && secondPlayer.isFlush()){
			return false;
		}
		
		if(firstPlayer.isStraight() && secondPlayer.isStraight()){
			return null;
		} else if(firstPlayer.isStraight() && !secondPlayer.isStraight()){
			return true;
		} else if(!firstPlayer.isStraight() && secondPlayer.isStraight()){
			return false;
		}
		
		if(firstPlayer.isThreeOfKind() && secondPlayer.isThreeOfKind()){
			return null;
		} else if(firstPlayer.isThreeOfKind() && !secondPlayer.isThreeOfKind()){
			return true;
		} else if(!firstPlayer.isThreeOfKind() && secondPlayer.isThreeOfKind()){
			return false;
		}
		
		if(firstPlayer.isTwoPairs() && secondPlayer.isTwoPairs()){
			return null;
		} else if(firstPlayer.isTwoPairs() && !secondPlayer.isTwoPairs()){
			return true;
		} else if(!firstPlayer.isTwoPairs() && secondPlayer.isTwoPairs()){
			return false;
		}
		
		if(firstPlayer.isOnePair() && secondPlayer.isOnePair()){
			return null;
		} else if(firstPlayer.isOnePair() && !secondPlayer.isOnePair()){
			return true;
		} else if(!firstPlayer.isOnePair() && secondPlayer.isOnePair()){
			return false;
		}
		
		if(firstPlayer.getHighCard().compareTo(secondPlayer.getHighCard())  == 0){
			return null;
		} else if(firstPlayer.getHighCard().compareTo(secondPlayer.getHighCard())  > 0){
			return true;
		} else {
			return false;
		}
	}
}
