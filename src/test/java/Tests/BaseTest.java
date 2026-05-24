package Tests;

import Utils.AllureScreenshotListener;
import Utils.MyDriverManager;
import Utils.WaitHelper;
import configs.ProjectConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import java.sql.DriverManager;

@ExtendWith(AllureScreenshotListener.class)
public class BaseTest {

   @BeforeEach
   void setup() {
      MyDriverManager.getDriver();
   }

   @AfterEach
   void quit() {
      MyDriverManager.quitDriver();
   }


}
