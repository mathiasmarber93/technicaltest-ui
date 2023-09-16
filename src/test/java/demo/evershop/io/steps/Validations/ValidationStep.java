package demo.evershop.io.steps.Validations;

import demo.evershop.io.pages.Validations.ValidationPage;
import net.serenitybdd.annotations.Step;
import org.junit.Assert;

public class ValidationStep extends ValidationPage {

    @Step("Validate order information is visible and created successfully")
    public void orderInformationIsCreatedSuccessfully(){
        Assert.assertTrue(contactInformation.isDisplayed());
        Assert.assertTrue(paymentMethod.isDisplayed());
        Assert.assertTrue(shippingAddress.isDisplayed());
        Assert.assertTrue(billingAddress.isDisplayed());
        Assert.assertTrue(items.isDisplayed());
    }

}
