package main.java.creational.factorymethod.models.factory;

import main.java.creational.factorymethod.models.Obstacle;
import main.java.creational.factorymethod.models.Planet;

public class PlanetFactory implements ObstacleFactory {

    @Override
    public Obstacle createObstacle(int size, int speed) {
        return new Planet(size);
    }
}
