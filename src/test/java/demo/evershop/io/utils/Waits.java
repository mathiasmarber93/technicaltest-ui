package demo.evershop.io.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits extends PageObject {

    public static void waitForElementClickable(WebDriver driver, WebElementFacade element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.withTimeout(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static boolean productAddedMessageIsDisplayed(WebDriver driver, WebElementFacade element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.withTimeout(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.isDisplayed();
    }

}
