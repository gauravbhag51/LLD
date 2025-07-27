package Patterns.Behavioural.Strategy;

public class WalletStrategy implements IPaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Paying via wallet");
    }
}
