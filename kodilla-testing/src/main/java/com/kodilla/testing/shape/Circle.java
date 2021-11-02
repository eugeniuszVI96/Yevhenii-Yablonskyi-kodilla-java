package com.kodilla.testing.shape;

public class Circle implements Shape{

    String circle;

    public Circle(String circle) {
        this.circle = circle;
    }

    public void getShapeName() {
        System.out.println(getCircle());
    }

    public void getField() {
    }

    public String getCircle() {
        return circle;
    }
}