package designPatterns.observerDesignPattern.observable;

import designPatterns.observerDesignPattern.observer.ProductStockCommObserverInterface;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements ProductStockObservableInterface {
    private int stock = 0;
    private final List<ProductStockCommObserverInterface> observers = new ArrayList<>();

    @Override
    public void addObserver(ProductStockCommObserverInterface observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ProductStockCommObserverInterface observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ProductStockCommObserverInterface observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setStock(int stock) {
        boolean wasOutOfStock = this.stock == 0;
        this.stock += stock;
        if (wasOutOfStock && this.stock > 0) {
            notifyObservers();
        }
    }

    @Override
    public int getStock() {
        return this.stock;
    }

}
