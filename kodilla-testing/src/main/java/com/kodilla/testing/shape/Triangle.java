package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double sideTriangleA;
    private double sideTriangleB;
    private double sideTriangleC;

    public Triangle(double sideTriangleA, double sideTriangleB, double sideTriangleC) {
        this.sideTriangleA = sideTriangleA;
        this.sideTriangleB = sideTriangleB;
        this.sideTriangleC = sideTriangleC;
    }

    public double getField() {
        double p = sideTriangleA + sideTriangleB + sideTriangleC;
        double firstPartEquation = p * (p * sideTriangleA) * (p * sideTriangleB) * (p * sideTriangleC);
        return Math.sqrt(firstPartEquation);
    }

    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.sideTriangleA, sideTriangleA) != 0) return false;
        if (Double.compare(triangle.sideTriangleB, sideTriangleB) != 0) return false;
        return Double.compare(triangle.sideTriangleC, sideTriangleC) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(sideTriangleA);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideTriangleB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideTriangleC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return getShapeName() + "("+ sideTriangleA  + "," + sideTriangleB + "," + sideTriangleC +")";
    }
}