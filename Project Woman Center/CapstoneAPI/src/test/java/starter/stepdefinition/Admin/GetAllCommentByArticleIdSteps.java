package starter.stepdefinition.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Admin.GetAllCommentByArticleId;

public class GetAllCommentByArticleIdSteps {
    @Steps
    GetAllCommentByArticleId getAllCommentByArticleId;

//    Valid Endpoint
    @Given("I set GET all comment by article id valid endpoint")
    public void setGetAllCommentByArticleIdValidEndpoint(){
        getAllCommentByArticleId.setGetAllCommentByArticleIdWithValidEndpoint();
    }
    @When("I send GET all comment by article id HTTP request with valid endpoint")
    public void sendGetAllCommentByArticleIdRewWithValidEndpoint(){
        getAllCommentByArticleId.sendGetAllCommentByArticleIdWithValidEndpoint();
    }
    @Then("I received GET all comment by article id HTTP response code 200")
    public void receivedGetAllCommentByArticleIdHTTPResponseCode200(){
        getAllCommentByArticleId.receivedGetAllCommentByArticleIdResponseCode200();
    }

//    Invalid Endpoint
    @Given("I set GET all comment by article id invalid endpoint")
    public void setGetAllCommentByArticleIdInvalidEndpoint(){
        getAllCommentByArticleId.setGetAllCommentByArticleIdWithInvalidEndpoint();
    }
    @When("I send GET all comment by article id HTTP request with invalid endpoint")
    public void sendGetAllCommentByArticleIdHTTPReqWithInvalidEndpoint(){
        getAllCommentByArticleId.sendGetAllCommentByArticleIdWithInvalidEndpoint();
    }
    @Then("I received GET all comment by article id HTTP response code 404")
    public void receivedGetAllCommentByArticleIdHTTPResponseCode404(){
        getAllCommentByArticleId.receivedGetAllCommentByArticleIdResponseCode404();
    }

//    Invalid Article Id
    @Given("I set GET all comment by article id invalid article id")
    public void setGetAllCommentByArticleIdInvalidId(){
        getAllCommentByArticleId.setGetAllCommentByArticleIdWithInvalidArticleId();
    }
    @When("I send GET all comment by article id HTTP request with invalid article id")
    public void sendGetAlCommentByArticleIdHTTPReqInvalidId(){
        getAllCommentByArticleId.sendGetAllCommentByArticleIdWithInvalidArticleId();
    }
    @Then("I received GET all comment by article id invalid id HTTP response code 404")
    public void receivedGetAllCommentByArticleIdInvalidIdResponseCOde404(){
        getAllCommentByArticleId.receivedGetAllCommentByArticleIdResponseCode404();
    }

//    Without Token
    @Given("I set GET all comment by article id without token")
    public void setGetAllCommentByArticleIdWithoutToken(){
        getAllCommentByArticleId.setGetAllCommentByArticleIdWithValidEndpoint();
    }
    @When("I send GET all comment by article id HTTP request without token")
    public void sendGetAllCommentByArticleIdHTTPReqWithoutToken(){
        getAllCommentByArticleId.sendGetAllCommentByArticleIdWithoutToken();
    }
    @Then("I received GET all comment by article id HTTP response code 401")
    public void receivedGetAllCommentByArticleIdHTTPResponseCode401(){
        getAllCommentByArticleId.receivedGetAllCommentByArticleIdResponseCode401();
    }
}
