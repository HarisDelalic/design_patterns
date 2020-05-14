package main.java.creational.abstractfactory;

import main.java.creational.abstractfactory.models.Button;
import main.java.creational.abstractfactory.models.Checkbox;
import main.java.creational.abstractfactory.models.factory.GuiFactory;

/**
 * Based on which OS type we are using (Windows or Linux),
 * We will create GUI elements combination of Button and Checkbox
 * So, it does not make sense ro make Windows Button and Linux Checkbox,
 * but every combination is only appropriate for certain OS
 */
public class MainAbstractFactory {

    public static void main(String[] args) {

        GuiFactory guiFactory = OSType.WINDOWS.getGuiFactory();

        Button button = guiFactory.createButton();
        Checkbox checkbox = guiFactory.createCheckbox();

        button.click();
        checkbox.check();
    }
}
