package main.java.behavioral.observer.models;

import java.util.Observable;

public class AnotherTextObserver extends TextChangeObserver {

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("AnotherTextObserver");
        System.out.println("New update from observable: " + ((TextObservable) observable).getName());
        System.out.println("Text has changed to: " + ((String) o).toUpperCase());
    }
}
