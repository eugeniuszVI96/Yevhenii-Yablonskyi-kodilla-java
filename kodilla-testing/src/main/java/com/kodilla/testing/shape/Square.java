package com.kodilla.testing.shape;

public class Square implements Shape{

    public String square;

    public Square(String square) {
        this.square = square;
    }

    public void getShapeName() {
        System.out.println(getSquare());
    }

    public void getField() {
    }

    public String getSquare() {
        return square;
    }
}