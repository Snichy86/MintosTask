package PageObjects.Pages;

import org.openqa.selenium.By;

public class CartPage {

    private BaseFunc baseFunc;

    private final By PRODUCT_NAME = By.xpath(".//td[@class='info_cell product-info-cell']//a");
    private final By TOTAL_PRICE = By.xpath(".//strong[@class='color-orange notranslate']");

    public CartPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public String productName() {
        baseFunc.wait(PRODUCT_NAME);
        String name = baseFunc.findElement(PRODUCT_NAME).getText();
        return name;
    }
    public Integer productPrice () {
        baseFunc.wait(TOTAL_PRICE);
        String priceS = baseFunc.findElement(TOTAL_PRICE).getText();
        priceS = priceS.substring(2).replace(",","");
        Integer price = Integer.valueOf(priceS);
        return price;
    }
}
