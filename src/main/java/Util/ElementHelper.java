package Util;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


public class ElementHelper {
    static WebDriver driver;
    WebDriverWait wait;
    Actions action;

    static WebElement elementFollowButton;

    public ElementHelper(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.action = new Actions(driver);
    }

    public WebElement presenceElement(By key){
        return
                wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }
    public WebElement findElement(By key){
        WebElement element = presenceElement(key);
        return element;
    }
    public void click(By key){
        findElement(key).click();
    }
    public void sendKey(By key, String text){
        findElement(key).sendKeys(text);
    }

    public static void scrollDownForFollowButton(){
        elementFollowButton = driver.findElement(By.cssSelector("div[class='bb_w'] a[class='iC xt_v8'] b"));  //Takip et kısmına inecek
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementFollowButton);
    }

}