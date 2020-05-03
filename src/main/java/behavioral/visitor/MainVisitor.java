package main.java.behavioral.visitor;

import main.java.behavioral.visitor.models.Circle;
import main.java.behavioral.visitor.models.Shape;
import main.java.behavioral.visitor.models.Square;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainVisitor {

    public static void main(String[] args) {
        Shape c1 = new Circle(5);
        Shape c2 = new Circle(10);
        Shape s1 = new Square(2.5);

        ShapeVisitor shapeVisitor = new ShapeVisitorImpl();

        List<Shape> shapes = Stream.of(c1, c2, s1).collect(Collectors.toList());

        double totalArea = 0.0;

        for(Shape shape : shapes) {
            totalArea += shape.accept(shapeVisitor);
        }

        System.out.println(totalArea);
    }
}
