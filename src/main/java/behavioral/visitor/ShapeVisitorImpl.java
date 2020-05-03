package main.java.behavioral.visitor;

import main.java.behavioral.visitor.models.Square;

public class ShapeVisitorImpl implements ShapeVisitor {

//    @Override
//    public double getCircleArea(Circle circle) {
//        return 3.14*circle.getRadius()*circle.getRadius();
//    }

    @Override
    public double getSquareArea(Square square) {
        return square.getSide()*square.getSide();
    }
}
