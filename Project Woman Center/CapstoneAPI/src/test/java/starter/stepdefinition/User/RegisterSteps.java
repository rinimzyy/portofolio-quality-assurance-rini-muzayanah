package starter.stepdefinition.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.User.Register;

public class RegisterSteps {
    @Steps
    Register register;

    @Given("I set POST user verify credential endpoint")
    public void iSetPOSTUserVerifyCredentialEndpoint() {
        register.setVerifyCredentialEndpoint();
    }

    @When("I send POST user verify credential request with {string} and {string}")
    public void iSendPOSTUserVerifyCredentialRequestWithAnd(String email, String username) {
        register.sendVerifyCredentialRequest(email, username);
    }

    @Then("I receive verify credential status code {string}")
    public void iReceiveVerifyCredentialStatusCode(String s_statusCode) {
        int statusCode = Integer.parseInt(s_statusCode);
        register.receiveVerifyCredentialStatusCode(statusCode);
    }
}
