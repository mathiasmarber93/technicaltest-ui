package demo.evershop.io.definitions.shoppingcart;

import demo.evershop.io.steps.Validations.ValidationStep;
import demo.evershop.io.steps.register.SignUpStep;
import demo.evershop.io.steps.shoppingcart.ShoppingCartStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class ShoppingCartDefinitions {

    @Steps(shared = true)
    ShoppingCartStep sc;

    @Steps(shared = true)
    SignUpStep su;

    @Steps(shared = true)
    ValidationStep validate;

    @And("customer buy products in the shopping cart")
    public void customerBuyProducts() throws InterruptedException {
        sc.clickOnMen();
        sc.selectProducts();
        sc.clickOnShoppingCart();
        sc.clickOnCheckOut();
        sc.typeFullName();
        sc.typeTelephone();
        sc.typeAddress();
        sc.typeCity();
        sc.selectCountry();
        sc.selectProvince();
        sc.typePostCode();
        sc.clickOnShippingMethod();
        sc.clickOnContinuePayment();
        sc.clickCashMethod();
        sc.clickPlaceOrder();
    }

    @Then("the order is created successfully with the correct information")
    public void orderIsCreatedWithCorrectInformation(){
        validate.orderInformationIsCreatedSuccessfully();
    }

}
