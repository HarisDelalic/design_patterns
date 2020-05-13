package main.java.creational.models.factory;

import main.java.creational.models.Asteroid;
import main.java.creational.models.Obstacle;

public class AsteroidFactory implements ObstacleFactory {

    @Override
    public Obstacle createObstacle(int size, int speed) {
        return new Asteroid(size, speed);
    }
}
