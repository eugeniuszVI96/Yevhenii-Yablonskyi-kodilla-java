package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String name = "Triangle";
    Double sideTriangleA;
    Double sideTriangleB;
    Double sideTriangleC;

    public Triangle(Double sideTriangleA, Double sideTriangleB, Double sideTriangleC) {
        this.sideTriangleA = sideTriangleA;
        this.sideTriangleB = sideTriangleB;
        this.sideTriangleC = sideTriangleC;
    }

    public Double getField() {
        double p = getSideTriangleA() + getSideTriangleB() + getSideTriangleC();
        double firstPartEquation = p * (p * getSideTriangleA()) * (p * getSideTriangleB()) * (p * getSideTriangleC());
        double squareRoot = Math.sqrt(firstPartEquation);
        return  squareRoot;
    }

    public String getShapeName() {
        return name;
    }

    public Double getSideTriangleA() {
        return sideTriangleA;
    }

    public Double getSideTriangleB() {
        return sideTriangleB;
    }

    public Double getSideTriangleC() {
        return sideTriangleC;
    }
}