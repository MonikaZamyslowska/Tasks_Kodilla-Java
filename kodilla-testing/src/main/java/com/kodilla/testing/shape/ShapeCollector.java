package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapeCollectors = new ArrayList<>();

    public void addFigure(Shape shape) {
        // do nothing
    }

    public boolean removeFigure(Shape shape) {
        return false;
    }

    public Shape getFigure(int n) {
        return shapeCollectors.get(n);
    }

    public int getFigureQuantity() {
        return 0;
    }

    public void showFigures() {
        // do nothing
    }
}
