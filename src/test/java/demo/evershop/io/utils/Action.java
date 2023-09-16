package demo.evershop.io.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class Action extends PageObject {

    public static void click(WebDriver driver, WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).click().perform();
    }

}
