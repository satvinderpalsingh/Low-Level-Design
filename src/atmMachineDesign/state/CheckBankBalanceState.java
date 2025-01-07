package atmMachineDesign.state;

import atmMachineDesign.AtmMachine;
import atmMachineDesign.Card;

public class CheckBankBalanceState extends AtmState {
    @Override
    public void checkBankBalance(AtmMachine atmMachine, Card card) {
        System.out.println("Checking balance");
        atmMachine.setAtmState(new IdleState());
    }

}
