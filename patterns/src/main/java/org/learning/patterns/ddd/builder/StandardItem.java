package org.learning.patterns.ddd.builder;

public class StandardItem implements OrderItem {

	private int weight;

	public StandardItem(int weight) {
		this.weight = weight;
	}

	public int getShippingCost() {
		return weight * 10;
	}

}
