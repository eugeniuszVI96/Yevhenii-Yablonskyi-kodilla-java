package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class OrderRequest {

    private final User user;
    private final Product product;
    private final LocalDateTime timeOrder;

    public OrderRequest(LocalDateTime timeOrder, Product product, User user) {
        this.user = user;
        this.product = product;
        this.timeOrder = timeOrder;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getTimeOrder() {
        return timeOrder;
    }
}
