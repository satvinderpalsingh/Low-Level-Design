package designVendingMachine;

import java.util.List;

public interface State {
    void pressInserCashButton(VendingMachine vendingMachine);
    void selectProductButton(VendingMachine vendingMachine);
    void pressDispenseButton(VendingMachine vendingMachine);
    List<Coin> changeRefund(VendingMachine vendingMachine);
    void insertCoins(VendingMachine vendingMachine,Coin coin);
    void chooseProduct(VendingMachine vendingMachine,int productCode) throws Exception;
}
