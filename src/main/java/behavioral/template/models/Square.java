package main.java.behavioral.template.models;

public class Square extends Shape {

    public Square(String name) {
        super(name);
    }

    @Override
    public String getClassName() {
        return "Square";
    }
}
