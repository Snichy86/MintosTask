package PageObjects.Pages;

import Model.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPage {

    private BaseFunc baseFunc;

    private final By PRODUCT_MODEL = By.xpath(".//div[@id='productPage']");
    private final By PRODUCT_NAME = By.xpath(".//div[@class='site-block']//h1");
    private final By PRODUCT_PRICE = By.xpath(".//div[@class='product-price fl notranslate']");
    private final By CONTINUE_BUTTON = By.xpath(".//a[@id='continue']");
    private final By ADD_TO_CART = By.xpath(".//button[@class='btn btn-big-icon-inline btn-green']");
    private final By CART_BUTTON = By.xpath(".//li[@id='cartWidget']//*[@class='{className}']");

    public ProductPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }


    public WebElement productBlock() {
        return baseFunc.findElement(PRODUCT_MODEL);
    }


    public Product getProduct(WebElement productBlock) {
        Product currentProduct = new Product();
        currentProduct.setProductName(productBlock.findElement(PRODUCT_NAME).getText());
        currentProduct.setProductPrice(productBlock.findElement(PRODUCT_PRICE).getText());
        return currentProduct;
    }


    public void addToCart() {
        WebElement addToCart = baseFunc.findElements(ADD_TO_CART).get(0);
        addToCart.click();
        baseFunc.wait(CONTINUE_BUTTON);
        baseFunc.findElement(CONTINUE_BUTTON).click();
    }

    public void clickCartButton() {
        baseFunc.findElement(CART_BUTTON).click();
    }

}
