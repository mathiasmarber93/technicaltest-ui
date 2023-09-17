package demo.evershop.io.pages.shoppingcart;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SelectProductPage extends PageObject {
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
}
