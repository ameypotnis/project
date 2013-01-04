package org.learning.patterns.ddd.builder;

public class BulkyItem implements OrderItem {

    private int weight;

	public BulkyItem(int weight) {
    	this.weight = weight;
	}

	public int getShippingCost() {
        return weight * 15;
    }
}