package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "Wheel", 2);
            case PAINTING:
                return new PaintingTask("Painting", "Red", "Car");
            case DRIVING:
                return new DrivingTask("Driving", "City centre", "Taxi");
            default:
                return null;
        }
    }
}
