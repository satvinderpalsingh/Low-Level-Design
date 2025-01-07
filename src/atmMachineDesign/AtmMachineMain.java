package atmMachineDesign;

public class AtmMachineMain {

    public static void main(String[] args) {
        AtmRoom atmRoom = new AtmRoom();
        atmRoom.initialization();
        AtmMachine atmMachine = atmRoom.getAtmMachine();
        User user = atmRoom.getUser();
        System.out.println("Initialization done");
        atmMachine.getAtmState().insertAtmCard(atmMachine);
        System.out.println("Inserting card");
        atmMachine.getAtmState().authenicateCardPin(atmMachine, user.getCard(), 1234);
        System.out.println("Authenticating card");
        atmMachine.getAtmState().selectAtmOperation(atmMachine, AtmOperationType.CASHWITHDRAWL);
        System.out.println("Selecting operation");
        System.out.println("total atm and user balance: " + atmMachine.getAtmBalance() + " " + user.getBankAccount().getBalance());
        atmMachine.getAtmState().cashWithDrawl(atmMachine, user.getCard(), 2100);
        System.out.println("Cash withdrawl");
        System.out.println("total atm and user balance: " + atmMachine.getAtmBalance() + " " + user.getBankAccount().getBalance());
    

    }
}
