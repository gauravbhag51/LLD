package Patterns.Behavioural.State;

import Patterns.Behavioural.State.VendingMachineStates.IdleState;
import Patterns.Behavioural.State.VendingMachineStates.VendingMachineState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private VendingMachineState vendingMachineState;
    private final List<Coin> coins = new ArrayList<>();

    public VendingMachine(){
        this.vendingMachineState = new IdleState();
    }

    public VendingMachineState getState()
    {
        return this.vendingMachineState;
    }
    public void setState(VendingMachineState vendingMachineState)
    {
        this.vendingMachineState = vendingMachineState;
    }
    public void addCoin(Coin coin){
        coins.add(coin);
    }
    public int getCoinsValue(){
        int totalValue = 0;
        for(Coin coin: coins){
            totalValue += coin.getValue();
        }
        return totalValue;
    }
    public void dispenseProduct(String productCode){
        System.out.println("Dispensing Product:"+productCode);
    }
    public void clearCoins(){
        coins.clear();
    }
}
