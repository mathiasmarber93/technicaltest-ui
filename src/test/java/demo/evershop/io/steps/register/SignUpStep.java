package demo.evershop.io.steps.register;

import com.github.javafaker.Faker;
import demo.evershop.io.pages.register.SignUpPage;
import net.serenitybdd.annotations.Step;

import static demo.evershop.io.utils.Action.click;

public class SignUpStep extends SignUpPage {

    Faker faker = new Faker();

    @Step("Click on sign in")
    public void clickOnSignIn(){
        click(getDriver(), signInIcon);
    }

    @Step("Click on create an account")
    public void clickOnCreateAccount(){
        click(getDriver(), createAccountLink);
    }

    @Step("Type full name")
    public void typeFullName(){
        String fullName = faker.name().fullName();
        fullNameInput.sendKeys(fullName);
    }

    @Step("Type email")
    public void typeEmail(){
        String email = faker.bothify("????##@gmail.com");
        emailInput.sendKeys(email);
    }

    @Step("Type password")
    public void typePassword(){
        String password = faker.internet().password();
        passwordInput.sendKeys(password);
    }

    @Step("Click on sign up")
    public void clickOnSignUp(){
        click(getDriver(), signUpButton);
    }

}
