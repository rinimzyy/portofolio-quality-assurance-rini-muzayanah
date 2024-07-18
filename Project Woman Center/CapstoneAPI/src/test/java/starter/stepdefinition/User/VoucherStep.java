package starter.stepdefinition.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.User.Voucher;

public class VoucherStep {
    @Steps
    Voucher voucher;

    // View All Voucher
    @Given("I set voucher endpoint")
    public void setVoucherEndpoint() {
        voucher.setVoucherEndpoint();
    }
    @When("I send voucher GET http request with valid user token")
    public void sendReq() {
        voucher.sendReq();
    }
    @Then("I successfully get all voucher")
    public void successViewAllVoucher() {
        voucher.successViewAllVoucher();
    }

    // Fail View All Voucher 401
    @Given("I set voucher endpoints")
    public void setVoucherEndpoints() {
        voucher.setVoucherEndpoint();
    }
    @When("I send voucher GET http request with invalid user token")
    public void sendReqInvToken() {
        voucher.sendReqInvToken();
    }
    @Then("I fail get all voucher 401")
    public void failViewAllVoucher401() {
        voucher.failViewAllVoucher401();
    }

    // Fail View All Voucher 404
    @Given("I set voucher invalid endpoints")
    public void setVoucherInvEndpoints() {
        voucher.setInvalidEndpoint();
    }
    @When("I send voucher GET http request with invalid endpoints")
    public void sendReqInvEndpoint() {
        voucher.sendReqInvEnd();
    }
    @Then("I fail get all voucher 404")
    public void failViewAllVoucher404() {
        voucher.failViewAllVoucher404();
    }
}
