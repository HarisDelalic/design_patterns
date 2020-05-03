package main.java.behavioral.command;

import main.java.behavioral.command.models.ArmyOperation;

public class ArmyOperationExecutor {

    public void executeCommand(ArmyOperation armyOperation) {
        armyOperation.execute();
    }
}
