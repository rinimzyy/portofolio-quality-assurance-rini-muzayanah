package starter.stepdefinition.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.User.Counselor;

public class CounselorStep {
    @Steps
    Counselor counselor;

    // View counselor data by id
    @Given("I set counselor endpoint")
    public void setVoucherEndpoint() {
        counselor.setCounselorEndpoint();
    }
    @When("I send counselor GET HTTP request with valid id")
    public void sendReq() {
        counselor.sendReq();
    }
    @Then("I success get counselor data")
    public void successViewAllVoucher() {
        counselor.successViewCounselorById();
    }

    // View counselor data by invalid id
    @Given("I set counselor endpoints")
    public void setVoucherEndpoints() {
        counselor.setCounselorEndpoint();
    }
    @When("I send counselor GET HTTP request with invalid id")
    public void sendReqInvId() {
        counselor.sendReqInvId();
    }
    @Then("I fail get counselor data")
    public void failViewAllVoucher() {
        counselor.failViewCounselorById();
    }

    // View counselor data by invalid token
    @Given("I set counselor endpoints url")
    public void setVoucherEndpointsUrl() {
        counselor.setCounselorEndpoint();
    }
    @When("I send counselor GET HTTP request with invalid token")
    public void sendReqInvToken() {
        counselor.sendReqInvToken();
    }
    @Then("I fail get counselor data 401")
    public void failViewAllVoucher401() {
        counselor.failViewCounselorById401();
    }
}
