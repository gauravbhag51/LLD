package VendingMachine;

import VendingMachine.Currency.*;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineDemo {
    public static void run()
    {
        VendingMachine vendingMachine= new VendingMachine();
        ArrayList<Currency> money= new ArrayList<>();

        money.add(new Note(NoteDenomination.TEN));
        money.add(new Note(NoteDenomination.FIFTY));
        money.add(new Note(NoteDenomination.HUNDRED));
        money.add(new Note(NoteDenomination.FIVE_HUNDRED));
        money.add(new Coin(CoinDenomination.ONE));
        money.add(new Coin(CoinDenomination.TWO));
        money.add(new Coin(CoinDenomination.FIVE));
        money.add(new Coin(CoinDenomination.TEN));

        vendingMachine.addCash(money);

        vendingMachine.addProduct(new Product(ProductType.THUMS_UP, 5, 20));
        vendingMachine.addProduct(new Product(ProductType.SPRITE, 4, 25));
        vendingMachine.addProduct(new Product(ProductType.RED_LAYS, 3, 30));
        vendingMachine.addProduct(new Product(ProductType.BLUE_LAYS, 2, 10));
        vendingMachine.addProduct(new Product(ProductType.BUTTERMILK, 1, 5));

        vendingMachine.displayAvailability();

        List<Currency> red_lays_money= new ArrayList<>();
        red_lays_money.add(new Note(NoteDenomination.TEN));
        vendingMachine.dispense(ProductType.RED_LAYS, red_lays_money);

        List<Currency> buttermilk_money= new ArrayList<>();
        buttermilk_money.add(new Coin(CoinDenomination.TEN));
        vendingMachine.dispense(ProductType.BUTTERMILK, buttermilk_money);

        vendingMachine.displayAvailability();

        List<Currency> buttermilk1_money= new ArrayList<>();
        buttermilk1_money.add(new Coin(CoinDenomination.FIVE));
        vendingMachine.dispense(ProductType.BUTTERMILK, buttermilk1_money);

        vendingMachine.restock(ProductType.BUTTERMILK, 3);

        vendingMachine.displayAvailability();
    }
}
