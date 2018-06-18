package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapeCollectors = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapeCollectors.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeCollectors.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapeCollectors.get(n);
    }

    public int getFigureQuantity() {
        return shapeCollectors.size();
    }

    public ArrayList<Shape> showFigures() {
        for (int i = 0; i < shapeCollectors.size(); i++) {
            System.out.println("Shape #" + i + " " + shapeCollectors.get(i).getShapeName() + ", Area = " + shapeCollectors.get(i).getField());
        }
        return shapeCollectors;
    }
}
