package designVendingMachine.impl;

import java.util.List;

import designVendingMachine.Coin;
import designVendingMachine.Product;
import designVendingMachine.State;
import designVendingMachine.VendingMachine;

public class SelectionState implements State {


    @Override
    public void selectProductButton(VendingMachine vendingMachine) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectProductButton'");
    }

    @Override
    public void pressDispenseButton(VendingMachine vendingMachine) {
        throw new UnsupportedOperationException("Unimplemented method 'pressDispenseButton'");
        
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine,int productCode) throws Exception {
        int totalCoinsInserted=0;
        List<Coin> coins=vendingMachine.getCoins();
        for (Coin coin : coins) {
            totalCoinsInserted+=coin.value;
        }
        Product product=vendingMachine.getProduct(productCode);
        if (product.getProductPrice()>totalCoinsInserted) {
            System.out.println("Not enough money to buy "+product.getProductName());
            vendingMachine.setVendingMachineState(new IdleState());
        } else {
            System.out.println("Buying "+product.getProductName()+ "Moving to dispense product button");
            vendingMachine.setSelectedProduct(product);
            vendingMachine.setVendingMachineState(new DispenseProductButton());
        }
        
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

}
