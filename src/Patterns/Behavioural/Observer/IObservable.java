package Patterns.Behavioural.Observer;

public interface IObservable {

    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers();
    void setState(int newState);
    int getState();
}
