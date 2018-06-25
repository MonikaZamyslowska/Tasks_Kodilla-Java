package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTestSuite {
    @Test
    public void testGetAverage() {
        // Given
        int[] nums = {7, 5, 5, 3, 4, 2};
        //When
        double average = ArrayOperations.getAverage(nums);
        //Then
        Assert.assertEquals(4.3, average, 0.1);
    }
}
