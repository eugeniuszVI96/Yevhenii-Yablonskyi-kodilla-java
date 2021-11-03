package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<String> shapeCollection = new ArrayList<>();

    public List<String> getShapeCollection() {
        return shapeCollection;
    }

    public void addFigure(Shape shape) {
        shapeCollection.add(shape.getAll());
    }

    public boolean removeFigure(Shape shape) {
        shapeCollection.remove(shape.getAll());
        return true;
    }

    public String getFigure(int n) {
        String figure = shapeCollection.get(n);
        return figure;
    }

    public String showFigures() {
        String figure = null;
        for(int i = 0; i< shapeCollection.size(); i++) {
            figure = shapeCollection.get(i);
        }
        return figure;
    }
}