package org.learning.patterns.ddd.builder;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<OrderItem> orderItems;

    protected Cart() {
        this.orderItems = new ArrayList<OrderItem>();
    }

    public static class Builder {
        private Cart cart;

        public Builder() {
            this.cart = new Cart();
        }

        public Builder withBulkyItem(int weight) {
            this.cart.add(new BulkyItem(weight));
            return this;
        }

        public Builder withStandardItem(int weight) {
            this.cart.add(new StandardItem(weight));
            return this;
        }

        public Builder withLightweightItem(int weight) {
            this.cart.add(new LightweightItem(weight));
            return this;
        }

        public Cart build() {
            if (cart.orderItems.size() == 0) {
                throw new IllegalStateException("...");
            }
            return this.cart;
        }
    }

    void add(OrderItem item) {
        this.orderItems.add(item);

    }

    public int getShippingCosts() {
        int shippingCosts = 0;
        for (OrderItem orderItem : orderItems) {
            shippingCosts += orderItem.getShippingCost();
        }
        return shippingCosts;
    }
}