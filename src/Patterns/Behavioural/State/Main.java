package Patterns.Behavioural.State;

import Patterns.Behavioural.State.VendingMachineStates.VendingMachineState;

public class Main {
    public static void main(String[] args)
    {
        VendingMachine vendingMachine = new VendingMachine();
        VendingMachineState vendingMachineState = vendingMachine.getState();

        vendingMachineState.addMoneyButtonPressed(vendingMachine);

        vendingMachineState = vendingMachine.getState();
        vendingMachineState.acceptCoin(vendingMachine,Coin.FIVE);
        vendingMachineState.acceptCoin(vendingMachine,Coin.FIVE);
        vendingMachineState.acceptCoin(vendingMachine,Coin.FIVE);
        vendingMachineState.acceptCoin(vendingMachine,Coin.FIVE);
        vendingMachineState.acceptCoin(vendingMachine,Coin.FIVE);

        vendingMachineState.productSelectionButtonPressed(vendingMachine);

        vendingMachineState = vendingMachine.getState();

        vendingMachineState.dispenseProduct(vendingMachine,"102");

    }
}
