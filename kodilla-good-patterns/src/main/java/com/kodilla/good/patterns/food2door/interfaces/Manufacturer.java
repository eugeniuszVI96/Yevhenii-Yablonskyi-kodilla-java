package com.kodilla.good.patterns.food2door.interfaces;

import com.kodilla.good.patterns.food2door.OrderDto;
import com.kodilla.good.patterns.food2door.OrderRequest;

public interface Manufacturer {

    OrderDto process(OrderRequest orderRequest);
}
