package demo.evershop.io.steps.shoppingcart;

import demo.evershop.io.pages.shoppingcart.ShoppingCartPage;
import net.serenitybdd.annotations.Step;

import static demo.evershop.io.utils.Action.click;
import static demo.evershop.io.utils.GenerateRandomNumber.generateRandomNumber;
import static demo.evershop.io.utils.Waits.productAddedMessageIsDisplayed;
import static demo.evershop.io.utils.Waits.waitForElementClickable;

public class SelectProductStep extends ShoppingCartPage {

    @Step("Click on men")
    public void clickOnMen(){
        click(getDriver(), menLink);
    }

    @Step("Select products")
    public void selectProducts() throws InterruptedException {
        int randomProductsToPick = generateRandomNumber(2, 4);

        for(int i=1; i<=randomProductsToPick; i++){
            waitForElementClickable(getDriver(), products.get(i));
            products.get(i).click();

            String randomQuantity = String.valueOf(generateRandomNumber(1, 5));
            waitForElementClickable(getDriver(), quantity);
            quantity.clear();
            quantity.sendKeys(randomQuantity);

            int randomSize = generateRandomNumber(0, sizeProductOptions.size()-1);
            waitForElementClickable(getDriver(), sizeProductOptions.get(1));
            sizeProductOptions.get(randomSize).click();

            int randomColor = generateRandomNumber(0, colorProductOptions.size()-1);
            waitForElementClickable(getDriver(), colorProductOptions.get(1));
            colorProductOptions.get(randomColor).click();

            Thread.sleep(100);
            waitForElementClickable(getDriver(), addToCartButton);
            addToCartButton.click();

            productAddedMessageIsDisplayed(getDriver(), productMessage);

            waitForElementClickable(getDriver(), menLink);
            click(getDriver(), menLink);
        }
    }

}
