package com.kodilla.testing.shape;

import java.util.Objects;

public class Rectangle implements Shape {

    private double lenght;
    private double width;
    private String shapeName;

    public Rectangle(double lenght, double width, String shapeName) {
        this.lenght = lenght;
        this.width = width;
        this.shapeName = shapeName;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return lenght * width;
    }

    public void setLenght(double lenght) {
        if (lenght >= 0) {
            this.lenght = lenght;
        }
    }

    public double getLenght() {
        return lenght;
    }

    public void setWidth(double width) {
        if (width >= 0) {
            this.width = width;
        }
    }

    public double getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.getLenght(), getLenght()) == 0 &&
                Double.compare(rectangle.getWidth(), getWidth()) == 0 &&
                Objects.equals(getShapeName(), rectangle.getShapeName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getLenght(), getWidth(), getShapeName());
    }
}
