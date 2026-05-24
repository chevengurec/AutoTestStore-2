package Tests;

import Pages.HomePage;
import Utils.MyDriverManager;
import configs.ConfiguratorManager;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.DriverManager;

import static io.qameta.allure.SeverityLevel.BLOCKER;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("Выбор категории")
@Severity(BLOCKER)
public class BooksCategoryChooseTest extends BaseTest {

    @Test
    @DisplayName("Выбираем категорию Books")
    protected void chooseBooksCategoryTest() {
        new HomePage().open().chooseBooksCategory();
        assertEquals(ConfiguratorManager.getProjectConfig().booksPageURL(), MyDriverManager.getDriver().getCurrentUrl());
    }

    @Test
    @DisplayName("Не выбираем категорию Books")
    protected void notChooseBooksCategoryTest() {
        new HomePage().open();
        assertEquals(ConfiguratorManager.getProjectConfig().booksPageURL(), MyDriverManager.getDriver().getCurrentUrl());
    }
}
