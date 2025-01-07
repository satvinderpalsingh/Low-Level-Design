package designVendingMachine;

public class VendingMachineMain {
    public static void main(String[] args) {
        try {
        VendingMachine vendingMachine = new VendingMachine();
        System.out.println("Initializing Idle stage");
        vendingMachine.getState().pressInserCashButton(vendingMachine);
        System.out.println("Inserting coins");
        vendingMachine.getState().insertCoins(vendingMachine, Coin.QUARTER);
        vendingMachine.getState().selectProductButton(vendingMachine);
        vendingMachine.getState().chooseProduct(vendingMachine, 108);
        System.out.println("Total Coins inserted "+vendingMachine.getCoins().size());
        System.out.println("Product "+vendingMachine.getSelectedProduct().getProductName());
        vendingMachine.getState().pressDispenseButton(vendingMachine);
        vendingMachine.getState().pressInserCashButton(vendingMachine);
        System.out.println("Inserting coins");
        vendingMachine.getState().insertCoins(vendingMachine, Coin.QUARTER);
        vendingMachine.getState().selectProductButton(vendingMachine);
        vendingMachine.getState().chooseProduct(vendingMachine, 108);
        System.out.println("Total Coins inserted "+vendingMachine.getCoins().size());
        System.out.println("Product "+vendingMachine.getSelectedProduct().getProductName());
        vendingMachine.getState().pressDispenseButton(vendingMachine);

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
