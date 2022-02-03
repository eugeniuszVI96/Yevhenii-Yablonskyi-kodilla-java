package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.simple.Product;

public class OrderDto {

    private final Product product;
    private final boolean isThere;

    public OrderDto(Product product, boolean isOrdered) {
        this.product = product;
        this.isThere = isOrdered;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isThere() {
        return isThere;
    }
}
