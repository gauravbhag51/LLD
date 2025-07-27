package Patterns.Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class Observale2 implements IObservable{
    private List<IObserver> observers;
    public int state;
    Observale2()
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
        state = state+newState;
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
