package main.java.behavioral.nullobject;

import main.java.behavioral.nullobject.withoutoptional.models.Circle;
import main.java.behavioral.nullobject.withoutoptional.models.NullShape;
import main.java.behavioral.nullobject.withoutoptional.models.Shape;
import main.java.behavioral.nullobject.withoutoptional.models.Square;

public class ShapeFactoryWithoutOptional {

    public static Shape getShape(String shapeName) {
        if ("square".equals(shapeName)) {
            return new Square();
        } else if ("circle".equals(shapeName)) {
            return new Circle();
        } else {
            return new NullShape();
        }
    }
}
