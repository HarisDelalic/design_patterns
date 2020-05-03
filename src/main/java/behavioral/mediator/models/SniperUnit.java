package main.java.behavioral.mediator.models;

import main.java.behavioral.mediator.Commandable;

public class SniperUnit implements ArmedUnit {
    private Commandable commandable;

    public SniperUnit(Commandable commandable) {
        this.commandable = commandable;
    }

    @Override
    public void startAttack() {
        commandable.startAttack(this);
    }

    @Override
    public void ceaseAttack() {
        commandable.ceaseAttack(this);
    }
}
