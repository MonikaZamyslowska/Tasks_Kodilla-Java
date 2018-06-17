package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }
    @Override
    public String getShapeName() {
        return null;
    }

    @Override
    public double getField() {
        return 0;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.getSide(), getSide()) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(getSide());
    }
}
