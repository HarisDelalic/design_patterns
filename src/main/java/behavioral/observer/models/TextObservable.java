package main.java.behavioral.observer.models;

import java.util.Observable;

public class TextObservable extends Observable {
    private String name;
    private String text;

    public void setText(String text) {
        this.text = text;
/*          Be careful, if the object calls notifyObservers( ) method without having previously called
            setChanged( ) method, no action will take place.*/
        this.setChanged();
        this.notifyObservers(text);
    }

    public TextObservable(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(arg);
    }
}
