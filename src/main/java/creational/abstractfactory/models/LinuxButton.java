package main.java.creational.abstractfactory.models;

public class LinuxButton implements Button {

    @Override
    public void click() {
        System.out.println("Linux Button Clicked");
    }
}
