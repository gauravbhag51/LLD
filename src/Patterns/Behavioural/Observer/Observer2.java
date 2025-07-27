package Patterns.Behavioural.Observer;

public class Observer2 implements IObserver{
    private final IObservable observable;
    Observer2(IObservable observable){
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("Observer2 got update:"+observable.getState());
    }
}
