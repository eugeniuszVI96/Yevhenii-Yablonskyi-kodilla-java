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
        Shape shape = new Square("Square");

        //When
        shapeCollector.addFigure(shape);

        //Then
        assertEquals(1, shapeCollector.getShapeCollection().size());
    }

    @Test
    public void testRemoveFigure(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square("Square");
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
        Shape shape = new Square("Square");
        shapeCollector.addFigure(shape);

        //When
        Shape result = shapeCollector.getFigure(0);

        //Then
        assertEquals(shape, result);
    }

    @Test
    public void testShowFigures(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square("Square");
        shapeCollector.addFigure(shape);

        ArrayList<Shape> shapeList= new ArrayList<>();
        shapeList.add(shape);

        //When
        List<Shape> shapeResultList = shapeCollector.getShapeCollection();

        //Then
        assertEquals(shapeList, shapeResultList);
    }
}