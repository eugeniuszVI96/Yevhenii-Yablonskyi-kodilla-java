
package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testTaskFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING, "wheel", 2);
        shopping.executeTask();

        //Then
        assertEquals("Shopping", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testTaskFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING, "red", "car");

        //Then
        assertEquals("Painting", painting.getTaskName());
        assertFalse(painting.isTaskExecuted());
    }

    @Test
    void testTaskFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING, "city", "taxi");
        driving.executeTask();

        //Then
        assertEquals("Driving", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }
}
