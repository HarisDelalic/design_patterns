package main.java.behavioral.template.models;

public class Circle extends Shape {

    public Circle(String name) {
        super(name);
    }

    @Override
    public String getClassName() {
        return "Circle";
    }
}
