package Pages;

import Utils.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import configs.ConfiguratorManager;

public class HomePage extends BasePage {

    @FindBy(xpath = "//nav//a[contains(text(),'Books')]")
    WebElement booksCategory;
    public HomePage() {
        super();
    }
    public BooksPage chooseBooksCategory() {
        clickTheButton(booksCategory);
        return new BooksPage();
    }

    public HomePage open() {
        driver.get(ConfiguratorManager.getProjectConfig().homePageURL());
        return this;
    }
}
