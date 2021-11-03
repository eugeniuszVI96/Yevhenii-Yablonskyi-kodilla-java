package com.kodilla.testing.shape;

public interface Shape {

    String getShapeName();
    Double getField();

    default String getAll() {
        return getShapeName() + "(" + getField() + ")";
    }
}