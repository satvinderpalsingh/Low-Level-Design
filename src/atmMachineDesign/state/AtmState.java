package atmMachineDesign.state;

import atmMachineDesign.AtmMachine;
import atmMachineDesign.AtmOperationType;
import atmMachineDesign.Card;

public abstract class AtmState {
    public void insertAtmCard(AtmMachine atmMachine) {
        System.out.println("OOPS something went wrong");
    }

    public void authenicateCardPin(AtmMachine atmMachine, Card card, int pin) {
        System.out.println("OOPS something went wrong");
    }

    public void selectAtmOperation(AtmMachine atmMachine, AtmOperationType operation) {
        System.out.println("OOPS something went wrong");
    }

    public void cashWithDrawl(AtmMachine atmMachine, Card card, int amount) {
        System.out.println("OOPS something went wrong");
    }

    public void checkBankBalance(AtmMachine atmMachine, Card card) {
        System.out.println("OOPS something went wrong");
    }

    public void exitAtm(AtmMachine atmMachine, Card card) {
        System.out.println("OOPS something went wrong");
    }
}
