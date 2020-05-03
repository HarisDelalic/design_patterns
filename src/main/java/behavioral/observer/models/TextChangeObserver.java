package main.java.behavioral.observer.models;


import java.util.Observable;
import java.util.Observer;

public class TextChangeObserver implements Observer {

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("TextChangeObserver");
        System.out.println("New update from observable: " + ((TextObservable)observable).getName());
        System.out.println("Text has changed to: " + ((String)o).toUpperCase());
    }
}
