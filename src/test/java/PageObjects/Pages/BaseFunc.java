package PageObjects.Pages;

//import com.sun.source.tree.CompoundAssignmentTree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseFunc {

    private WebDriver driver;



    public BaseFunc() {
        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    public void goToURL(String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;
        }

        driver.get(url);
    }

    public void clickElement(By byElement) {
        WebElement element = driver.findElement(byElement);
//        WebDriver driver = new FirefoxDriver();
//        WebDriverWait wait = new WebDriverWait(driver,60);
//        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

//    public void getListOfElements(By byElement) {
//        List<WebElement> elements = driver.findElements(byElement);
//
//    }
//    public void goToCategory(WebElement category) {
//        category = driver.findElement(CATEGORY);
//        category.click();
//    }


}
