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

    public Shape getFigure(int n) {
        if (n >= 0 && n < shapeCollection.size()) {
            return shapeCollection.get(n);
        } else {
            return null;
        }
    }

    public String showFigures() {
        String figuresStr = "";
        for(int i = 0; i < shapeCollection.size(); i++) {
            figuresStr = figuresStr + shapeCollection.get(i);
            if (i < shapeCollection.size() - 1) {
                figuresStr = figuresStr + ";";
            }
        }
        return figuresStr;
    }
}