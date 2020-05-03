package main.java.behavioral.mediator;

import main.java.behavioral.mediator.models.ArmedUnit;
import main.java.behavioral.mediator.models.SniperUnit;
import main.java.behavioral.mediator.models.TankUnit;

/**
 *  Armed Unit can attack exclusively when nobody else attacks
 *  For example when sniperUnit attacks, tankUnit is forbidden to attack.
 *
 *  All communication goes through Commandable (and implementation Officer),
 *  there is no direct communication between Sniper and Tank Units
 */
public class MainMediator {

    public static void main(String[] args) {
        Commandable commandable = new Officer();

        ArmedUnit sniperUnit = new SniperUnit(commandable);
        ArmedUnit tankUnit = new TankUnit(commandable);
        commandable.addArmedUnit(sniperUnit);
        commandable.addArmedUnit(tankUnit);

        sniperUnit.startAttack();
        tankUnit.startAttack();

        sniperUnit.ceaseAttack();
        tankUnit.startAttack();
    }
}
