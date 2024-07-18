package starter.stepdefinition.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.User.CreateReviewCounselor;

public class CreateReviewCounselorSteps {
    @Steps
    CreateReviewCounselor createReviewCounselor;

//    Valid Endpoint
    @Given("I set POST create review counselor valid endpoint")
    public void setPostCreateReviewCounselorValidEndpoint(){
        createReviewCounselor.setCreateReviewCounselorWithValidEndpoint();
    }
    @When("I send POST create review counselor HTTP request with valid endpoint")
    public void sendPostCreateReviewCounselorHTTPReqWithValidEndpoint(){
        createReviewCounselor.sendCreateReviewCounselorValidEndpoint();
    }
    @Then("I received POST create review counselor HTTP response code")
    public void receivedPostCreateCounselorHTTPResponseCode200(){
        createReviewCounselor.receivedCreateReviewCounselorWIthValidEndpoint();
    }

//    Invalid Endpoint
    @Given("I set POST create review counselor invalid endpoint")
    public void setPostCreateReviewCounselorInvalidEndpoint(){
        createReviewCounselor.setCreateReviewCounselorWithInvalidEndpoint();
    }
    @When("I send POST create review counselor HTTP request with invalid endpoint")
    public void sendPostCreateReviewCounselorHTTPReqWithInvalidEndpoint(){
        createReviewCounselor.sendCreateReviewCounselorInvalidEndpoint();
    }
    @Then("I received POST create review counselor HTTP response code 404")
    public void receivedPostCreateReviewCounselorHTTPResponseCode404(){
        createReviewCounselor.receivedCreateReviewCounselorWIthInvalidEndpoint();
    }

//    Invalid Id
    @Given("I set POST create review counselor invalid Id")
    public void setPostCreateReviewCounselorInvalidId(){
        createReviewCounselor.setCreateReviewCounselorWithInvalidId();
    }
    @When("I send POST create review counselor HTTP request with invalid id")
    public void sendPostCreateReviewCounselorHTTPReqInvalidId(){
        createReviewCounselor.sendCreateReviewCounselorInvalidId();
    }
    @Then("I received POST create review counselor HTTP response code 400")
    public void receivedPostCreateReviewCounselorHTTPResponseCode400(){
        createReviewCounselor.receivedCreateReviewCounselorWIthInvalidEndpoint400();
    }

//    Without Token
    @Given("I set POST create review counselor valid endpoint and without token")
    public void setPostCreateReviewCounselorWithoutToken(){
        createReviewCounselor.setCreateReviewCounselorWithValidEndpoint();
    }
    @When("I send POST create review counselor HTTP request with valid endpoint and without token")
    public void sendPostCreateReviewCounselorHTTPReqWithoutToken(){
        createReviewCounselor.sendCreateReviewCounselorWithoutToken();
    }
    @Then("I received POST create review counselor HTTP response code 401")
    public void receivedPostCreateReviewCounselorHTTPResponseCode401(){
        createReviewCounselor.receivedCreateReviewCounselorWithoutToken();
    }

//    Does Not Include Any Conditions
    @Given("I set POST create review counselor Does Not Include Any Conditions")
    public void setPostCreateReviewCounselorDoesNotIncludeAnyConditions(){
        createReviewCounselor.setCreateReviewCounselorWithValidEndpoint();
    }
    @When("I send POST create review counselor HTTP request Does Not Include Any Conditions")
    public void sendCreateReviewCounselorReqDoesNotIncludeAnyConditions(){
        createReviewCounselor.sendCreateReviewCounselorDoesNotIncludeAnyConditions();
    }
    @Then("I received create review counselor HTTP response code 400")
    public void receivedCreateReviewCounselorHTTPResponseCode400(){
        createReviewCounselor.receivedCreateReviewCounselorWIthInvalidEndpoint400();
    }
}