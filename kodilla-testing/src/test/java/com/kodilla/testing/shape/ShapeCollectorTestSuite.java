package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

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
        Circle circle = new Circle(21.5, "circle");
        Rectangle rectangle = new Rectangle(21.2, 13.3, "rectangle");
        Square square = new Square(55.5, "square");
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
        Circle circle = new Circle(21.5, "circle");
        Rectangle rectangle = new Rectangle(21.2, 13.3, "rectangle");
        Square square = new Square(55.5, "square");
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
        Circle circle = new Circle(21.5, "circle");
        Rectangle rectangle = new Rectangle(21.2, 13.3, "rectangle");
        Square square = new Square(55.5, "square");
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(rectangle);
        shapeCollector.addFigure(square);
        // When
        Shape retrievedFigure = shapeCollector.getFigure(0);
        // Then
        Assert.assertEquals(retrievedFigure, circle);
    }

    @Test
    public void testShowFigure() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(21.5, "circle");
        Rectangle rectangle = new Rectangle(21.2, 13.3, "rectangle");
        Square square = new Square(55.5, "square");
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(rectangle);
        shapeCollector.addFigure(square);
        // When
        ArrayList<Shape> theShape = shapeCollector.showFigures();
        // Then
        Assert.assertEquals(theShape.get(0), circle);
        Assert.assertEquals(theShape.get(1), rectangle);
        Assert.assertEquals(theShape.get(2), square);
    }
}
