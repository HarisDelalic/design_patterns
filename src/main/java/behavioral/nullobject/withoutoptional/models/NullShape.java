package main.java.behavioral.nullobject.withoutoptional.models;

public class NullShape implements Shape {
    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
