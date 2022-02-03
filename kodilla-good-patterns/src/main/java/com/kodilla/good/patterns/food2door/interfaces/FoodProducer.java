package com.kodilla.good.patterns.food2door.interfaces;

import com.kodilla.good.patterns.food2door.OrderDto;
import com.kodilla.good.patterns.food2door.simple.Product;

public interface FoodProducer {

    String getName();
    OrderDto process(Product product);
}
