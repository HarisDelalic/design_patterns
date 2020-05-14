package main.java.creational.factorymethod.models.factory;

import main.java.creational.factorymethod.models.Obstacle;

public interface ObstacleFactory {
    Obstacle createObstacle(int size, int speed);
}
