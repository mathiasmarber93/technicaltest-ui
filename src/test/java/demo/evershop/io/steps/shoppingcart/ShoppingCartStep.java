package demo.evershop.io.steps.shoppingcart;

import com.github.javafaker.Faker;
import demo.evershop.io.pages.shoppingcart.ShoppingCartPage;
import demo.evershop.io.utils.SelectOptionPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;


import java.util.Random;

import static demo.evershop.io.utils.Action.click;
import static demo.evershop.io.utils.GenerateRandomNumber.generateRandomNumber;
import static demo.evershop.io.utils.SelectOptionPage.selectFromDropdownList;
import static demo.evershop.io.utils.Waits.*;

public class ShoppingCartStep extends ShoppingCartPage {

    Faker faker = new Faker();

    @Step("Click on men")
    public void clickOnMen(){
        click(getDriver(), menLink);
    }

    @Step("Select products")
    public void selectProducts(){
        if (products.size() >= 3) {
            for(int i=1; i<=3; i++){
                try {
                    String randomNumber = String.valueOf(generateRandomNumber());

                    waitForElementClickable(getDriver(), products.get(i));
                    products.get(i).click();

                    waitForElementClickable(getDriver(), quantity);
                    quantity.sendKeys(randomNumber);

                    waitForElementClickable(getDriver(), sizeProductOptions);
                    sizeProductOptions.click();

                    Thread.sleep(100);
                    waitForElementClickable(getDriver(), colorProductOptions);
                    colorProductOptions.click();
                    Thread.sleep(100);
                    waitForElementClickable(getDriver(), addToCartButton);
                    addToCartButton.click();

                    productAddedMessageIsDisplayed(getDriver(), productMessage);

                    waitForElementClickable(getDriver(), menLink);
                    click(getDriver(), menLink);

                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }

            }
        }
    }

    @Step("Click on shopping cart")
    public void clickOnShoppingCart(){
        click(getDriver(), shoppingCartIcon);
    }

    @Step("Click  on checkout")
    public void clickOnCheckOut(){
        click(getDriver(), checkoutButton);
    }

    @Step("Type full name")
    public void typeFullName(){
        String fullName = faker.name().fullName();
        fullNameInput.sendKeys(fullName);
    }

    @Step("Type telephone")
    public void typeTelephone(){
        String telephone = faker.phoneNumber().cellPhone();
        telephoneInput.sendKeys(telephone);
    }

    @Step("Type address")
    public void typeAddress(){
        String address = faker.address().streetAddress();
        addressInput.sendKeys(address);
    }

    @Step("Type city")
    public void typeCity(){
        String city = faker.address().cityName();
        cityInput.sendKeys(city);
    }

    @Step("Select country")
    public void selectCountry(){
        selectFromDropdownList(countryDropdown, "US");
    }

    @Step("Select province")
    public void selectProvince(){
        selectFromDropdownList(provinceDropdown, "US-NY");
    }

    @Step("Type post code")
    public void typePostCode(){
        String postCode = faker.address().zipCode();
        postCodeInput.sendKeys(postCode);
    }

    @Step("Click on shipping method")
    public void clickOnShippingMethod(){
        waitForElementClickable(getDriver(), shippingMethodRdbtn);
        shippingMethodRdbtn.click();
    }

    @Step("Click on continue shipping")
    public void clickOnContinuePayment(){
        click(getDriver(), continuePaymentButton);
    }

    @Step("Click on cash delivery method")
    public void clickCashMethod(){
        click(getDriver(), cashDeliveryMethod);
    }

    @Step("Click on place order")
    public void clickPlaceOrder(){
        click(getDriver(), placeOrderButton);
    }

}
