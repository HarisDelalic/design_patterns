package main.java.creational.models.factory;

import main.java.creational.models.Obstacle;

public interface ObstacleFactory {
    Obstacle createObstacle(int size, int speed);
}
