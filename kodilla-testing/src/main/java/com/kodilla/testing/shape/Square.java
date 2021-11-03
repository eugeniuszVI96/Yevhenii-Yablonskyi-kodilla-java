package com.kodilla.testing.shape;

public class Square implements Shape{

    public String name = "Square";
    public Double sideSquare;

    public Square(Double sideSquare) {
        this.sideSquare = sideSquare;
    }

    public Double getField() {
        double result = getSideSquare() * getSideSquare();
        return result;
    }

    public String getShapeName() {
        return name;
    }

    public Double getSideSquare() {
        return sideSquare;
    }
}