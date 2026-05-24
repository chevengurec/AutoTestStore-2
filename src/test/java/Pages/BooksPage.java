package Pages;

import Utils.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends BasePage {

    @FindBy(xpath = "//a[text()='Paperback']")
    WebElement paperbackSubcategory;

    public BooksPage() {
        super();
    }

    public PaperbackPage choosePaperbackSubcategory() {
       clickTheButton(paperbackSubcategory);
       return new PaperbackPage();
    }
}
