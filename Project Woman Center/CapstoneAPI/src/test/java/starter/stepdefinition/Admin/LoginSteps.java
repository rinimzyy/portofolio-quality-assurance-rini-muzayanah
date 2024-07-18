package starter.stepdefinition.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Admin.Login;

public class LoginSteps {
    @Steps
    Login login;

    // Login with valid data
    @Given("I set login endpoint server")
    public void setLoginEndpointUrl() {
        login.setLoginEndpoint();
    }
    @When("I send POST request with {string} and {string}")
    public void sendPostRequest(String username, String password) {
        login.sendPostRequest(username, password);
    }
    @Then("I success login and receive response with a token")
    public void verifyResponse() {
        login.verifyResponse();
    }

    // Login with invalid data
    @Given("I set login endpoint")
    public void setLoginEndpoint() {
        login.setLoginEndpoint();
    }
    @When("I send POST request {string} and {string}")
    public void sendPostReq(String username, String password) {
        login.sendPostRequest(username, password);
    }
    @Then("I fail login and receive response code 400")
    public void verifyResponseFail() {
        login.verifyResponseFail();
    }

    // Login with invalid method
    @Given("I set login endpoint with invalid method")
    public void setLoginEnd() {
        login.setLoginEndpoint();
    }
    @When("I send GET http request {string} and {string}")
    public void sendPostReqInvMethod(String username, String password) {
        login.sendPostWrongMethod(username, password);
    }
    @Then("I fail login and receive response code 401")
    public void verifyResponse401() {
        login.verifyResponse401();
    }
}
