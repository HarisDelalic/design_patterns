package main.java.creational.abstractfactory;

import main.java.creational.abstractfactory.models.factory.GuiFactory;
import main.java.creational.abstractfactory.models.factory.LinuxGuiFactory;
import main.java.creational.abstractfactory.models.factory.WindowsGuiFactory;

public enum OSType {

    LINUX {
        @Override
        public GuiFactory getGuiFactory() {
            return new LinuxGuiFactory();
        }

    },
    WINDOWS {
        @Override
        public GuiFactory getGuiFactory() {
            return new WindowsGuiFactory();
        }
    };

    public abstract GuiFactory getGuiFactory();
}
