package main.java.behavioral.visitor.models;

import main.java.behavioral.visitor.ShapeVisitor;

public interface Shape {
    double accept(ShapeVisitor shapeVisitor);

}
