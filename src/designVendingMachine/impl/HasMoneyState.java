package designVendingMachine.impl;

import java.util.List;

import designVendingMachine.Coin;
import designVendingMachine.State;
import designVendingMachine.VendingMachine;

public class HasMoneyState implements State {
    HasMoneyState(){
        System.out.println("Initializing Has Money State");
    }

    @Override
    public void pressInserCashButton(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pressInserCashButton'");
    }

    @Override
    public void selectProductButton(VendingMachine vendingMachine) {
        System.out.println("Moving from has money state to selection state");
        vendingMachine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void pressDispenseButton(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pressDispenseButton'");
    }

    @Override
    public List<Coin> changeRefund(VendingMachine vendingMachine) {
        System.out.println("Giving all the refund  back in tray");
        vendingMachine.setVendingMachineState(new IdleState());
        return vendingMachine.getCoins();

    }

    @Override
    public void insertCoins(VendingMachine vendingMachine,Coin coin) {
        System.out.println("Inserting coin "+coin+" into vending machine");
        System.out.println("Total Coins inserted "+vendingMachine.getCoins().size());
        vendingMachine.getCoins().add(coin);
    }


    @Override
    public void chooseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chooseProduct'");
    }

}
