package starter.stepdefinition.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Admin.PutUpdateCounselorData;

public class PutUpdateCounselorDataSteps {
    @Steps
    PutUpdateCounselorData putUpdateCounselorData;

//    Valid Endpoint
    @Given("I set PUT update counselor data valid endpoint")
    public void setPutUpdateCounselorDataValidEndpoint(){
        putUpdateCounselorData.setPutUpdateCounselorDataValidEndpoint();
    }
    @When("I send PUT HTTP request with valid endpoint")
    public void sendPutHTTPRequestWithValidEndpoint(){
        putUpdateCounselorData.sendReqPutUpdateCounselorDataValidEndpoint();
    }
    @Then("I received valid PUT HTTP response code 200")
    public void receivedValidPutHTTPResponseCode200(){
        putUpdateCounselorData.receivedPutUpdateCounselorDataResponseCode200();
    }

//    Invalid Id
    @Given("I set PUT update counselor data with endpoint and invalid id")
    public void setEndpointAndInvalidId(){
        putUpdateCounselorData.setPutUpdateCounselorDataWithEndpointAndInvalidId();
    }
    @When("I send PUT HTTP request with endpoint and invalid id")
    public void sendEndpointAndInvalidId(){
        putUpdateCounselorData.sendReqPutUpdateCounselorDataWithEndpointAndInvalidId();
    }
    @Then("I received HTTP response code 400")
    public void receiveResponseCode400(){
        putUpdateCounselorData.receivedPutUpdateCounselorDataResponseCode400();
    }

//    Invalid Endpoint
    @Given("I set PUT update counselor data invalid endpoint")
    public void setInvalidEndpoint(){
        putUpdateCounselorData.setPutUpdateCounselorDataInvalidEndpoint();
    }
    @When("I send PUT HTTP request with invalid endpoint")
    public void sendInvalidEndpoint(){
        putUpdateCounselorData.sendReqPutUpdateCounselorDataWithInvalidEndpoint();
    }
    @Then("I received HTTP response code 404")
    public void receivedResponseCode4o4(){
        putUpdateCounselorData.receivedPutUpdateCounselorDataResponseCode404();
    }

//    Without Token
    @Given("I set PUT update counselor data with endpoint")
    public void setPutUpdateCounselorDataEndpoint(){
        putUpdateCounselorData.setPutUpdateCounselorDataValidEndpoint();
    }
    @When("I send PUT HTTP request without token")
    public void sendPutHTTPRequestEndpoint(){
        putUpdateCounselorData.sendReqPutUpdateCounselorDataWithoutToken();
    }
    @Then("I received PUT HTTP response code 401")
    public void receivedPutHTTPResponseCode401(){
        putUpdateCounselorData.receivedPutUpdateCounselorDataResponseCode401();
    }
}
