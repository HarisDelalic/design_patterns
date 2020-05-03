package main.java.behavioral.observer;

import main.java.behavioral.observer.models.AnotherTextObserver;
import main.java.behavioral.observer.models.TextChangeObserver;
import main.java.behavioral.observer.models.TextObservable;

import java.util.Observable;
import java.util.Observer;

public class MainObserver {

    public static void main(String[] args) {
//        Creating two observers
        Observer textChangeObserver = new TextChangeObserver();
        Observer anotherTextChangeObserver = new AnotherTextObserver();
//        Creating observable, which observers are listening to
        Observable textObservable = new TextObservable("moj observable");
        textObservable.addObserver(textChangeObserver);
        textObservable.addObserver(anotherTextChangeObserver);

//        Both observers are updated twice
        ((TextObservable)textObservable).setText("Text Promijenjen");
        ((TextObservable)textObservable).setText("Pa Opet ... (text promijenjen)");

//        Removing observers from observable array, thats why observers wont be notified for following changes
        textObservable.deleteObserver(textChangeObserver);
        textObservable.deleteObserver(anotherTextChangeObserver);
        ((TextObservable)textObservable).setText("Text Promijenjen");
        ((TextObservable)textObservable).setText("Pa Opet ... (text promijenjen)");
    }
}
