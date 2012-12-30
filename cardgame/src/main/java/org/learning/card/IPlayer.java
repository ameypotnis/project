package org.learning.card;

import java.util.List;

public interface IPlayer {

	/**
	 * Get cards in players hand
	 * @return List<ICard>
	 */
	public List<ICard> getCards();

	/**
	 * Distribute one card from cards list to all players
	 * @param players
	 * @param cards
	 */
	public void distribute(List<IPlayer> players, List<ICard> cards);

	/**
	 * Get player's name
	 * @return name
	 */
	public String getName();

}
