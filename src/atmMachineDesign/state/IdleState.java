package atmMachineDesign.state;

import atmMachineDesign.AtmMachine;

public class IdleState extends AtmState {
    public IdleState() {
        System.out.println("Atm is idle");
    }
    public void IdleState(AtmMachine atmMachine) {
        atmMachine.setAtmState(new IdleState());
    }
    public void insertAtmCard(AtmMachine atmMachine) {
        atmMachine.setAtmState(new HasCardState());
    }



}
