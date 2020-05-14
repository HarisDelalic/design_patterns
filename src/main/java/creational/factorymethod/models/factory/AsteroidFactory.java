package main.java.creational.factorymethod.models.factory;

import main.java.creational.factorymethod.models.Asteroid;
import main.java.creational.factorymethod.models.Obstacle;

public class AsteroidFactory implements ObstacleFactory {

    @Override
    public Obstacle createObstacle(int size, int speed) {
        return new Asteroid(size, speed);
    }
}
