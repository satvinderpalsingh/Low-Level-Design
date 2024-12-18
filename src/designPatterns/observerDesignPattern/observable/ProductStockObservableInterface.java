package designPatterns.observerDesignPattern.observable;

import designPatterns.observerDesignPattern.observer.ProductStockCommObserverInterface;

public interface ProductStockObservableInterface {
    void addObserver(ProductStockCommObserverInterface observer);
    void removeObserver(ProductStockCommObserverInterface observer);
    void notifyObservers();
    void setStock(int stock);
    int getStock();
}
