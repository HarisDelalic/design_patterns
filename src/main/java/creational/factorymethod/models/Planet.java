package main.java.creational.factorymethod.models;

public class Planet implements Obstacle {

    private int size;

    public Planet(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getSpeed() {
        return 0;
    }
}
