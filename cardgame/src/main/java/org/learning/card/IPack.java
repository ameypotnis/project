package org.learning.card;

import java.util.List;

/**
 * Contract to represent pack
 */
public interface IPack {
	
	/**
	 * To get cards in the pack
	 * @return List<ICard> 
	 */
	public List<ICard> getCards();
	
	/**
	 * Shuffle cards in the pack and return shuffled cards
	 * @return List<ICard> 
	 */
	public List<ICard> shuffle();

}
