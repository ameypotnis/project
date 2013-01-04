package org.learning.patterns.ddd.builder;

public class LightweightItem implements OrderItem {

	private int weight;

	public LightweightItem(int weight) {
		this.weight = weight;
	}

	public int getShippingCost() {
		return weight * 5;
	}
}
