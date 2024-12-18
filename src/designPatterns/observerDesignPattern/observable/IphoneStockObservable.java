package designPatterns.observerDesignPattern.observable;

import designPatterns.observerDesignPattern.observer.ProductStockCommObserverInterface;

import java.util.ArrayList;

public class IphoneStockObservable implements ProductStockObservableInterface {
    public int stock=0;
    private final ArrayList<ProductStockCommObserverInterface> observers=new ArrayList<>();

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
        if (this.stock==0){
            notifyObservers();
        }
        this.stock+= stock;
    }

    @Override
    public int getStock() {
        return this.stock;
    }

}
