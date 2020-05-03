package main.java.behavioral.mediator;

import main.java.behavioral.mediator.models.ArmedUnit;

public interface Commandable {

    void addArmedUnit(ArmedUnit armedUnit);

    boolean getCanAttack();
    void setCanAttack(boolean canAttack);
    void startAttack(ArmedUnit armedUnit);
    void ceaseAttack(ArmedUnit armedUnit);
}
