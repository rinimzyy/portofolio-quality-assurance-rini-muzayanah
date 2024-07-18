package starter.stepdefinition.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Admin.GetArticleById;

public class GetArticleByIdSteps {
    @Steps
    GetArticleById getArticleById;

//    Valid Id
    @Given("I set GET article by id valid endpoint")
    public void setGetArticleByIdValidEndpoint(){
        getArticleById.setGetArticleByIdValidEndpoint();
    }
    @When("I send GET article by id HTTP request with valid endpoint")
    public void sendGetArticleByIdHTTPRequestWithValidEndpoint(){
        getArticleById.sendGetArticleByIdValidEndpoint();
    }
    @Then("I received GET article by id HTTP response code 200")
    public void receivedGetArticleByIdHTTPResponseCode200(){
        getArticleById.receivedGetArticleByIdResponseCode200();
    }

//    Invalid endpoint
    @Given("I set GET article by id invalid endpoint")
    public void setGetArticleByIdInvalidEndpoint(){
        getArticleById.setGetArticleByIdInvalidEndpoint();
    }
    @When("I send GET article by id HTTP request with invalid endpoint")
    public void sendGetArticleByIdHTTPRequestWithInvalidEndpoint(){
        getArticleById.sendGetArticleByIdInvalidEndpoint();
    }
    @Then("I received GET article by id HTTP response code 404")
    public void receivedGetArticleByIdHTPPResponseCode404(){
        getArticleById.receivedGetArticleByIdResponseCode404();
    }

//    Invalid Id
    @Given("I set GET article by id invalid id")
    public void setGetArticleByIdInvalidId(){
        getArticleById.setGetArticleByIdInvalidId();
    }
    @When("I send GET article by id HTTP request with invalid id")
    public void sendGetArticleByIdHTTPRequestWithInvalidId(){
        getArticleById.sendGetArticleByIdInvalidId();
    }
    @Then("I received GET article by id HTTP response code 400")
    public void receivedGetArticleByIdResponseCode404(){
        getArticleById.receivedGetArticleByIdResponseCode400();
    }

//    Without Token
    @Given("I set GET article by id without token")
    public void setGetArticleByIdWithoutToken(){
        getArticleById.setGetArticleByIdValidEndpoint();
    }
    @When("I send GET article by id HTTP request without token")
    public void sendGetArticleByIdWithoutToken(){
        getArticleById.sendGetArticleByIdWithoutToken();
    }
    @Then("I received GET article by id HTTP response code 401")
    public void receivedGetArticleByIdResponseCode401(){
        getArticleById.receivedGetArticleByIdResponseCode401();
    }
}
