package demo.evershop.io.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionPage extends PageObject {

    public static void selectFromDropdownListByValue(WebElementFacade element, String value){
        Select question = new Select(element);
        question.selectByValue(value);
    }

    public static void selectFromDropdownListByIndex(WebElementFacade element, Integer index){
        Select question = new Select(element);
        question.selectByIndex(index);
    }
}
