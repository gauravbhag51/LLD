package Patterns.Behavioural.Strategy;

public class ShoppingCart {
    private IPaymentStrategy paymentStrategy;

    ShoppingCart(IPaymentStrategy paymentStrategy)
    {
        this.paymentStrategy = paymentStrategy;
    }
    public void pay()
    {
        paymentStrategy.pay();
    }
    public void setPaymentStrategy(IPaymentStrategy paymentStrategy)
    {
        this.paymentStrategy = paymentStrategy;
    }
}
