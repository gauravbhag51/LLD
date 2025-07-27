package Patterns.Behavioural.Template;

public abstract class PaymentFlow {
    abstract void verifyRequest();
    abstract void debitMoney();
    abstract void calculateFees();
    abstract void addMoney();

    public final void sendMoney(){
        verifyRequest();
        debitMoney();
        calculateFees();
        addMoney();
    }
}
