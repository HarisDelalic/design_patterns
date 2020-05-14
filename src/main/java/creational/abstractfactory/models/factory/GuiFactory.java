package main.java.creational.abstractfactory.models.factory;

import main.java.creational.abstractfactory.models.Button;
import main.java.creational.abstractfactory.models.Checkbox;

public interface GuiFactory {
    Checkbox createCheckbox();
    Button createButton();
}
