package starter.stepdefinition.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Admin.UpdateArticle;

public class UpdateArticleSteps {
    @Steps
    UpdateArticle updateArticle;

//    Valid Endpoint
    @Given("I set PUT update article valid endpoint")
    public void setPutUpdateArticleValidEndpoint(){
        updateArticle.setPutUpdateArticleWithValidEndpoint();
    }
    @When("I send PUT HTTP request for update article with valid endpoint")
    public void sendPutHTTPRequestForUpdateArticleWithValidEndpoint(){
        updateArticle.sendPutUpdateArticleWithValidEndpoint();
    }
    @Then("I received PUT update article HTTP response code 200")
    public void receivedPutUpdateArticleResponseCode200(){
        updateArticle.receivedPutUpdateArticleResponseCode200();
    }

//    Invalid Endpoint
    @Given("I set PUT update article invalid endpoint")
    public void setPutUpdateArticleInvalidEndpoint(){
        updateArticle.setPutUpdateArticleWithInvalidEndpoint();
    }
    @When("I send PUT HTTP request for update article with invalid endpoint")
    public void sendPutRequestForUpdateArticleWithValidEndpoint(){
        updateArticle.sendPutUpdateArticleWithInvalidEndpoint();
    }
    @Then("I received PUT update article HTTP response code 404")
    public void receivedPutUpdateArticleResponseCode404(){
        updateArticle.receivedPutUpdateArticleResponseCode404();
    }

//    Invalid Id
    @Given("I set PUT update article valid endpoint and invalid id")
    public void setUpdateArticleValidEndpointAndInvalidId(){
        updateArticle.setPutUpdateArticleWithInvalidId();
    }
    @When("I send PUT HTTP request for update article with invalid id")
    public void sendPutRequestForUpdateArticleWithValidInvalidId(){
        updateArticle.sendPutUpdateArticleWithInvalidId();
    }
    @Then("I received PUT update article HTTP response code 400")
    public void receivedUpdateArticleResponseCode400(){
        updateArticle.receivedPutUpdateArticleResponseCode400();
    }

//    WithoutToken
    @Given("I set PUT update article valid endpoint and without token")
    public void setPutUpdateArticleValidEndpointAndWithoutToken(){
        updateArticle.setPutUpdateArticleWithValidEndpoint();
    }
    @When("I send PUT HTTP request for update article without token")
    public void sendPutHTTPRequestForUpdateArticleWithoutToken(){
        updateArticle.sendPutUpdateArticleWithoutToken();
    }
    @Then("I received PUT update article HTTP response code 401")
    public void receivedPutUpdateArticleHTTPResponseCode401(){
        updateArticle.receivedPutUpdateArticleResponseCode401();
    }
}