package PageObjects.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Homepage {
    private BaseFunc baseFunc;
    private final By MAIN_CATEGORY_ELEMENT = By.xpath(".//span[@class='text'][contains(text(),'ves tehnika')]");
    private final By SECONDARY_CATEGORY_ELEMENT = By.xpath(".//ul[@class='menu main-menu-new-labels']//a[contains(text(),'Vadi un adapteri')]");

    public Homepage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void clickOnProductCategory() {
        WebElement mainCategoryElement = baseFunc.findElement(MAIN_CATEGORY_ELEMENT);
        baseFunc.hoverOnElement(mainCategoryElement);
        baseFunc.findElement(SECONDARY_CATEGORY_ELEMENT).click();
    }
}


