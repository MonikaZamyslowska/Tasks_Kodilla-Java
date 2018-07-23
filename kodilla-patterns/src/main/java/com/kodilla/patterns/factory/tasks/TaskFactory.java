package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING";
    public static final String PAINTING_TASK = "PAINTING";
    public static final String DRIVING_TASK = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Clothes", "Dresses", 3);
            case PAINTING_TASK:
                return new PaintingTask("Lady", "Colorful", "Lady in red dress");
            case DRIVING_TASK:
                return new DrivingTask("Trip", "Bahama", "Boats");
            default:
                return null;
        }
    }
}
