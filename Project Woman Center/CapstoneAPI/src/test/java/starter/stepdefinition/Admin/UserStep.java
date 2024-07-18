package starter.stepdefinition.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Admin.User;

public class UserStep {
    @Steps
    User user;

    // View All Users
    @Given("I set get user endpoint")
    public void setGetUserEndpoint() {
        user.setGetUserEndpoint();
    }
    @When("I send a get user request with valid token")
    public void sendReq() {
        user.sendReq();
    }
    @Then("I successfully view all user")
    public void successViewUser() {
        user.successGet();
    }

    // View Filtered Users
    @Given("I set get user endpoints")
    public void setGetUserEndpointWithFilter() {
        user.setGetUserEndpointWithFilter();
    }
    @When("I send a get user request with filtered condition")
    public void sendReqWithFilter() {
        user.sendReqWithFilter();
    }
    @Then("I successfully view filtered user")
    public void successViewUserWithFilter() {
        user.successGet();
    }

    // View Filtered Invalid Endpoint
    @Given("I set get user invalid endpoints")
    public void setGetUserInvEnd() {
        user.setGetUserInvEndpoint();
    }
    @When("I send a get user request with invalid endpoint")
    public void sendReqInvEnd() {
        user.sendReqInvEnd();
    }
    @Then("I fail view all user 404")
    public void failGet404() {
        user.failGet404();
    }

    // View Filtered Invalid Token
    @Given("I set get user invalid token")
    public void setGetUserInvToken() {
        user.setGetUserEndpoint();
    }
    @When("I send a get user request with invalid token")
    public void sendReqInvToken() {
        user.sendReqInvToken();
    }
    @Then("I fail view all user 401")
    public void failGet401() {
        user.failGet401();
    }

    // View user data by ID
    @Given("I set get user endpoint by ID")
    public void setUserDataEndpoint() {
        user.setUserDataEndpoint();
    }
    @When("I send a get user request with valid ID")
    public void sendReqUserData() {
        user.sendReqUserData();
    }
    @Then("I successfully view user data")
    public void successViewUserData() {
        user.successGet();
    }

    // View user data by invalid ID
    @Given("I set get user endpoint by invalid ID")
    public void setUserDataEndpointInvID() {
        user.setUserDataEndpointInvID();
    }
    @When("I send a get user request with invalid ID")
    public void sendReqUserDataInvID() {
        user.sendReqUserDataInvID();
    }
    @Then("I fail view user data 404")
    public void failViewUserData404() {
        user.failGet404();
    }

    // View user data by invalid Token
    @Given("I set get user endpoint by invalid token")
    public void setUserDataEndpointInvToken() {
        user.setUserDataEndpoint();
    }
    @When("I send a get user data request with invalid token")
    public void sendReqUserDataInvToken() {
        user.sendReqUserDataInvToken();
    }
    @Then("I fail view user data 401")
    public void failViewUserData401() {
        user.failGet401();
    }

    // Delete user data by ID
    @Given("I set delete user endpoint by ID")
    public void setDeleteUserEndpoint() {
        user.setDeleteUserDataEndpoint();
    }
    @When("I send a delete user request with valid ID")
    public void sendReqDeleteUserData() {
        user.sendDeleteReqUserData();
    }
    @Then("I successfully delete user data")
    public void successDeleteUserData() {
        // user.successGet();
    }

    // Delete user data by Invalid ID
    @Given("I set delete user endpoint by invalid ID")
    public void setInvalidDeleteUserEndpoint() {
        user.setInvalidDeleteUserDataEndpoint();
    }
    @When("I send a delete user request with invalid ID")
    public void sendInvalidReqDeleteUserData() {
        user.sendInvalidDeleteReqUserData();
    }
    @Then("I fail delete user data 404")
    public void failDeleteUserData() {
        user.failGet404();
    }
}









