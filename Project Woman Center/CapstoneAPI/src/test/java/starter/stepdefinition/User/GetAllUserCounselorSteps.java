package starter.stepdefinition.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.User.GetAllUserCounselor;

public class GetAllUserCounselorSteps {
    @Steps
    GetAllUserCounselor getAllUserCounselor;

//    Valid Endpoint
    @Given("I set GET all user counselor valid endpoint")
    public void setGetAllUserCounselorValidEndpoint(){
        getAllUserCounselor.setGetAllUserCounselorValidEndpoint();
    }
    @When("I send GET HTTP request with valid endpoint")
    public void sendGetHTTPRequestWithValidEndpoint(){
        getAllUserCounselor.sendReqValidEndpoint();
    }
    @Then("I received valid GET HTTP response code 200")
    public void receivedValidGetHTTPResponseCode200(){
        getAllUserCounselor.receivedResponseCode200();
    }

//    Invalid Endpoint
    @Given("I set GET all user counselor invalid endpoint")
    public void setGetAllUserCounselorInvalidEndpoint(){
        getAllUserCounselor.setGetAllUserCounselorInvalidEndpoint();
    }
    @When("I send GET HTTP request with invalid endpoint")
    public void sendGetHTTPRequestWithInvalidEndpoint(){
        getAllUserCounselor.sendReqInvalidEndpoint();
    }
    @Then("I received GET HTTP response code 404")
    public void receivedGetHTTPResponseCode404(){
        getAllUserCounselor.receivedResponseCode404();
    }
}