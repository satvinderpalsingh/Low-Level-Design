package designPatterns.observerDesignPattern.observer;

import designPatterns.observerDesignPattern.observable.ProductStockObservableInterface;

public class EmailAlertObserver implements ProductStockCommObserverInterface{
    String email;
    private final ProductStockObservableInterface productStockObservable;
    public EmailAlertObserver(String email, ProductStockObservableInterface productStockObservable) {
        this.email = email;
        this.productStockObservable = productStockObservable;
    }
    @Override
    public void update() {
        sendEmail();
    }
    private void sendEmail(){
        System.out.println("Hurray!! hey we have piled up stock: "+this.productStockObservable.getStock()+"Mr: "+this.email);
    }
}
