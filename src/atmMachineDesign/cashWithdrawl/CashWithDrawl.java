package atmMachineDesign.cashWithdrawl;

import atmMachineDesign.AtmMachine;

public class CashWithDrawl {
    private CashWithDrawl nexCashWithDrawl;
    public CashWithDrawl(CashWithDrawl nexCashWithDrawl) {
        this.nexCashWithDrawl = nexCashWithDrawl;
    }
    public void cashWithDrawl(AtmMachine atmMachine,int amount) {
        if (nexCashWithDrawl!=null) {
            nexCashWithDrawl.cashWithDrawl(atmMachine,amount);
        }
    }

}
