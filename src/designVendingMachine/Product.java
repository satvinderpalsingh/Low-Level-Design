package designVendingMachine;

public class Product {
    private String productName;
    private int productCode;
    private ProductType productType;
    private int productPrice;
    Product(String productName, int productCode, ProductType productType,int productPrice) {
        this.productName = productName;
        this.productCode = productCode;
        this.productType = productType;
        this.productPrice=productPrice;
    }
    public String getProductName() {
        return productName;
    }

    public int getProductCode() {
        return productCode;
    }

    public ProductType getProductType() {
        return productType;
    }

    public int getProductPrice() {
        return productPrice;
    }
}
