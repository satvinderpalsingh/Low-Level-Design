package atmMachineDesign.state;

import atmMachineDesign.AtmMachine;
import atmMachineDesign.Card;
import atmMachineDesign.cashWithdrawl.CashWithDrawl;
import atmMachineDesign.cashWithdrawl.FiveHundredWithDraw;
import atmMachineDesign.cashWithdrawl.HundredWithDraw;
import atmMachineDesign.cashWithdrawl.TwoThousandWithDraw;

public class CashWithdrawlState extends AtmState {
    private CashWithDrawl cashWithDrawl;
    CashWithdrawlState(){
        this.cashWithDrawl=new TwoThousandWithDraw(new FiveHundredWithDraw(new HundredWithDraw(null)) );
    }
    @Override
    public void cashWithDrawl(AtmMachine atmMachine, Card card, int amount) {
        if (atmMachine.getAtmBalance()<amount) {
            System.out.println("Not enough money in the machine");
            atmMachine.setAtmState(new IdleState());
        }else if (card.getBankAccount().getBalance()<amount){
            System.out.println("Not enough money in the card");
            atmMachine.setAtmState(new IdleState());
        }
        else{
            cashWithDrawl.cashWithDrawl(atmMachine,amount);
            atmMachine.setAtmBalance(atmMachine.getAtmBalance()-amount);
            card.getBankAccount().withdraw(amount);
        }
        
    }



}
