package demo.evershop.io.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionPage extends PageObject {

    public static void selectFromDropdownList(WebElementFacade element, String option){
        Select question = new Select(element);
        question.selectByValue(option);
    }
}
