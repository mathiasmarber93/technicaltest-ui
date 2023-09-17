package demo.evershop.io.pages.register;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

public class SignUpPage extends PageObject {

    @FindBy(xpath = "//a[@href='/account/login']")
    protected WebElementFacade signInIcon;

    @FindBy(xpath = "//a[@href='/account/register']")
    protected WebElementFacade createAccountLink;

    @FindBy(name = "full_name")
    protected WebElementFacade fullNameInput;

    @FindBy(name = "email")
    protected WebElement emailInput;

    @FindBy(name = "password")
    protected WebElement passwordInput;

    @FindBy(xpath = "//span[text()='SIGN UP']")
    protected WebElementFacade signUpButton;

}
