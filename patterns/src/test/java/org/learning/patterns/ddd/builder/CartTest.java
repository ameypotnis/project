package org.learning.patterns.ddd.builder;

import org.junit.Test;
import org.learning.patterns.ddd.builder.Cart.Builder;

import static org.junit.Assert.*;

public class CartTest {

	@Test public void cartHasMultipleItems() {
		Cart cart = new Builder().withLightweightItem(4)
				.withStandardItem(3).withBulkyItem(2).build();
		assertEquals(80, cart.getShippingCosts());
	}
	
	@Test(expected = IllegalStateException.class) 
	public void buildShouldThrowAnExceptionForEmptyCart() {
		new Builder().build();
	}
}
