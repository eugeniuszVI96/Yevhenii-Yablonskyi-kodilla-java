package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeCollection = new ArrayList<>();

    public List<Shape> getShapeCollection() {
        return shapeCollection;
    }

    public void addFigure(Shape shape) {
        shapeCollection.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        shapeCollection.remove(shape);
        return true;
    }

    public Shape getFigure(int n){
        Shape figure = shapeCollection.get(n);
        return figure;
    }

    public void showFigures(){
        for(int i = 0; i< shapeCollection.size(); i++) {
            System.out.println(shapeCollection.get(i));
        }
    }
}