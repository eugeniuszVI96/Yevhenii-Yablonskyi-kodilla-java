package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.simple.Product;

import java.util.*;

public class ProducerRepository {

    private static final Map<String, List<Product>> data = new HashMap<>();

    static {
        data.put("ExtraFoodShop", Arrays.asList(
                new Product("Orange", 5),
                new Product("Banana",7)
        ));
    }

    public Double getForProducer(String producerName, String productName) {
        return data.get(producerName).stream()
                .filter(product -> product.getName().equals(productName))
                .map(product -> product.getQuantity())
                .findFirst()
                .orElse(null);
    }
}
