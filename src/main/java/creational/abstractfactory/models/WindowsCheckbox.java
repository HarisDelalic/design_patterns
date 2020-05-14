package main.java.creational.abstractfactory.models;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void check() {
        System.out.println("Windows Checkbox Checked");
    }

    @Override
    public boolean isChecked() {
        return false;
    }
}
