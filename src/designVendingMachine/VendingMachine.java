package designVendingMachine;

import java.util.ArrayList;
import java.util.List;

import designVendingMachine.impl.IdleState;

public class VendingMachine {
    private List<Product> products;
    private List<Coin> coins;
    private State state;
    private Product selectedProduct;
    VendingMachine(){
        this.state=new IdleState();
        this.products=new ArrayList<>();
        this.coins=new ArrayList<>();
        initializeVendingMachine();
    }
    public void setCoins(List<Coin> coins){
        this.coins=coins;
    }
    public void setVendingMachineState(State state){
        this.state=state;
    }
    private void initializeVendingMachine(){
        int productCode=100;
        for (ProductType product : ProductType.values()) {
            for(int i=0;i<4;i++){
            productCode+=1;
            System.out.println("Initializing product "+product);
            products.add(new Product(product.toString(),productCode,product,100));
            }   
        }
    }
    public List<Coin> getCoins(){
        return coins;
    }
    public State getState(){
        return state;
    }   
    public Product getProduct(int productCode) throws Exception{
        for(Product product:products){
            if(product.getProductCode()==productCode){
                return product;
            }
        }
        throw new Exception("Product with code "+productCode+" not found");
    }
    public void setSelectedProduct(Product product){
        this.selectedProduct=product;
    }
    public Product getSelectedProduct(){
        return selectedProduct;
    }

}
