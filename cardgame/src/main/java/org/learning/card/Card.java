package org.learning.card;

public class Card implements ICard {
	
	private Suit suit;
	private Integer face;
	
	public Card(Suit suit, Integer face) {
		this.suit = suit;
		this.face = face;
	}
	
	@Override public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (face == null) {
			if (other.face != null)
				return false;
		} else if (!face.equals(other.face))
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}

	@Override public String toString() {
		return this.suit + " " + this.face;
	}

}
