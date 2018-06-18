package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("This is the beginning of tests.");
    }

    @Before
    public void beforeAllTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @AfterClass
    public static void affterClass() {
        System.out.println("All tests are finished.");
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(21.5);
        Rectangle rectangle = new Rectangle(21.2, 13.3);
        Square square = new Square(55.5);
        // When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(rectangle);
        shapeCollector.addFigure(square);
        // Then
        Assert.assertEquals(shapeCollector.getFigureQuantity(), 3);
    }

    @Test
    public void testRemoveFigure() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(21.5);
        Rectangle rectangle = new Rectangle(21.2, 13.3);
        Square square = new Square(55.5);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(rectangle);
        shapeCollector.addFigure(square);
        // When
        shapeCollector.removeFigure(rectangle);
        // Then
        Assert.assertEquals(shapeCollector.getFigureQuantity(), 2);
    }

    @Test
    public void testGetFigure() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(21.5);
        Rectangle rectangle = new Rectangle(21.2, 13.3);
        Square square = new Square(55.5);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(rectangle);
        shapeCollector.addFigure(square);
        // When
        Shape retrievedFigure = shapeCollector.getFigure(1);
        // Then
        Assert.assertEquals(retrievedFigure, circle);
    }

    @Test
    public void testShowFigure() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(21.5);
        Rectangle rectangle = new Rectangle(21.2, 13.3);
        Square square = new Square(55.5);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(rectangle);
        shapeCollector.addFigure(square);
        // When
        String retrivedFigure = shapeCollector.getFigure(1).getShapeName();
        // Then
        Assert.assertEquals(retrivedFigure, circle.getShapeName());
    }
}
