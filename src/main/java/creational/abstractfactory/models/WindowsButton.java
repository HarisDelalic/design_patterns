package main.java.creational.abstractfactory.models;

public class WindowsButton implements Button {

    @Override
    public void click() {
        System.out.println("Windows Button Clicked");
    }
}
