package org.learning.card;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PlayerTest {

	@Test public void checkPlayersCreation() {
		IPlayer amey = new Player("Amey");
		assertEquals("Amey", amey.getName());
		assertEquals(0, amey.getCards().size());
	}

	@Test public void checkPlayerDistributeCardsAndEachPlayerHasOneCardInHand() {
		List<ICard> cards =  new Pack().shuffle();
		List<IPlayer> players = new ArrayList<IPlayer>();
		IPlayer amey = addPlayers(players);
		amey.distribute(players, cards);
		assertEquals(48, cards.size());
		assetEachPlayerHasOneCardInHand(players);
		assetCardsInHandAreUnique(players);
	}

	private void assetCardsInHandAreUnique(List<IPlayer> players) {
		assertNotSame(players.get(0).getCards().get(0), players.get(1).getCards().get(0));
		assertNotSame(players.get(2).getCards().get(0), players.get(3).getCards().get(0));
	}

	private void assetEachPlayerHasOneCardInHand(List<IPlayer> players) {
		for (IPlayer player : players) {
			assertEquals(1, player.getCards().size());
		}
	}

	private IPlayer addPlayers(List<IPlayer> players) {
		IPlayer amey = new Player("Amey");
		players.add(amey);
		players.add(new Player("Prashant"));
		players.add(new Player("Vishwas"));
		players.add(new Player("Anil"));
		return amey;
	}
}
