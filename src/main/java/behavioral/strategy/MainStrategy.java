package main.java.behavioral.strategy;

import main.java.behavioral.strategy.models.StrategySelector;

/**
 * Using different strategies to print TEXT:
 * 1. lowercase
 * 2. uppercase
 */
public class MainStrategy {
    public static void main(String[] args) {
        Thread th1 = createThread();
        Thread th2 = createThread();
        Thread th3 = createThread();

        th1.start();
        th2.start();
        th3.start();
    }

    private static Thread createThread() {

        Thread thread = new Thread(() -> {
            StrategySelector selector = new StrategySelector();

            selector.selectStrategy();

            selector.applyStrategy();
        });
        return thread;
    }
}
