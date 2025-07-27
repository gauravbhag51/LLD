package Patterns.Behavioural.State.VendingMachineStates;

import Patterns.Behavioural.State.VendingMachine;

public class ProductSelectionState extends VendingMachineState{
    @Override
    public void dispenseProduct(VendingMachine vendingMachine, String productCode) {
        vendingMachine.dispenseProduct(productCode);
    }
}
