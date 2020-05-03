package main.java.behavioral.command.models;

public class RetreatArmyOperation implements ArmyOperation {
    private Army army;

    public RetreatArmyOperation(Army army) {
        this.army = army;
    }

    @Override
    public void execute() {
        army.retreat();
    }
}
