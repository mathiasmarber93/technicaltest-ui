package demo.evershop.io.pages.shoppingcart;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShoppingCartPage extends PageObject {

    @FindBy(xpath = "(//a[@href='/men'])[1]")
    protected WebElementFacade menLink;

    @FindBy(className = "listing-tem")
    protected List<WebElementFacade> products;

    @FindBy(name = "qty")
    protected  WebElementFacade quantity;

    @FindBy(xpath = "//span[text()='ADD TO CART']//ancestor::button")
    protected WebElementFacade addToCartButton;

    @FindBy(xpath = "(//li[@class='mr-05'])[1]")
    protected WebElementFacade sizeProductOptions;

    @FindBy(xpath = "(//li[@class='mr-05'])[3]")
    protected WebElementFacade colorProductOptions;

    @FindBy(xpath = "//div[text()='JUST ADDED TO YOUR CART']")
    protected WebElementFacade productMessage;

    @FindBy(xpath = "//a[@href='/cart']")
    protected  WebElementFacade shoppingCartIcon;

    @FindBy(xpath = "//a[@href='/checkout']")
    protected  WebElementFacade checkoutButton;

    @FindBy(name = "address[full_name]")
    protected WebElementFacade fullNameInput;

    @FindBy(name = "address[telephone]")
    protected WebElementFacade telephoneInput;

    @FindBy(name = "address[address_1]")
    protected WebElementFacade addressInput;

    @FindBy(name = "address[city]")
    protected WebElementFacade cityInput;

    @FindBy(id = "address[country]")
    protected WebElementFacade countryDropdown;

    @FindBy(id = "address[province]")
    protected WebElementFacade provinceDropdown;

    @FindBy(name = "address[postcode]")
    protected WebElementFacade postCodeInput;

    @FindBy(xpath = "(//input[@id='method0']//following-sibling::span)[1]")
    protected WebElementFacade shippingMethodRdbtn;

    @FindBy(xpath = "//span[text()='Continue to payment']//ancestor::button")
    protected  WebElementFacade continuePaymentButton;

    @FindBy(xpath = "(//div[@class='border-divider payment-method-list']//*[local-name()='svg'])[1]")
    protected WebElementFacade cashDeliveryMethod;

    @FindBy(xpath = "//span[text()='Place Order']//ancestor::button")
    protected WebElementFacade placeOrderButton;

}
