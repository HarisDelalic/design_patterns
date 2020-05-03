package main.java.behavioral.nullobject.withoutoptional.models;

public class Circle implements Shape {
    private static double PI = 3.141592;
    private double radius;

    public Circle() { this.radius = 1.0; }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
