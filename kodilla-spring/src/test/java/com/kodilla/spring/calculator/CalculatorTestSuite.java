package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        int a = 12;
        int b = 2;
        int c = 0;

        //When
        double resultAdd = calculator.add(a, b);
        double resultSub = calculator.sub(a, b);
        double resultMul = calculator.mul(a, b);
        double resultDiv = calculator.div(a, b);
        double resultDiv2 = calculator.div(a, c);

        //Then
        assertEquals(14, resultAdd);
        assertEquals(10, resultSub);
        assertEquals(24, resultMul);
        assertEquals(6, resultDiv);
        assertEquals(Double.NaN, resultDiv2);
    }
}