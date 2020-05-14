package main.java.creational.abstractfactory.models;

public class LinuxCheckbox implements Checkbox {

    @Override
    public void check() {
        System.out.println("Linux Checkbox Clicked");
    }

    @Override
    public boolean isChecked() {
        return false;
    }
}
