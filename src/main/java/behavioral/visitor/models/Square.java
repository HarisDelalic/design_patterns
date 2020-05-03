package main.java.behavioral.visitor.models;

import main.java.behavioral.visitor.ShapeVisitor;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double accept(ShapeVisitor shapeVisitor) {
        return shapeVisitor.getSquareArea(this);
    }
}
