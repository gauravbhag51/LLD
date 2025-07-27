package Patterns.Behavioural.Observer;

public class Observer1 implements IObserver{
    private final IObservable observable;
    Observer1(IObservable observable){
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("Observer1 got update:"+observable.getState());
    }
}
