package Model;


public class Product {
    private String productName;
    private Integer productPrice;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductPrice(String productPrice) {
        productPrice = productPrice.substring(2);
        this.productPrice = Integer.valueOf(productPrice);
    }
}
