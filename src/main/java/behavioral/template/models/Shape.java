package main.java.behavioral.template.models;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    /**
     * Method used to demonstrate template method pattern
     * Name: class_name + individual_name e.g. "Square MySquare"
     **/
    public String getDescriptiveName() {
        return getClassName() + " " + name;
    }

    /**
     * getClassName returns class name: Square or Circle, Strings which are defined in subclasses
     **/
    public abstract String getClassName();
}
