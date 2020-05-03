package main.java.behavioral.mediator.models;

import main.java.behavioral.mediator.Commandable;

public class TankUnit implements ArmedUnit {
    private Commandable commandable;

    public TankUnit(Commandable commandable) {
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
