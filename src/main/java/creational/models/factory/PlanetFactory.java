package main.java.creational.models.factory;

import main.java.creational.models.Obstacle;
import main.java.creational.models.Planet;

public class PlanetFactory implements ObstacleFactory {

    @Override
    public Obstacle createObstacle(int size, int speed) {
        return new Planet(size);
    }
}
