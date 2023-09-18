package demo.evershop.io.definitions.shoppingcart;

import demo.evershop.io.steps.validations.ValidationStep;
import demo.evershop.io.steps.register.SignUpStep;
import demo.evershop.io.steps.shoppingcart.SelectProductStep;
import demo.evershop.io.steps.shoppingcart.ShoppingCartStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class ShoppingCartDefinitions {

    @Steps(shared = true)
    SelectProductStep sp;

    @Steps(shared = true)
    ShoppingCartStep sc;

    @Steps(shared = true)
    SignUpStep su;

    @Steps(shared = true)
    ValidationStep validate;

    @And("buys products in the shopping cart")
    public void customerBuyProducts() throws InterruptedException {
        sp.clickOnMen();
        sp.selectProducts();
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
