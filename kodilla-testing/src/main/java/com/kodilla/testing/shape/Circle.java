package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private String shapeName;
    private double radius;

    public Circle(String shapeName, double radius) {
        this.shapeName = shapeName;
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        //
        return null;
    }

    @Override
    public double getField() {
        //
        return 0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0 &&
                Objects.equals(getShapeName(), circle.getShapeName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getShapeName(), getRadius());
    }
}
