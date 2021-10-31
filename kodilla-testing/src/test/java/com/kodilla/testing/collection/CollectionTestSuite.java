package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.*;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void beforeEach() {
        System.out.println("Test case: start");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Test case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test suite: start");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test suite: end");
    }

    @DisplayName("When the list is empty it doesn't appear error")
    @Test
    void testOddNumberExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>();
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();

        //When
        List<Integer> result = oddNumberExterminator.exterminate(emptyList);

        //Then
        Assertions.assertEquals(result, emptyList);
    }

    @DisplayName("When the list is filled numbers odd and even it doesn't appear error")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List listDifferentNumbers = Arrays.asList(1, 2, 3);
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        List<Integer> testListEven = Arrays.asList(2);

        //When
        List<Integer> result = oddNumberExterminator.exterminate(listDifferentNumbers);

        //Then
        Assertions.assertEquals(result, testListEven);
    }
}
