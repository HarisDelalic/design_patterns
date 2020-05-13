package main.java.creational.models;

public class Asteroid implements Obstacle {

    private int size;
    private int speed;

    public Asteroid(int size, int speed) {
        this.size = size;
        this.speed = speed;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
