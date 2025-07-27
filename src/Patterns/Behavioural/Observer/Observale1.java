package Patterns.Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class Observale1 implements IObservable{
    private final List<IObserver> observers;
    private int state;
    Observale1()
    {
        observers = new ArrayList<>();
        state = 0;
    }
    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void setState(int newState) {
        state = newState;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        observers.forEach(IObserver::update);
    }

    @Override
    public int getState() {
        return state;
    }
}
