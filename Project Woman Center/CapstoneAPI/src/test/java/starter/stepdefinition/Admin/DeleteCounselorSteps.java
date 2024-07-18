package starter.stepdefinition.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Admin.DeleteCounselor;

public class DeleteCounselorSteps {
    @Steps
    DeleteCounselor deleteCounselor;

//    Valid endpoint
    @Given("I set delete counselor valid endpoint")
    public void setDeleteCounselorValidEndpoint(){
        deleteCounselor.setDeleteCounselorWithValidEndpoint();
    }
    @When("I send delete HTTP request with valid endpoint")
    public void sendDeleteHTTPRequestWithValidEndpoint(){
        deleteCounselor.sendReqDeleteCounselorWithValidEndpoint();
    }
    @Then("I received valid Delete HTTP response code")
    public void receivedValidHTTPResponseCode(){
        deleteCounselor.receivedDeleteCounselorResponseCode();
    }

//    Invalid id
    @Given("I set delete counselor with endpoint and invalid id")
    public void setDeleteCounselorWithEndpointAndInvalidId(){
        deleteCounselor.setDeleteCounselorWithEndpointAndInvalidId();
    }
    @When("I send delete HTTP request with endpoint and invalid id")
    public void sendDeleteHTTPRequestWithEndpointAndInvalidId(){
        deleteCounselor.sendReqDeleteCounselorWithEndpointAndInvalidId();
    }
    @Then("I received delete HTTP response code 400")
    public void receivedDeleteHTTPResponseCode400(){
        deleteCounselor.receivedDeleteCounselorResponseCode400();
    }

//    Invalid Endpoint
    @Given("I set delete counselor invalid endpoint")
    public void setDeleteCounselorInvalidEndpoint(){
        deleteCounselor.setDeleteCounselorWithInvalidEndpoint();
    }
    @When("I send delete HTTP request with invalid endpoint")
    public void sendDeleteHTTPRequestWithInvalidEndpoint(){
        deleteCounselor.sendReqDeleteCounselorWithInvalidEndpoint();
    }
    @Then("I received delete HTTP response code 404")
    public void receivedDeleteHTTPResponseCode404(){
        deleteCounselor.receivedDeleteCounselorResponseCode404();
    }

//    Without Token
    @Given("I set DELETE counselor with valid endpoint")
    public void setDeleteCounselorWithValidEndpoint(){
        deleteCounselor.setDeleteCounselorWithValidEndpoint();
    }
    @When("I send DELETE HTTP request without Token")
    public void sendDeleteHTTPRequestWithEndpoint(){
        deleteCounselor.sendReqDeleteCounselorWithoutToken();
    }
    @Then("I received DELETE HTTP response code 401")
    public void receivedDeleteHTTPResponseCode401(){
        deleteCounselor.receivedDeleteCounselorResponseCode401();
    }
}
