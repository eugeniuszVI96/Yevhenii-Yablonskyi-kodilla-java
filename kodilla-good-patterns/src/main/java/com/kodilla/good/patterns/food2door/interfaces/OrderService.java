package com.kodilla.good.patterns.food2door.interfaces;

import com.kodilla.good.patterns.food2door.simple.classes.Product;
import com.kodilla.good.patterns.food2door.simple.classes.Supplier;

public interface OrderService {

    boolean order(Supplier supplier, Product product);
}