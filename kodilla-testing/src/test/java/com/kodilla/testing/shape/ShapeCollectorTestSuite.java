package com.kodilla.testing.shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(3.1);

        //When
        shapeCollector.addFigure(shape);

        //Then
        assertEquals(1, shapeCollector.getShapeCollection().size());
    }

    @Test
    public void testRemoveFigure(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(3.1);
        shapeCollector.addFigure(shape);

        //When
        boolean result = shapeCollector.removeFigure(shape);

        //Then
        assertTrue(result);
        assertEquals(0, shapeCollector.getShapeCollection().size());
    }

    @Test
    public void testGetFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(3.1);
        shapeCollector.addFigure(shape);
        List<String> test = shapeCollector.getShapeCollection();
        String getTest = test.get(0);

        //When
        String result = shapeCollector.getFigure(0);

        //Then
        assertEquals(test, result);
    }

    @Test
    public void testShowFigures(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(3.1);
        shapeCollector.addFigure(shape);
        String figure = shapeCollector.getFigure(0);

        //When
        String shapeResultList = shapeCollector.showFigures();

        //Then
        assertEquals(figure, shapeResultList);
    }
}