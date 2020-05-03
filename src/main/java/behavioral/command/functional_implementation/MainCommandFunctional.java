package main.java.behavioral.command.functional_implementation;

import main.java.behavioral.command.functional_implementation.models.Lamp;

public class MainCommandFunctional {

    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        /*
            LampOperation onLampOperation = new TurnOnLampOperation(lamp);
            LampOperation offLampOperation = new TurnOffLampOperation(lamp);
         */

        /*
            Commented code from above is substituted by using functional programming
                1) method reference and
                2) lambda expression
            As we see, we don't even need implementations of LampOperation
         */
        LampOperation onLampOperation = lamp::turnOn;
        LampOperation offLampOperation = () -> lamp.turnOff();

        LampSwitch onLampSwitch = new LampSwitch(onLampOperation);
        LampSwitch offLampSwitch = new LampSwitch(offLampOperation);
        onLampSwitch.press();
        offLampSwitch.press();
    }
}
