package Patterns.Behavioural.Strategy;

public class UPIStrategy implements IPaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Paying via UPI");
    }
}
