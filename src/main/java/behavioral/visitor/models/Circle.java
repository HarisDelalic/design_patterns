package main.java.behavioral.visitor.models;

import main.java.behavioral.visitor.ShapeVisitor;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

//    public int getRadius() {
//        return radius;
//    }

    @Override
    public double accept(ShapeVisitor shapeVisitor) {
        return new CircleVisitor().getCircleArea(this);
    }

    private static class CircleVisitor {

        public double getCircleArea(Circle circle) {
            return 3.14*circle.radius*circle.radius;
        }
    }

}
