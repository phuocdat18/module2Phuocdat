package AbstractClass_InterFace.Comparable;

import AbstractClass_InterFace.Colorable.Resizeable;
import AbstractClass_InterFace.Colorable.Shape;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "1 hình tròn có bán kính="
                + getRadius()
                + ", là hình con của "
                + super.toString();
    }

    @Override
    public double resize(double percent) {
        return this.getArea()*percent;
    }
}