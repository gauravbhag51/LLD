package Patterns.Behavioural.Observer;

public class Main {
    public static void main(String[] args){
        Observale1 observale1= new Observale1();
        Observale2 observale2 = new Observale2();

        Observer1 observer1 = new Observer1(observale1);
        Observer2 observer2 = new Observer2(observale1);

        observale1.addObserver(observer1);
        observale1.addObserver(observer2);
        observale1.setState(5);

        Observer1 observer3 = new Observer1(observale2);
        Observer2 observer4 = new Observer2(observale2);

        observale2.addObserver(observer3);
        observale2.addObserver(observer4);
        observale2.setState(10);
        observale2.removeObserver(observer4);
        observale2.setState(6);
    }
}
