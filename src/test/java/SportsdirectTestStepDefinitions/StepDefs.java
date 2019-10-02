package SportsdirectTestStepDefinitions;

import PageObjects.Pages.BaseFunc;
import PageObjects.Pages.Homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StepDefs {
    private String URL = "sportsdirect.com";
    private final By CLOSE_AD_BUTTON = By.xpath(".//div[@class='modal-body']//button[@class='close']");

    private BaseFunc baseFunc = new BaseFunc();
    private Homepage homepage = new Homepage(baseFunc);

    @Given("homepage")
    public void open_homepage() {
        baseFunc.goToURL(URL);
        baseFunc.clickElement(CLOSE_AD_BUTTON);

    }

    @When("choose category")
    public void choose_category() {
    }

    @When("put random product in the shopping basket")
    public void choose_product() {
    }

    @When("proceed to checkout page")
    public void go_to_checkout() {
    }

    @Then("check if the price and name of product match with chosen")
    public void assert_name_and_price(){}
}
