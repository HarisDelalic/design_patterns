package main.java.behavioral.strategy.models;

public class LowercaseFormatStrategy implements TextFormatStrategy {
    private String input;

    public LowercaseFormatStrategy(String input) {
        this.input = input;
    }

    @Override
    public String execute() {
        return input.toLowerCase();
    }

    @Override
    public void logResult() {
        System.out.println(execute());
    }
}
