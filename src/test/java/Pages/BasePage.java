package Pages;

import Utils.MyDriverManager;
import Utils.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;
    WaitHelper waitHelper;

    public BasePage() {
        this.driver = MyDriverManager.getDriver();
        this.waitHelper = new WaitHelper(driver, 10);
        PageFactory.initElements(driver, this);
    }

    protected void clickTheButton(WebElement element) {
        waitHelper.waitForClickable(element).click();
    }

    protected void fillTheField(WebElement element, String text) {

        WebElement readyElement = waitHelper.waitForClickable(element);
        readyElement.clear();
        readyElement.sendKeys(text);
    }



}
