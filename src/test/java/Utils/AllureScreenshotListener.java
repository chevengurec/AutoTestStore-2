package Utils;


import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

public class AllureScreenshotListener implements AfterTestExecutionCallback {

    @Override
    public void afterTestExecution(ExtensionContext context) {
        if (context.getExecutionException().isPresent()) {
            try {
                byte[] screenshot = ((TakesScreenshot) MyDriverManager.getDriver())
                        .getScreenshotAs(OutputType.BYTES);

                Allure.addAttachment("Screenshot on failure",
                        "image/png",
                        new ByteArrayInputStream(screenshot),
                        ".png");

            } catch (Exception e) {
                Allure.addAttachment("Screenshot Error", e.getMessage());
            }
        }
    }
}

