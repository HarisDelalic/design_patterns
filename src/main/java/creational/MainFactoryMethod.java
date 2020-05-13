package main.java.creational;

import main.java.creational.models.Obstacle;
import main.java.creational.models.factory.AsteroidFactory;
import main.java.creational.models.factory.ObstacleFactory;

public class MainFactoryMethod {

    public static void main(String[] args) {
        ObstacleFactory obstacleFactory = new AsteroidFactory();

        for (int i = 0; i < 10; i++) {
            Obstacle obstacle = obstacleFactory.createObstacle(i, i);
            System.out.println(obstacle.getSize() + obstacle.getSpeed());
        }
    }
}
