package demo.evershop.io.pages.shoppingcart;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ShoppingCartPage extends PageObject {

    @FindBy(xpath = "//a[text()='Men']")
    protected WebElementFacade menLink;

    @FindBy(className = "listing-tem")
    protected List<WebElementFacade> products;

    @FindBy(name = "qty")
    protected  WebElementFacade quantity;

    @FindBy(xpath = "//span[text()='ADD TO CART']")
    protected WebElementFacade addToCartButton;

    @FindBy(xpath = "(//ul[contains(@class,'variant-option-list')])[1]/li")
    protected List<WebElementFacade> sizeProductOptions;

    @FindBy(xpath = "(//ul[contains(@class,'variant-option-list')])[2]/li")
    protected List<WebElementFacade> colorProductOptions;

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

    @FindBy(xpath = "//select[@id='address[province]']/option")
    protected List<WebElementFacade> provinceDropdown;

    @FindBy(id = "address[province]")
    protected WebElementFacade provinceOption;

    @FindBy(name = "address[postcode]")
    protected WebElementFacade postCodeInput;

    @FindBy(xpath = "//label[contains(@for,'method')]//span[1]")
    protected List<WebElementFacade> shippingMethodRadioButtons;

    @FindBy(xpath = "//span[text()='Continue to payment']")
    protected  WebElementFacade continuePaymentButton;

    @FindBy(xpath = "(//div[contains(@class,'payment-method-list')]//a)[1]")
    protected WebElementFacade cashDeliveryMethod;

    @FindBy(xpath = "//span[text()='Place Order']")
    protected WebElementFacade placeOrderButton;

}
