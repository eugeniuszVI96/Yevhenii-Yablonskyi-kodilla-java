package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.simple.ProducerName;
import com.kodilla.good.patterns.food2door.simple.Product;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        ProducerName producerName = new ProducerName("ExtraFoodShop");
        Product product = new Product("Orange", 5);

        return new OrderRequest(producerName,product);
    }
}
