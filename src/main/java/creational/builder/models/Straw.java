package main.java.creational.builder.models;

public class Straw {
    private final Color color;
    private final int lengthMillimeters;

    public Straw(Color color, int lengthMillimeters) {
        this.color = color;
        this.lengthMillimeters = lengthMillimeters;
    }

    @Override
    public String toString() {
        return "[Color: " + color + ", Length in millimeters: " + lengthMillimeters + "]";
    }
}
