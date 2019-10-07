package PageObjects.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class CategoryPage {

    private BaseFunc baseFunc;

    private final By PRODUCT = By.xpath(".//div[contains(@id,'productBlock')]//a[@class='image-wrap']//img");

    public CategoryPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void clickRandomProduct() {
        List<WebElement> products = baseFunc.findElements(PRODUCT);
        Random rand = new Random();
        int randomValue = rand.nextInt(products.size());
        products.get(randomValue).click();
    }
}
