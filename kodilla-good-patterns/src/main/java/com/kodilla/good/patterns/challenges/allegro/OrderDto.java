package com.kodilla.good.patterns.challenges.allegro;

public class OrderDto {

    private Product product;
    private boolean isSuccessfullySold;

    public OrderDto(Product product, boolean isSuccessfullySold) {
        this.product = product;
        this.isSuccessfullySold = isSuccessfullySold;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isSuccessfullySold() {
        return isSuccessfullySold;
    }
}
