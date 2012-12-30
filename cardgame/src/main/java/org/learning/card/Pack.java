package org.learning.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.learning.card.ICard.Suit;

public class Pack implements IPack {

	private List<ICard> cards;
	
	public Pack() {
		cards = new ArrayList<ICard>();
		for (int suit = Suit.values().length - 1; suit >= 0; --suit) {
			for (int face = 1; face < 14; face++) {
				addCard(Suit.values()[suit], face);
			}
		}
	}
	
	private void addCard(Suit suit, int face) {
		cards.add(new Card(suit, face));
	}
	
	public List<ICard> getCards() {
		return cards;
	}

	public List<ICard> shuffle() {
		Collections.shuffle(cards);
		return cards;
	}

}
