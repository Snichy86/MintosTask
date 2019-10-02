package PageObjects.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class Homepage {
    private BaseFunc baseFunc;
    private final By MAIN_CATEGORY_ELEMENT = By.xpath(".//ul[@class='sidenav v2']/li/a");
    private final By SECONDARY_CATEGORY_ELEMENT = By.xpath(".//div[contains(@class, 'col-holder')]//li//a");


    public Homepage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void clickOnRandomProductCategory(By mainCategoryLocator, By secondaryCategoryLocator) {
        List<WebElement> mainCategoryElements = baseFunc.findElements(mainCategoryLocator);
        Random random = new Random();
        int randomValue = random.nextInt(mainCategoryElements.size());
        WebElement mainCategoryElement = mainCategoryElements.get(randomValue);
        baseFunc.hoverOnElement(mainCategoryElement);



        List<WebElement> secondaryCategoryElements = baseFunc.findElements(secondaryCategoryLocator);

        baseFunc.waitForElements(secondaryCategoryElements);

        int randomValue2 = random.nextInt(secondaryCategoryElements.size());
        WebElement secondaryCategoryElement = secondaryCategoryElements.get(randomValue2);
        baseFunc.clickElement(secondaryCategoryElement);
    }
}


