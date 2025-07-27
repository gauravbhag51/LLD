package Patterns.Behavioural.Template;

public class PayToMerchant extends PaymentFlow{
    public void verifyRequest(){
        System.out.println("Verifying pay to merchant request");
    }
    public void debitMoney(){
        System.out.println("Debiting money from source for pay to merchant request");
    }
    public void calculateFees(){
        System.out.println("Calculating fees for pay to merchant request");
    }
    public void addMoney(){
        System.out.println("Adding money to benefitiory for pay to merchant request");
    }
}
