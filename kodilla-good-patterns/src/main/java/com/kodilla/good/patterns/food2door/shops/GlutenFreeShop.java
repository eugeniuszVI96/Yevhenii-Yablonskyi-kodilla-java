package com.kodilla.good.patterns.food2door.shops;

import com.kodilla.good.patterns.food2door.OrderDto;
import com.kodilla.good.patterns.food2door.interfaces.FoodProducer;
import com.kodilla.good.patterns.food2door.simple.Product;

public class GlutenFreeShop implements FoodProducer {

    public String getName() {
        return getClass().getSimpleName();
    }

    public OrderDto process(Product product) {

        return new OrderDto(product, product.getQuantity() < 1.0);
    }
}
