package main.java.behavioral.command.functional_implementation;

public class LampSwitch {
    private LampOperation lampOperation;

    public LampSwitch(LampOperation lampOperation) {
        this.lampOperation = lampOperation;
    }

    public void press() {
        lampOperation.execute();
    }
}
