package designVendingMachine.impl;

import java.util.ArrayList;
import java.util.List;

import designVendingMachine.Coin;
import designVendingMachine.State;
import designVendingMachine.VendingMachine;

public class IdleState implements State {

    public IdleState(){
        System.out.println("Initializing Idle State");
    }
    public void IdleState(VendingMachine vendingMachine){
        vendingMachine.setCoins(new ArrayList<>());
    }

    @Override
    public void pressInserCashButton(VendingMachine vendingMachine) {
        System.out.println("Moving from Idle state to has money state");
        vendingMachine.setVendingMachineState(new HasMoneyState());

    }


    @Override
    public void pressDispenseButton(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pressDispenseButton'");
    }

    @Override
    public List<Coin> changeRefund(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changeRefund'");
    }
    @Override
    public void insertCoins(VendingMachine vendingMachine, Coin coin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertCoins'");
    }
    @Override
    public void selectProductButton(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectProductButton'");
    }
    @Override
    public void chooseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chooseProduct'");
    }
     

}
