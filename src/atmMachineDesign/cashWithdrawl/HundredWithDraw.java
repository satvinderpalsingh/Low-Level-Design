package atmMachineDesign.cashWithdrawl;

import atmMachineDesign.AtmMachine;

public class HundredWithDraw extends CashWithDrawl {
    public HundredWithDraw(CashWithDrawl nexCashWithDrawl) {
        super(nexCashWithDrawl);
    }

    @Override
    public void cashWithDrawl(AtmMachine atmMachine, int amount) {
        int requiredHundred = amount / 100;
        int remainingAmount = amount % 100;
        if (requiredHundred <= atmMachine.getTotalHundredNotes()) {
            atmMachine.deductHundredNotes(requiredHundred);
        } else {
            System.out.println("Not enough two thousand notes");
            atmMachine.deductHundredNotes(atmMachine.getTotalHundredNotes());
            remainingAmount = remainingAmount + (requiredHundred - atmMachine.getTotalHundredNotes()) * 100;
        }
        if (remainingAmount != 0) {
            System.out.println("Remaining amount something went wrong");
        }

    }

}
