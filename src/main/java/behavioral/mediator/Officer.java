package main.java.behavioral.mediator;

import main.java.behavioral.mediator.models.ArmedUnit;

import java.util.ArrayList;
import java.util.List;

public class Officer implements Commandable {
    private List<ArmedUnit> armedUnits;
    private boolean canAttack;

    public Officer() {
        armedUnits = new ArrayList<>();
        canAttack = true;
    }

    @Override
    public void addArmedUnit(ArmedUnit armedUnit) {
        armedUnits.add(armedUnit);
    }

    @Override
    public void startAttack(ArmedUnit armedUnit) {
        if (!getCanAttack()) {
            return;
        }
        setCanAttack(false);
        System.out.println(armedUnit.getClass().getName() + " started to attack ");
    }

    @Override
    public void ceaseAttack(ArmedUnit armedUnit) {
        System.out.println(armedUnit.getClass().getName() + " ceased attack ");
        setCanAttack(true);
    }

    @Override
    public boolean getCanAttack() {
        return canAttack;
    }

    @Override
    public void setCanAttack(boolean canAttack) {
        this.canAttack = canAttack;
    }
}
