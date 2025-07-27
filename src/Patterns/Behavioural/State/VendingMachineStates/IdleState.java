package Patterns.Behavioural.State.VendingMachineStates;

import Patterns.Behavioural.State.VendingMachine;

public class IdleState extends VendingMachineState{
    public void addMoneyButtonPressed(VendingMachine vendingMachine){
        vendingMachine.setState(new AcceptingMoneyState());
    }
}
