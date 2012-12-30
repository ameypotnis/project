package org.learning.card;

import java.util.ArrayList;
import java.util.List;

public class Player implements IPlayer {

	private String name;
	private List<ICard> cards;

	public Player(String name) {
		this.name = name;
		cards = new ArrayList<ICard>(5);
	}
	
	
	public List<ICard> getCards() {
		return cards;
	}

	public void distribute(List<IPlayer> players, List<ICard> cards) {
		for (IPlayer player : players) {
			ICard card = cards.remove(0);
			player.getCards().add(card);
			System.out.println("Distributed " + card + " to " + player.getName());
		}
	}

	public String getName() {
		return name;
	}

	@Override public String toString() {
		return "Player [name=" + name + ", cards=" + cards + "]";
	}
	
}
