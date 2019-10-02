package OnlineShopTestStepDefinitions;

import PageObjects.Pages.BaseFunc;
import PageObjects.Pages.Homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class StepDefs {
    private String URL = "1a.lv";
    private final By MAIN_CATEGORY_ELEMENT = By.xpath(".//ul[@class='sidenav v2']/li/a");
    private final By SECONDARY_CATEGORY_ELEMENT = By.xpath(".//div[contains(@class, 'col-holder')]//li//a");

    private BaseFunc baseFunc = new BaseFunc();
    private Homepage homepage = new Homepage(baseFunc);

    @Given("homepage")
    public void open_homepage() {
        baseFunc.goToURL(URL);
    }

    @When("choose category")
    public void choose_category() {
        homepage.clickOnRandomProductCategory(MAIN_CATEGORY_ELEMENT,SECONDARY_CATEGORY_ELEMENT);
    }

    @When("put random product in the shopping basket")
    public void choose_product() {
    }

    @When("proceed to checkout page")
    public void go_to_checkout() {
    }

    @Then("check if the price and name of product match with chosen")
    public void assert_name_and_price() {
    }
}
