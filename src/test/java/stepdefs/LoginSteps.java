package stepdefs;

import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.*;
import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("I open the SauceDemo login page")
    public void openLoginPage() {
        open("https://www.saucedemo.com/");
    }

    @When("I enter valid credentials")
    public void enterValidCredentials() {
        $("#user-name").setValue("standard_user");
        $("#password").setValue("secret_sauce");
        $("#login-button").click();
    }

    @Then("I should see the products page")
    public void verifyProductPage() {
        $(".title").shouldHave(Condition.text("Products"));
        closeWebDriver();  // Clean up browser
    }
}
