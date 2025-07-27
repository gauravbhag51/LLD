package Patterns.Behavioural.State.VendingMachineStates;

import Patterns.Behavioural.State.Coin;
import Patterns.Behavioural.State.VendingMachine;

public class AcceptingMoneyState extends VendingMachineState{
    @Override
    public void acceptCoin(VendingMachine vendingMachine, Coin coin)
    {
        vendingMachine.addCoin(coin);
    }

    @Override
    public void productSelectionButtonPressed(VendingMachine vendingMachine){
        vendingMachine.setState(new ProductSelectionState());
    }

}
