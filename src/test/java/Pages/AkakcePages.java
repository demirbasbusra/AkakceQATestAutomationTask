package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AkakcePages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static WebElement elementFollowButton;

    static By search = By.xpath("//input[@id='q']");
    static By searchButton = By.xpath("//button[@title='Ara']");
    static By firstProduct =By.cssSelector("img[alt='iPhone 13 128 GB']");
    static By follow = By.cssSelector("div[id='pf_w_v8'] span[class='ufo_v8']");

    public AkakcePages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void HomePage() {
    }


    public static void clickSearch() {
        elementHelper.click(search);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeProduct() {
        elementHelper.sendKey(search,"iphone");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void searchButton() {
        elementHelper.click(searchButton);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void firstProduct() {
        elementHelper.click(firstProduct);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void addWatchList() {
        elementHelper.scrollDownForFollowButton();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        elementHelper.click(follow);
    }

}