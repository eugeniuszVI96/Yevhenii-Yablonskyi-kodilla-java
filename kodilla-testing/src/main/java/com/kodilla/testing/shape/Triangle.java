package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String triangle;

    public Triangle(String triangle) {
        this.triangle = triangle;
    }

    public void getShapeName() {
        System.out.println(getTriangle());
    }

    public void getField() {
    }

    public String getTriangle() {
        return triangle;
    }
}