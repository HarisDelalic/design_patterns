package main.java.behavioral.command.models;

public class DefendArmyOperation implements ArmyOperation {
    private Army army;

    public DefendArmyOperation(Army army) {
        this.army = army;
    }

    @Override
    public void execute() {
        army.defend();
    }
}
