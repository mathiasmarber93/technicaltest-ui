package demo.evershop.io.definitions.register;

import demo.evershop.io.steps.register.SignUpStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class SignUpDefinitions {

    @Steps(shared = true)
    SignUpStep signUp;

    @Given("customer open the website")
    public void customerOpenWebSite(){
        signUp.setDefaultBaseUrl("https://demo.evershop.io/");
        signUp.open();
    }

    @When("customer register an account")
    public void customerRegisterAnAccount(){
        signUp.clickOnSignIn();
        signUp.clickOnCreateAccount();
        signUp.typeFullName();
        signUp.typeEmail();
        signUp.typePassword();
        signUp.clickOnSignUp();
    }

}
