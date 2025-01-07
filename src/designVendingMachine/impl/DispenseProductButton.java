package designVendingMachine.impl;

import java.util.List;

import designVendingMachine.Coin;
import designVendingMachine.State;
import designVendingMachine.VendingMachine;

public class DispenseProductButton implements State {


    @Override
    public void pressDispenseButton(VendingMachine vendingMachine) {
        System.out.println("Dispensing product: "+vendingMachine.getSelectedProduct().getProductName());
        System.out.println("Moving from dispense product button to idle state");
        vendingMachine.setVendingMachineState(new IdleState());
    }


    @Override
    public void pressInserCashButton(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pressInserCashButton'");
    }

    @Override
    public List<Coin> changeRefund(VendingMachine vendingMachine) {
        System.out.println("Giving all the refund  back in tray");
        vendingMachine.setVendingMachineState(new IdleState());
        return vendingMachine.getCoins();

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
