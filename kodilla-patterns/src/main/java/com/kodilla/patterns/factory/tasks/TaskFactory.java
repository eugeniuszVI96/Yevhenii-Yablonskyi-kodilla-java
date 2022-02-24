package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass, final Object... args) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping", (String) args[0], (Integer) args[1]);
            case PAINTING:
                return new PaintingTask("Painting", (String) args[0], (String) args[1]);
            case DRIVING:
                return new DrivingTask("Driving", (String) args[0], (String) args[1]);
            default:
                return null;
        }
    }
}
