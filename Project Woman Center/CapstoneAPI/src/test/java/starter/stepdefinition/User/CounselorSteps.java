package starter.stepdefinition.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.User.Counselor;

public class CounselorSteps {
    @Steps
    Counselor counselor;

    @Given("I set user get counselor schedule endpoint with {string}")
    public void iSetUserGetCounselorScheduleEndpointWith(String uuid) {
        counselor.setGetCounselorScheduleEndpoint(uuid);
    }

    @When("I send GET user get counselor schedule request")
    public void iSendGETUserGetCounselorScheduleRequest() {
        counselor.sendUserGetCounselorScheduleRequest();
    }

    @Then("I receive user get counselor schedule status code response {string}")
    public void iReceiveUserGetCounselorScheduleStatusCodeResponse(String code) {
        int statusCode = Integer.parseInt(code);
        counselor.verifyUserGetCounselorScheduleResponseCode(statusCode);
    }
}
