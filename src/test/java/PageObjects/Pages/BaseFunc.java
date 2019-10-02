package PageObjects.Pages;

//import com.sun.source.tree.CompoundAssignmentTree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

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

    public void clickElement(WebElement element) {
        element.click();
    }

    public void waitForElements(List<WebElement> elements) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    public void hoverOnElement(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element);
    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }
}






