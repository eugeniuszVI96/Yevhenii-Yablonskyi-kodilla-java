package com.kodilla.stream.array;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        return IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .orElse(Double.NaN);
    }
}
