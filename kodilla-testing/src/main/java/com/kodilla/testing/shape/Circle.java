package com.kodilla.testing.shape;

public class Circle implements Shape{

    String name = "Circle";
    Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getField() {
        double pi = 3.14;
        pi = getRadius() * pi;
        return pi;
    }

    public String getShapeName() {
        return name;
    }

    public Double getRadius() {
        return radius;
    }

}