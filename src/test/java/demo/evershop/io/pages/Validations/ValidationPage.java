package demo.evershop.io.pages.Validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//div[text()='Contact information']//following-sibling::div")
    protected WebElementFacade contactInformation;

    @FindBy(xpath = "//div[text()='Payment Method']//following-sibling::div")
    protected WebElementFacade paymentMethod;

    @FindBy(xpath = "//div[text()='Billing Address']//following-sibling::div")
    protected WebElementFacade shippingAddress;

    @FindBy(xpath = "//div[text()='Billing Address']//following-sibling::div")
    protected WebElementFacade billingAddress;

    @FindBy(xpath = "//span[text()='Sub total']//following-sibling::div/div[1]")
    protected WebElementFacade items;

}
