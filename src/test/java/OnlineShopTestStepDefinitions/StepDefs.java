package OnlineShopTestStepDefinitions;

import Model.Product;
import PageObjects.Pages.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StepDefs {
    private String URL = "220.lv";


    private BaseFunc baseFunc = new BaseFunc();
    private Homepage homepage = new Homepage(baseFunc);
    private CategoryPage categoryPage = new CategoryPage(baseFunc);
    private ProductPage productPage = new ProductPage(baseFunc);
    private CartPage cartPage = new CartPage(baseFunc);
    private Product product = new Product();

    @Given("homepage")
    public void open_homepage() {
        baseFunc.goToURL(URL);
    }

    @When("choose category")
    public void choose_category() {
        homepage.clickOnProductCategory();
    }

    @When("put random product in the shopping basket")
    public void choose_product() {
        categoryPage.clickRandomProduct();
        product = productPage.getProduct(productPage.productBlock());
        productPage.addToCart();
    }

    @When("proceed to checkout page")
    public void go_to_checkout() {
        productPage.clickCartButton();
    }

    @Then("check if the price and name of product match with chosen")
    public void assert_name_and_price() {
        Assertions.assertEquals(product.getProductName(), cartPage.productName(), "Wrong product name.");
        Assertions.assertEquals(product.getProductPrice(), cartPage.productPrice(), "Wrong product price.");

    }
}
