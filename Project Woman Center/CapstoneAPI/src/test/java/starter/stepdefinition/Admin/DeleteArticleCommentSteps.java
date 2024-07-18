package starter.stepdefinition.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Admin.DeleteArticleComment;

public class DeleteArticleCommentSteps {
    @Steps
    DeleteArticleComment deleteArticleComment;

//    Valid Endpoint
    @Given("I set delete article comment Valid endpoint")
    public void setDeleteArticleCommentValidEndpoint(){
        deleteArticleComment.setDeleteArticleCommentWithValidEndpoint();
    }
    @When("I send delete article comment HTTP request with Valid endpoint")
    public void sendDeleteArticleCommentReqWithValidEndpoint(){
        deleteArticleComment.sendReqDeleteArticleCommentWithValidEndpoint();
    }
    @Then("I received delete article comment HTTP response code")
    public void receivedDeleteArticleCommentHTTPResponseCode(){
        deleteArticleComment.receivedDeleteArticleCommentResponseCode();
    }

//    Invalid Endpoint
    @Given("I set delete article comment invalid endpoint")
    public void setDeleteArticleCommentInvalidEndpoint(){
        deleteArticleComment.setDeleteArticleCommentWithInvalidEndpoint();
    }
    @When("I send delete article comment HTTP request with invalid endpoint")
    public void sendDeleteArticleCommentReqWithInvalidEndpoint(){
        deleteArticleComment.sendReqDeleteArticleCommentWithInvalidEndpoint();
    }
    @Then("I received delete article comment HTTP response code 404")
    public void receivedDeleteArticleCommentResponseCode404(){
        deleteArticleComment.receivedDeleteArticleCommentResponseCode404();
    }

//    Invalid Id Article/Id Comment
    @Given("I set delete article comment invalid id article")
    public void setDeleteArticleCommentInvalidId(){
        deleteArticleComment.setDeleteArticleCommentWithInvalidIdArticle();
    }
    @When("I send delete article comment HTTP request with invalid id article")
    public void sendDeleteArticleCommentReqWithInvalidId(){
        deleteArticleComment.sendReqDeleteArticleCommentWithInvalidIdArticle();
    }
    @Then("I received delete article comment invalid id HTTP response code 404")
    public void receivedDeleteArticleCommentInvalidIdResponseCode404(){
        deleteArticleComment.receivedDeleteArticleCommentResponseCode404();
    }

//    Without Token
    @Given("I set delete article comment without token")
    public void setDeleteArticleCommentWithoutToken(){
        deleteArticleComment.setDeleteArticleCommentWithValidEndpoint();
    }
    @When("I send delete article comment HTTP request without token")
    public void sendDeleteArticleCommentReqWithoutToken(){
        deleteArticleComment.sendReqDeleteArticleCommentWithoutToken();
    }
    @Then("I received delete article comment HTTP response code 401")
    public void receivedDeleteArticleCommentResponseCode401(){
        deleteArticleComment.receivedDeleteArticleCommentResponseCode401();
    }
}
