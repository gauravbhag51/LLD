package Patterns.Behavioural.Strategy;

public class Main {
    public static void main(String[] args)
    {
        CCStrategy creditcard = new CCStrategy();
        UPIStrategy upiStrategy = new UPIStrategy();
        WalletStrategy walletStrategy = new WalletStrategy();

        ShoppingCart cart = new ShoppingCart(creditcard);
        cart.pay();
        cart.setPaymentStrategy(upiStrategy);
        cart.pay();
        cart.setPaymentStrategy(walletStrategy);
        cart.pay();

    }
}
