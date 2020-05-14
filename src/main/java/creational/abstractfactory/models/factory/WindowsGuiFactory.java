package main.java.creational.abstractfactory.models.factory;

import main.java.creational.abstractfactory.models.Button;
import main.java.creational.abstractfactory.models.Checkbox;
import main.java.creational.abstractfactory.models.WindowsButton;
import main.java.creational.abstractfactory.models.WindowsCheckbox;

public class WindowsGuiFactory implements GuiFactory {

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
