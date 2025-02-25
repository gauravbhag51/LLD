package VendingMachine;

import VendingMachine.Currency.Currency;
import VendingMachine.Currency.Note;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;
    private List<Currency> money_bank;
    public VendingMachine()
    {
        products = new ArrayList<>();
        money_bank = new ArrayList<>();
    }

    public boolean addProduct(Product new_product)
    {
        for(Product product : products)
        {
            if(product.getProductType() == new_product.getProductType())
            {
                System.out.println("Product already exists, please use restock to add more quantity");
                return false;
            }
        }
        products.add(new_product);
        System.out.println("Product added Successfully.");
        return true;
    }

    public boolean restock(ProductType productType, int quantity)
    {
        for(Product product : products)
        {
            if(product.getProductType() == productType)
            {
                product.restock(quantity);
                System.out.println("Restock Successful.");
                return true;
            }
        }

        System.out.println("Product doesn't exist, please use addProduct.");
        return false;
    }

    public boolean dispense(ProductType productType, List<Currency> money)
    {
        money_bank.addAll(money);

        for(Product product : products)
        {
            if(product.getProductType() == productType && product.isAvailable())
            {
                double moneyProvided = 0;
                for(Currency crr : money)
                    moneyProvided+=crr.getValue();
                if(moneyProvided >= product.getCost())
                {
                    product.dispense();
                    dispenseCash(moneyProvided - product.getCost());
                    return true;
                }
                else{
                    System.out.println("Unsufficient money provided, please add more money");
                    return false;
                }
            }
        }
        System.out.println("Product unavailable");
        return false;
    }
    public void addCash(List<Currency> money)
    {
        money_bank.addAll(money);
    }
    public void collectMoney()
    {
        double money = 0;
        for(Currency crr : money_bank)
            money+=crr.getValue();
        dispenseCash(money);
        money_bank.clear();
    }

    public void displayAvailability()
    {
        for(Product product: products)
        {
            product.displayAvailability();
        }
    }
    private void dispenseCash(double amount)
    {
        //Logic to dispense cash.
        System.out.println("Dispensed cash amount: "+amount);
    }
}
