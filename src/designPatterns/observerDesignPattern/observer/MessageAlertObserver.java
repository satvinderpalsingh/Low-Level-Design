package designPatterns.observerDesignPattern.observer;

import designPatterns.observerDesignPattern.observable.ProductStockObservableInterface;

public class MessageAlertObserver implements ProductStockCommObserverInterface {
    String mobileNumber;
    private final ProductStockObservableInterface productStockObservable;
    public MessageAlertObserver(String mobileNumber, ProductStockObservableInterface productStockObservable) {
        this.mobileNumber = mobileNumber;
        this.productStockObservable = productStockObservable;
    }
    @Override
    public void update() {
        sendMessage();
    }
    private void sendMessage(){
        System.out.println("Hurray!! hey we have piled up stock: "+this.productStockObservable.getStock()+"Mr: "+this.mobileNumber);
    }
}
