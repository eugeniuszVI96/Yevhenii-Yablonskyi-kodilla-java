package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.interfaces.Manufacturer;

public class OrderProcessor {

    private final Manufacturer manufacturer;

    public OrderProcessor(final Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void process(final OrderRequest orderRequest) {
        manufacturer.process(orderRequest);
    }
}