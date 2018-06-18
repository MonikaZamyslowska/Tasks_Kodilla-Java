package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private double side;
    private String shapeName;

    public Square(double side, String shapeName) {
        this.side = side;
        this.shapeName = shapeName;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return side * side;
    }

    public void setSide(double side) {
        if (side >= 0) {
            this.side = side;
        }
    }

    public double getSide() {
        return side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.getSide(), getSide()) == 0 &&
                Objects.equals(getShapeName(), square.getShapeName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getSide(), getShapeName());
    }
}
