package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    private static int testCounter = 0;

    @Before
    public void beforeAllTest(){
        testCounter++;
        System.out.println("Beginning of the test #" + testCounter);

    }

    @After
    public void afterAllTest(){
        System.out.println("The end test #" + testCounter);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        // Given
        ArrayList<Integer> allNumbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        // When
        List<Integer> actual= oddNumbersExterminator.exterminate(allNumbers);
        // Then
        Assert.assertEquals(actual.isEmpty(), true);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        // Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> allNumbers = new ArrayList<>();
        for(int i = 1; i < 20; i++) {
            allNumbers.add(i);
        }
        // When
        List<Integer> actual = oddNumbersExterminator.exterminate(allNumbers);
        // Then
        for (int i = 0; i < actual.size(); i++) {
            Assert.assertEquals(actual.get(i) % 2, 0);
        }
    }
}
