package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.simple.ProducerName;
import com.kodilla.good.patterns.food2door.simple.Product;

public class OrderRequest {

    private final ProducerName producerName;
    private final Product product;

    public OrderRequest(ProducerName producerName, Product product) {
        this.producerName = producerName;
        this.product = product;
    }

    public String getProducer() {
        return producerName.getInternal();
    }

    public Product getProduct() {
        return product;
    }
}
