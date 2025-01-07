package atmMachineDesign.state;

import atmMachineDesign.AtmMachine;
import atmMachineDesign.Card;

public class HasCardState extends AtmState {
    @Override
    public void authenicateCardPin(AtmMachine atmMachine, Card card, int pin) {
        System.out.println("Authenticating card pin");
        if (card.getPin() == pin) {
            System.out.println("Card pin authenticated");
            atmMachine.setAtmState(new SelectOperationState());
        } else {
                System.out.println("Invalid card pin");
                atmMachine.setAtmState(new IdleState());
        }
    }

}
