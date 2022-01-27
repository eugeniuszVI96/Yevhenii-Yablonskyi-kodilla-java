package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.simple.classes.Product;
import com.kodilla.good.patterns.food2door.simple.classes.Supplier;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        Supplier supplier = new Supplier("Alex Grand");
        Product product = new Product("Samsung L49");
        int noOfItems = 10;

        return new OrderRequest(supplier, product, noOfItems);
    }
}