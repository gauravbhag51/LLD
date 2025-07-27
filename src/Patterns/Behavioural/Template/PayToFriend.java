package Patterns.Behavioural.Template;

public class PayToFriend extends PaymentFlow{
    public void verifyRequest(){
        System.out.println("Verifying pay to friend request");
    }
    public void debitMoney(){
        System.out.println("Debiting money from source for pay to friend request");
    }
    public void calculateFees(){
        System.out.println("Calculating fees for pay to friend request");
    }
    public void addMoney(){
        System.out.println("Adding money to benefitiory for pay to friend request");
    }
}
