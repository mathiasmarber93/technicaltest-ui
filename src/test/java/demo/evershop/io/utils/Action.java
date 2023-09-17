package demo.evershop.io.utils;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action extends PageObject {

    public static void click(WebDriver driver, WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).click().perform();
    }

}
