package main.java.behavioral.command.models;

public class AttackArmyOperation implements ArmyOperation {
    private Army army;

    public AttackArmyOperation(Army army) {
        this.army = army;
    }

    @Override
    public void execute() {
        army.attack();
    }
}
