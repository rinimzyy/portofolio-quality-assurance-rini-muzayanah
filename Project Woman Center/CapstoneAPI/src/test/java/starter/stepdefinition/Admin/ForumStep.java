package starter.stepdefinition.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Admin.Forum;

public class ForumStep {
    @Steps
    Forum forum;

    // View All Forum
    @Given("I set forum endpoint URL")
    public void setCareerEndpoint() {
        forum.setForumEndpoint();
    }
    @When("I send a get forum request with valid auth")
    public void sendReq() {
        forum.sendReq();
    }
    @Then("I successfully view all forum")
    public void successViewAllForum() {
        forum.response200();
    }

    // View All Forum Invalid Endpoint
    @Given("I set forum invalid endpoint URL")
    public void setCareerInvEndpoint() {
        forum.setForumInvEndpoint();
    }
    @When("I send a get forum request with invalid endpoint")
    public void sendReqInvEndpoint() {
        forum.sendReqInvEnd();
    }
    @Then("I fail view all forum 404")
    public void failViewForum404() {
        forum.response404();
    }

    // View All Forum Invalid Token
    @Given("I set forum endpoint")
    public void setCareerInvToken() {
        forum.setForumEndpoint();
    }
    @When("I send a get forum request with invalid token")
    public void sendReqInvToken() {
        forum.sendReqInvToken();
    }
    @Then("I fail view all forum 401")
    public void failViewForum401() {
        forum.response401();
    }

    // View Forum Detail by ID
    @Given("I set forum endpoint URL with ID")
    public void setForumByIdEndpoint() {
        forum.setForumEndpointByID();
    }
    @When("I send a get forum request with valid id")
    public void sendReqByID() {
        forum.sendReqByID();
    }
    @Then("I success view forum detail")
    public void successViewForumDetail() {
        forum.response200();
    }

    // View Forum Detail by invalid ID
    @Given("I set forum endpoint URL with invalid ID")
    public void setForumByIdEndpoints() {
        forum.setForumEndpointByInvID();
    }
    @When("I send a get forum request with invalid id")
    public void sendReqByInvID() {
        forum.sendReqByInvID();
    }
    @Then("I fail view forum detail 400")
    public void failViewForumDetail400() {
        forum.response400();
    }

    // View Forum Detail by invalid Token
    @Given("I set forum endpoint URL with invalid token")
    public void setForumByIdEnd() {
        forum.setForumEndpointByID();
    }
    @When("I send a get forum by id request with invalid token")
    public void sendReqByInvToken() {
        forum.sendReqByInvToken();
    }
    @Then("I fail view forum detail 401")
    public void failViewForumDetail401() {
        forum.response401();
    }

    // Delete Forum by ID
    @Given("I set forum endpoint with valid ID")
    public void setDeleteForumByIdEndpoint() {
        forum.setDeleteForumEndpointInvID();
    }
    @When("I send a delete forum request with valid id")
    public void sendReqDeleteByID() {
        forum.sendReqDeleteByID();
    }
    @Then("I success delete forum by id")
    public void successDeleteForum() {
        // forum.response200();
    }

    // Delete Forum by invalid ID
    @Given("I set forum endpoint with invalid ID")
    public void setDeleteForumByInvIdEndpoint() {
        forum.setDeleteForumEndpointInvID();
    }
    @When("I send a delete forum request with invalid id")
    public void sendReqDeleteInvID() {
        forum.sendReqDeleteInvID();
    }
    @Then("I fail delete forum by id 400")
    public void failDeleteForum() {
        forum.response400();
    }
}
