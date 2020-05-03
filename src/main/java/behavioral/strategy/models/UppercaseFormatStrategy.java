package main.java.behavioral.strategy.models;

public class UppercaseFormatStrategy implements TextFormatStrategy {
    private String input;

    public UppercaseFormatStrategy(String input) {
        this.input = input;
    }

    @Override
    public String execute() {
        return input.toUpperCase();
    }

    @Override
    public void logResult() {
        System.out.println(execute());
    }
}
