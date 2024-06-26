package praktikum.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class StatusPage {
    private final By notFoundImage = By.cssSelector("[alt='Not found']");
    private final WebDriver driver;

    public StatusPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkNotFound() {
        (new WebDriverWait(this.driver, Duration.ofSeconds(10L)))
                .until(ExpectedConditions.visibilityOfElementLocated(this.notFoundImage));

        assert this.driver.findElement(this.notFoundImage).isDisplayed();

    }
}
