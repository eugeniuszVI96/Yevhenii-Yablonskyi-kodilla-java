package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {
    public boolean order(final User user,
                         final Product product,
                         final LocalDateTime orderTime) {
        System.out.println("Date: " + orderTime.toString()
                + ", product: (" + product.getIndex() + "), " + product.getName() + ", type: " + product.getType()
                + " was ordered by the: " + user.getUserName() + " (" + user.getFirstName() + " " + user.getLastName()
                + ") to the " + user.getAddress());
        return true;
    }
}
