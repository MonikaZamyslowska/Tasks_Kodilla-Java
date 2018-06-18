package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private double radius;
    private String shapeName;

    public Circle(double radius, String shapeName) {
        this.radius = radius;
        this.shapeName = shapeName;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return radius * radius * Math.PI;
    }

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
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

        return Objects.hash(getRadius(), getShapeName());
    }
}
