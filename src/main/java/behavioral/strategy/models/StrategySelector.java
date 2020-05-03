package main.java.behavioral.strategy.models;

import java.util.Random;

public class StrategySelector {
    private static final String TEXT = "abCdeFghJklM";

    private TextFormatStrategy strategy;

    /**
     * Select Strategy:
     * 1- Lowercase
     * 2- Uppercase
     */
    public void selectStrategy() {
        String userInput = UserInputEvaluator.simulateUserInput();

        UserInputEvaluator.evaluate(userInput);

        selectValidStrategy(userInput);
    }

    private void selectValidStrategy(String userInput) {
        int choice = Integer.parseInt(userInput);
        if (choice == 1) {
            this.strategy = new LowercaseFormatStrategy(TEXT);
        } else if (choice == 2) {
            this.strategy = new UppercaseFormatStrategy(TEXT);
        }
    }

    public void applyStrategy() {
        strategy.logResult();
    }

    private static class UserInputEvaluator {

         static void evaluate(String userInput) {
            try {
                int choice = Integer.parseInt(userInput);
                if (choice < 1 || choice > 2) {
                    throw new IllegalArgumentException();
                }
            } catch (NumberFormatException iae) {
                System.exit(1);
            } catch (IllegalArgumentException nfe) {
                System.exit(2);
            }
        }

        private static String simulateUserInput() {
             int random = new Random().nextInt(2) + 1;
             return String.valueOf(random);
        }
    }
}
