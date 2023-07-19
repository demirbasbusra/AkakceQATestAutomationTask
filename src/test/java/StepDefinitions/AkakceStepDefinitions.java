package StepDefinitions;

import Pages.AkakcePages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AkakceStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    AkakcePages akakcePages = new AkakcePages(driver);
  /*  @Given("User is on homepage")
    public void userIsOnHomepage() {
        AkakcePages.HomePage();
    }

    @When("Click accept cookies")
    public void clickAcceptCookies() {
        AkakcePages.acceptCookie();
    }

    @When("Click the search button")
    public void clickTheSearchButton() {
        AkakcePages.clickSearch();
    }

    @When("Write product name")
    public void writeProductName() {
        AkakcePages.writeProduct();
    }

    @When("Click search button")
    public void clickSearchButton() {
        AkakcePages.searchButton();
    }

    @When("Filter for Shipped by Amazon")
    public void filterForShippedByAmazon() {
        AkakcePages.filterAmazon();
    }

    @When("Filter for Apple")
    public void filterForApple() {
        AkakcePages.filterApple();
    }

    @When("Click the first product")
    public void clickTheFirstProduct() {
        AkakcePages.firstProduct();
    }

    @When("Add to Cart")
    public void addToCart() {
        AkakcePages.addCart();
    }

    @When("Check at cart page")
    public void checkAtCartPage() {
        AkakcePages.checkCart();
    }
  */

    @Given("User is on homepage")
    public void userIsOnHomepage() {
        AkakcePages.HomePage();
    }

    @When("Click the search button")
    public void clickTheSearchButton() {
        AkakcePages.clickSearch();
    }

    @When("Write product name")
    public void writeProductName() {
        AkakcePages.writeProduct();
    }

    @When("Click search button")
    public void clickSearchButton() {
        AkakcePages.searchButton();

    }

    @When("Click the product")
    public void clickTheProduct() {
        AkakcePages.firstProduct();

    }

    @When("Add to Watchlist")
    public void addToWatchlist() {
        AkakcePages.addWatchList();

    }



}