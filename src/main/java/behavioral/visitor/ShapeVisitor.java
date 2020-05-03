package main.java.behavioral.visitor;

import main.java.behavioral.visitor.models.Square;

public interface ShapeVisitor {
//    double getCircleArea(Circle circle);
    double getSquareArea(Square square);
}
