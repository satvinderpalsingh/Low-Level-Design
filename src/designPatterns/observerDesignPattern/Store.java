package designPatterns.observerDesignPattern;

import designPatterns.observerDesignPattern.observable.IphoneStockObservable;
import designPatterns.observerDesignPattern.observable.ProductStockObservableInterface;
import designPatterns.observerDesignPattern.observer.EmailAlertObserver;
import designPatterns.observerDesignPattern.observer.MessageAlertObserver;

public class Store {
    public static void main(String[] args) {
        ProductStockObservableInterface productStockObservable = new IphoneStockObservable();
        productStockObservable.addObserver(new MessageAlertObserver("9876543210", productStockObservable));
        productStockObservable.addObserver(new EmailAlertObserver("satvinderpalsingh@gmail.com", productStockObservable));
        productStockObservable.addObserver(new EmailAlertObserver("sp@gmail.com", productStockObservable));

        productStockObservable.setStock(10);
        productStockObservable.setStock(10);
    }
}
