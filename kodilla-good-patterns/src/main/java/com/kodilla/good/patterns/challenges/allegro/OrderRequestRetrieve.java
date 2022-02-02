package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class OrderRequestRetrieve {

    public OrderRequest retrieve() {
        User user = new User("seba94", "Sebastian", "Rogoz", "Warszawska 32, 50-344 Wroclaw");
        Product product = new Product("AS633339840", "Samsung A51", "black");
        LocalDateTime timeOrder = LocalDateTime.of(2020, 1, 3, 13, 5);
        return new OrderRequest(timeOrder, product, user);
    }
}
