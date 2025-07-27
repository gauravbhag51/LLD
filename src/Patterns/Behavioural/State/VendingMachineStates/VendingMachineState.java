package Patterns.Behavioural.State.VendingMachineStates;
import Patterns.Behavioural.State.Coin;
import Patterns.Behavioural.State.VendingMachine;
public abstract class VendingMachineState {
    public void addMoneyButtonPressed(VendingMachine vendingMachine){
        throw new RuntimeException("Invalid Operation called");
    }
    public void acceptCoin(VendingMachine vendingMachine, Coin coin){
        throw new RuntimeException("Invalid Operation called");
    }
    public void productSelectionButtonPressed(VendingMachine vendingMachine){
        throw new RuntimeException("Invalid Operation called");
    }
    public void dispenseProduct(VendingMachine vendingMachine, String productCode){
        throw new RuntimeException("Invalid Operation called");
    }
    public void cancel(VendingMachine vendingMachine){
        throw new RuntimeException("Invalid Operation called");
    }
}
