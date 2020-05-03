package main.java.behavioral.command;

import main.java.behavioral.command.models.*;

/**
 * Command pattern used to decouple Command Invoker (AOExecutor) from Command Receiver (Army)
 * Notice that executor doesn't know anything about result of armyOperation.execute() method
 */
public class MainCommand {

    public static void main(String[] args) {
        Army army = new Army();

        ArmyOperation armyOperation = new AttackArmyOperation(army);

        ArmyOperationExecutor executor = new ArmyOperationExecutor();

        executor.executeCommand(armyOperation);
    }
}
