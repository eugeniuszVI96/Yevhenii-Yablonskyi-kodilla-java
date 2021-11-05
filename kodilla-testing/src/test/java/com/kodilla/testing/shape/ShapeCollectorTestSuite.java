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
        // given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(1.0, 2.0, 3.0);
        Shape square = new Square (3.5);
        Shape circle = new Circle(5.0);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);

        // when
        Shape result = shapeCollector.getFigure(1);

        // then
        assertEquals(new Square(3.5), result);

    }

    @Test
    public void testShowFigures(){

        // given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(1.0, 2.0, 3.0);
        Shape square = new Square (3.5);
        Shape circle = new Circle(5.0);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);

        // when
        String result = shapeCollector.showFigures();

        // then
        assertEquals("Triangle(1.0,2.0,3.0);Square(3.5);Circle(5.0)", result);
    }
}