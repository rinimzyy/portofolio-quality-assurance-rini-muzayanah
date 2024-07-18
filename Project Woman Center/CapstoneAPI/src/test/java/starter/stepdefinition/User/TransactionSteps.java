package starter.stepdefinition.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.User.Transaction;

public class TransactionSteps {
    @Steps
    Transaction transaction;

    // show
    @Given("I set user get transaction endpoint with {string}")
    public void iSetUserGetTransactionEndpointWith(String uuid) {
        transaction.setUserGetTransactionDetailEndpoint(uuid);
    }

    @When("I send GET user get transaction request")
    public void iSendGETUserGetTransactionRequest() {
        transaction.sendUserGetTransactionDetailRequest();
    }

    @Then("I receive user get transaction status code response {string}")
    public void iReceiveUserGetTransactionStatusCodeResponse(String code) {
        int statusCode = Integer.parseInt(code);
        transaction.verifyUserGetTransactionDetailResponseCode(statusCode);
    }
}
