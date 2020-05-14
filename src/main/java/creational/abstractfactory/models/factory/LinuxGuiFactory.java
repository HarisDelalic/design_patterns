package main.java.creational.abstractfactory.models.factory;

import main.java.creational.abstractfactory.models.Button;
import main.java.creational.abstractfactory.models.Checkbox;
import main.java.creational.abstractfactory.models.LinuxButton;
import main.java.creational.abstractfactory.models.LinuxCheckbox;

public class LinuxGuiFactory implements GuiFactory {

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }

    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
