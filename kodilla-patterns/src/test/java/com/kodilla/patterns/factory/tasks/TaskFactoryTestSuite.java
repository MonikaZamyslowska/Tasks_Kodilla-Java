package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTaskFactory() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);

        //Then
        Assert.assertEquals("Clothes", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    public void testPaintingTaskFactory() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING_TASK);

        //Then
        Assert.assertEquals("Lady", painting.getTaskName());
        Assert.assertEquals(false, painting.isTaskExecuted());
    }

    @Test
    public void testDrivingTaskFactory() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING_TASK);

        //Then
        Assert.assertEquals("Trip", driving.getTaskName());
        Assert.assertEquals(false, driving.isTaskExecuted());
    }
}
