package atmMachineDesign;

import atmMachineDesign.state.IdleState;

public class AtmRoom {
    private AtmMachine atmMachine;
    private User user;
    
    private void initializationAtm(){
        this.atmMachine=new AtmMachine();
        atmMachine.setAtmState(new IdleState());
        atmMachine.setTotalTwoThousandNotes(1);
        atmMachine.setTotalFiveHundredNotes(1);
        atmMachine.setTotalHundredNotes(1);
        atmMachine.setAtmBalance(2600);
    }
    private void initializationUser(){
        this.user=new User();
        user.setUserName("satvinder");
        Card card=new Card();
        card.setPin(1234);
        BankAccount bankAccount=new BankAccount();
        bankAccount.setBalance(2500);
        card.setBankAccount(bankAccount);
        user.setCard(card);
        user.setBankAccount(bankAccount);
    }
    public void initialization(){
        initializationAtm();
        initializationUser();
    }
    public AtmMachine getAtmMachine() {
        return atmMachine;
    }
    public User getUser() {
        return user;
    }
    

}
