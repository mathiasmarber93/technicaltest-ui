package demo.evershop.io.steps.validations;

import demo.evershop.io.pages.validations.ValidationPage;
import net.serenitybdd.annotations.Step;
import org.junit.Assert;

import static demo.evershop.io.steps.register.SignUpStep.getEmail;

public class ValidationStep extends ValidationPage {

    @Step("Validate order information is visible and created successfully")
    public void orderInformationIsCreatedSuccessfully(){
        Assert.assertTrue(contactInformation.isDisplayed());
        Assert.assertEquals(getEmail(), contactInformation.getText());

        Assert.assertTrue(paymentMethod.isDisplayed());
        Assert.assertTrue(shippingAddress.isDisplayed());
        Assert.assertTrue(billingAddress.isDisplayed());
        Assert.assertTrue(items.isDisplayed());
    }

}
