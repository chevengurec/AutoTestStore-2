package Tests;

import Pages.HomePage;
import Utils.MyDriverManager;
import configs.ConfiguratorManager;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import org.aeonbits.owner.Config;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.SeverityLevel.BLOCKER;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Выбор подкатегории")
@Severity(BLOCKER)
public class PaperbackCategoryChooseTest {

    @Test
    @DisplayName("Выбираем подкатегорию Paperback")
    protected void chooseSubCategoryPage() {
        new HomePage().open().chooseBooksCategory().choosePaperbackSubcategory();
        assertEquals(ConfiguratorManager.getProjectConfig().paperbackSubcategoryURL(), MyDriverManager.getDriver().getCurrentUrl());
    }

    @Test
    @DisplayName("Не выбираем подкатегорию Paperback")
    protected void nonChooseSubCategoryPage() {
        new HomePage().open();
        assertEquals(ConfiguratorManager.getProjectConfig().paperbackSubcategoryURL(), MyDriverManager.getDriver().getCurrentUrl());
    }
}
