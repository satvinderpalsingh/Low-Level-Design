package atmMachineDesign.state;

import atmMachineDesign.AtmMachine;
import atmMachineDesign.AtmOperationType;

public class SelectOperationState extends AtmState {
    @Override
    public void selectAtmOperation(AtmMachine atmMachine, AtmOperationType operation) {
        System.out.println("Selecting operation");
        if(operation==AtmOperationType.CASHWITHDRAWL){
            atmMachine.setAtmState(new CashWithdrawlState());
        }else if(operation==AtmOperationType.CHECKBALANCE){
            atmMachine.setAtmState(new CheckBankBalanceState());
        }else{
            System.out.println("Invalid operation");
            atmMachine.setAtmState(new IdleState());
        }
    }

}
