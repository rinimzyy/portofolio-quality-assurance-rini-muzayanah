package starter.stepdefinition.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.User.GetAllReviewCounselor;

public class GetAllReviewCounselorSteps {
    @Steps
    GetAllReviewCounselor getAllReviewCounselor;

//    Valid Endpoint
    @Given("I set GET all review counselor valid endpoint")
    public void setGetAllReviewCounselorValidEndpoint(){
        getAllReviewCounselor.setGetAllReviewCounselorWithValidEndpoint();
    }
    @When("I send GET all review HTTP request with valid endpoint")
    public void sendGetAllReviewHTTPReqWithValidEndpoint(){
        getAllReviewCounselor.sendGetAllReviewCounselorWithValidEndpoint();
    }
    @Then("I received GET all review HTTP response code 200")
    public void receivedGetAllReviewHTTPResponseCode200(){
        getAllReviewCounselor.receivedGetAllReviewCounselorResponseCode200();
    }

//    Invalid Endpoint
    @Given("I set GET all review counselor invalid endpoint")
    public void setGetAllReviewCounselorInvalidEndpoint(){
        getAllReviewCounselor.setGetAllReviewCounselorWithInvalidEndpoint();
    }
    @When("I send GET all review HTTP request with invalid endpoint")
    public void sendGetAllReviewHTTPRequestWithValidEndpoint(){
        getAllReviewCounselor.sendGetAllReviewCounselorWithInvalidEndpoint();
    }
    @Then("I received GET all review HTTP response code 404")
    public void receivedGetAllReviewHTTPResponseCode404(){
        getAllReviewCounselor.receivedGetAllReviewCounselorResponseCode404();
    }

//    Invalid Id
    @Given("I set GET all review counselor invalid Id")
    public void setGetAllReviewCounselorInvalidId(){
        getAllReviewCounselor.setGetAllReviewCounselorWithInvalidId();
    }
    @When("I send GET all review HTTP request with invalid Id")
    public void sendGetAllReviewHTTPReqInvalidId(){
        getAllReviewCounselor.sendGetAllReviewCounselorWithInvalidId();
    }
    @Then("I received GET all review HTTP response code 400")
    public void receivedGetAllReviewHTTPResponseCode400(){
        getAllReviewCounselor.receivedGetAllReviewCounselorResponseCode400();
    }

//    Without Token
    @Given("I set GET all review counselor valid endpoint and without token")
    public void setGetAllReviewCounselorWithoutToken(){
        getAllReviewCounselor.setGetAllReviewCounselorWithValidEndpoint();
    }
    @When("I send GET all review HTTP request with valid endpoint and without token")
    public void sendGetAllReviewHTTPReqWithoutToken(){
        getAllReviewCounselor.sendGetAllReviewCounselorWithoutToken();
    }
    @Then("I received GET all review HTTP response code 401")
    public void receivedGetAllReviewHTTPResponseCode401(){
        getAllReviewCounselor.receivedGetAllReviewCounselorResponseCode401();
    }
}
