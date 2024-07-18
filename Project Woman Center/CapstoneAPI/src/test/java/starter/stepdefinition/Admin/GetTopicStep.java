package starter.stepdefinition.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Admin.GetTopic;

public class GetTopicStep {
    @Steps
    GetTopic topic;

    // View All Topics
    @Given("I set topic endpoint URL")
    public void setAdminProfileEndpoint() {
        topic.setTopicEndpoint();
    }
    @When("I send a get topic request with valid token")
    public void sendReq() {
        topic.sendReqWithValidToken();
    }
    @Then("I successfully view all topic")
    public void successViewAdminProfile() {
        topic.successViewAdminProfile();
    }

    // View All Topics With Wrong Method
    @Given("I set topic endpoint")
    public void setAdminProfileEndp() {
        topic.setTopicEndpoint();
    }
    @When("I send a get topic request with wrong method")
    public void sendRequest() {
        topic.sendReqWithWrongMethod();
    }
    @Then("I fail to view all topics and receive status code 405")
    public void failViewAdminProfile() {
        topic.failViewAdminProfile();
    }

    // View All Topics With Wrong Endpoint
    @Given("I set topic endpoints url")
    public void setGetTopic() {
        topic.setTopicInvEndpoint();
    }
    @When("I send a get topic request with wrong endpoint")
    public void sendRequestInvEnd() {
        topic.sendReqInvEnd();
    }
    @Then("I fail to view all topics and receive status code 404")
    public void failViewTopic404() {
        topic.failViewTopic404();
    }
}
