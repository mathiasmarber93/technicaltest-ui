package demo.evershop.io.steps.shoppingcart;

import com.github.javafaker.Faker;
import demo.evershop.io.pages.shoppingcart.ShoppingCartPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;


import static demo.evershop.io.utils.Action.click;
import static demo.evershop.io.utils.GenerateRandomNumber.generateRandomNumber;
import static demo.evershop.io.utils.SelectOptionPage.selectFromDropdownListByIndex;
import static demo.evershop.io.utils.SelectOptionPage.selectFromDropdownListByValue;
import static demo.evershop.io.utils.Waits.*;

public class ShoppingCartStep extends ShoppingCartPage {

    Faker faker = new Faker();

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
        selectFromDropdownListByValue(countryDropdown, "US");
    }

    @Step("Select province")
    public void selectProvince(){
        int index = generateRandomNumber(1, provinceDropdown.size());
        selectFromDropdownListByIndex(provinceOption, index);
    }

    @Step("Type post code")
    public void typePostCode(){
        String postCode = faker.address().zipCode();
        postCodeInput.sendKeys(postCode);
    }

    @Step("Click on shipping method")
    public void clickOnShippingMethod(){
        waitForElementClickable(getDriver(), shippingMethodRadioButtons.get(1));
        int randomShippingMethod = generateRandomNumber(0, shippingMethodRadioButtons.size()-1);
        shippingMethodRadioButtons.get(randomShippingMethod).click();
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
