package org.learning.card;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.learning.card.ICard.Suit;


public class PackTest {
	
	private static final List<ICard> ALL_CARDS_IN_ORDER = new ArrayList<ICard>();

	@Test public void openPackAndCheckCardCountAndFirstAndLastCard() {
		IPack pack = new Pack();
		List<ICard> cards = pack.getCards();
		assertEquals(52, cards.size());
		assertEquals(new Card(Suit.D, 1), cards.get(0));
		assertEquals(new Card(Suit.S, 13), cards.get(cards.size() - 1));
	}
	
	@Test public void openPackAndCheckCompleteOrder() {
		createOrderedCardList();
		assertEquals(ALL_CARDS_IN_ORDER, new Pack().getCards());
	}

	@Test public void shuffleCardsAndCheckOrderHasChanged() {
		assertNotSame(ALL_CARDS_IN_ORDER, new Pack().shuffle());
	}
	
	private void createOrderedCardList() {
		for (int i = Suit.values().length - 1; i >= 0 ; i--) {
			for (int face = 1; face < 14; face++) {
				ALL_CARDS_IN_ORDER.add(new Card(Suit.values()[i], face));
			}
		}
	}
}
