package Patterns.Behavioural.Strategy;

public class CCStrategy implements IPaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Paying via cc");
    }
}
