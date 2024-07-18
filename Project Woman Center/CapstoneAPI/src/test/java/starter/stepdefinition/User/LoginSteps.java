package starter.stepdefinition.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.User.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Given("I set user login endpoint")
    public void setUserLoginEndpoint() {
        login.setUserLoginEndpoint();
    }

    @When("I send user POST request with {string} and {string}")
    public void sendUserPostRequest(String username, String password) {
        login.sendUserPostRequest(username, password);
    }

    // success login
    @Then("Success login and receive response with a token")
    public void verifySuccessUserLogin() {
        login.verifySuccessUserLogin();
    }

    // failed login
    @Then("I fail user login and receive response code 400")
    public void verifyFailedUserLogin() {
        login.verifyFailedUserLogin();
    }

}
