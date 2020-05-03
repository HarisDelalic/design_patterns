package main.java.behavioral.nullobject.withoptional;

import main.java.behavioral.nullobject.withoutoptional.models.Circle;
import main.java.behavioral.nullobject.withoutoptional.models.Shape;
import main.java.behavioral.nullobject.withoutoptional.models.Square;

import java.util.Optional;

public class ShapeFactoryWithOptional {

    public static Optional<Shape> getShape(String shapeName) {
        Shape shape = null;

        if ("circle".equals(shapeName)) {
            shape = new Circle();
        } else if ("square".equals(shapeName)) {
            shape = new Square();
        }

        return Optional.ofNullable(shape);
    }
}
