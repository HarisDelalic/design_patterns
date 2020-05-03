package main.java.behavioral.template;

import main.java.behavioral.template.models.Circle;
import main.java.behavioral.template.models.Shape;
import main.java.behavioral.template.models.Square;

public class MainTemplate {

    public static void main(String[] args) {
        Shape square = new Square("MySquare");
        Shape circle = new Circle("MyCircle");

        System.out.println(square.getDescriptiveName());
        System.out.println(circle.getDescriptiveName());
    }
}
