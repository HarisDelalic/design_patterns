package main.java.behavioral.nullobject.withoptional.models;

public class Square implements Shape {
    private double side;

    public Square() { this.side = 1.0; }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}
