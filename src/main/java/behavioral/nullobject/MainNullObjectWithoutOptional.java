package main.java.behavioral.nullobject;

import main.java.behavioral.nullobject.withoutoptional.models.Shape;

public class MainNullObjectWithoutOptional {
    public static void main(String[] args) {
        String[] shapeNames = {"circle", "square", null, "octagon", "circle"};

        for(String shapeName : shapeNames ) {
            Shape shape = ShapeFactoryWithoutOptional.getShape(shapeName);
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
            System.out.println(shape.isNull());
            System.out.println();
        }
    }
}
