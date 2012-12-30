package org.learning.card;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Main executable
 *
 */
public class MainGame {
	
	private final List<IPlayer> players;
	List<ICard> cards;
	
	
	public MainGame() {
		players =  new  ArrayList<IPlayer>(4);
		cards = new Pack().shuffle();
		System.out.println("Opened pack and shuffled cards: " + cards);
	}

	private void distributeCard() {
		if (players.size() == 0) {
			System.err.println("Add players first");
			return;
		}
		players.get(0).distribute(players, cards);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MainGame game = new MainGame();
		game.addPlayers();
		game.distributeCard();
	}

	private void addPlayers() {
		players.add(new Player("Amey"));
		players.add(new Player("Prashant"));
		players.add(new Player("Vishwas"));
		players.add(new Player("Anil"));
		System.out.println("Added players : " + players);		
	}

}
