package vn.edu.iuh.fit.partern;

import java.util.ArrayList;
import java.util.List;

public class LightSwitch implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private boolean isOn;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(isOn);
        }
    }

    public void switchOn() {
        isOn = true;
        notifyObservers();
    }

    public void switchOff() {
        isOn = false;
        notifyObservers();
    }
}