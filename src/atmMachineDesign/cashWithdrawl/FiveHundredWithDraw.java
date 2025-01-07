package atmMachineDesign.cashWithdrawl;

import atmMachineDesign.AtmMachine;

public class FiveHundredWithDraw extends CashWithDrawl {
    public FiveHundredWithDraw(CashWithDrawl nexCashWithDrawl) {
        super(nexCashWithDrawl);
    }

    @Override
    public void cashWithDrawl(AtmMachine atmMachine, int amount) {
        int requiredFiveHundred = amount / 500;
        int remainingAmount = amount % 500;
        if (requiredFiveHundred <= atmMachine.getTotalFiveHundredNotes()) {
            atmMachine.deductFiveHundredNotes(requiredFiveHundred);
        } else {
            System.out.println("Not enough two thousand notes");
            atmMachine.deductFiveHundredNotes(atmMachine.getTotalFiveHundredNotes());
            remainingAmount = remainingAmount + (requiredFiveHundred - atmMachine.getTotalFiveHundredNotes()) * 500;
        }
        if (remainingAmount != 0) {
            super.cashWithDrawl(atmMachine, remainingAmount);
        }

    }
}
