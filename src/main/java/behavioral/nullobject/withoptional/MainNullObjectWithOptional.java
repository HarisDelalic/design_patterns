package main.java.behavioral.nullobject.withoptional;

import main.java.behavioral.nullobject.withoutoptional.models.Shape;

import java.util.Optional;

public class MainNullObjectWithOptional {
    /**
     * IMPORTANT: with Optional, it is not required to have NullShape
     *
     * static ShapeFactory.getShape returns optional
     * Based if object exists or not, we print its data
     * @param args
     */
    public static void main(String[] args) {
        String[] shapeNames = {"circle", "square", null, "octagon", "circle"};

        for (String shapeName : shapeNames) {
            Optional<Shape> shape = ShapeFactoryWithOptional.getShape(shapeName);

            shape.ifPresentOrElse(shape1 -> {
                System.out.println(shape1.getArea());
                System.out.println(shape1.getPerimeter());
                System.out.println();
            }, () -> {
                System.out.println("NULL OBJECT");
            });
        }
    }
}
