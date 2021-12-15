package com.kodilla.stream.lambda.reference;

import com.kodilla.stream.lambda.reference.MathExpression;

public class ExpressionExecutor {

    public void executeExpression(double a, double b, MathExpression mathExpression) {
        double result = mathExpression.calculateExpression(a, b);
        System.out.println("Result equals: " + result);

    }
}
