package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int numbers [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2};

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(4.65, result);
    }

    @Test
    void testGetAverageWhenIsEmpty() {
        //Given
        int numbers [] = {};

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(Double.NaN, result);
    }
}
