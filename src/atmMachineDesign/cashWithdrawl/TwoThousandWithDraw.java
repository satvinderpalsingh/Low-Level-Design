package atmMachineDesign.cashWithdrawl;

import atmMachineDesign.AtmMachine;

public class TwoThousandWithDraw extends CashWithDrawl {
    public TwoThousandWithDraw(CashWithDrawl nexCashWithDrawl) {
        super(nexCashWithDrawl);
    }

    @Override
    public void cashWithDrawl(AtmMachine atmMachine, int amount) {
        int requiredTwoThousand = amount / 2000;
        int remainingAmount = amount % 2000;
        if (requiredTwoThousand <= atmMachine.getTotalTwoThousandNotes()) {
            atmMachine.deductTwoThousandNotes(requiredTwoThousand);
        } else {
            System.out.println("Not enough two thousand notes");
            atmMachine.deductTwoThousandNotes(atmMachine.getTotalTwoThousandNotes());
            remainingAmount = remainingAmount + (requiredTwoThousand - atmMachine.getTotalTwoThousandNotes()) * 2000;
        }
        if (remainingAmount != 0) {
            super.cashWithDrawl(atmMachine, remainingAmount);
        }

    }

}
