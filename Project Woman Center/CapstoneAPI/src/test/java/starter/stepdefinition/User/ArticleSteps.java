package starter.stepdefinition.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.User.Article;

public class ArticleSteps {
    @Steps
    Article article;
    @Given("I set Get articles non login endpoint")
    public void setGetArticleEndpoint(){article.setGetArticleEndpoint();}
    @When("I send GET articles Request")
    public void sendGetArticleReq(){article.sendGetArticleReq();}
    @Then("I success get articles and response code 200")
    public void successGetArticle(){article.successGetArticle();}
    @Given("I set invalid Get articles non login endpoint")
    public void setInvalidGetArticleEndpoint(){article.setInvalidGetArticleEndpoint();}
    @When("I send GET articles Request with invalid endpoint")
    public void sendGetArtcleRequest(){article.sendGetArtcleRequest();}
    @Then("I failed get articles and response code 404")
    public void failedGetArticle(){article.failedGetArticle();}
    @Given("I set create comment endpoint")
    public void setCreateComment(){article.setCreateComment();}
    @When("I send POST comment Request")
    public void sendPostComment(){article.sendPostComment();}
    @Then("I success create comment and response code 200")
    public void successCreateComment(){article.successCreateComment();}
    @When("I send POST comment Request with invalid id")
    public void sendPostCommentInvId(){article.sendPostCommentInvId();}
    @Then("I failed create comment and message article not found")
    public void messageARtcleNotFound(){article.messageARtcleNotFound();}
    @When("I send POST comment Request without body value")
    public void sendWithoutBodyValue(){article.sendWithoutBodyValue();}
    @Then("I failed create comment and message all field are required")
    public void messageAllFieldsAreRequired(){article.messageAllFieldsAreRequired();}
    @When("I send POST comment Request without token")
    public void sendReqWithoutToken(){article.sendReqWithoutToken();}
    @Then("I failed create comment and message invalid token")
    public void messageInvalidToken(){article.messageInvalidToken();}
    @Given("I set Get all comment endpoint")
    public void setAllCommentEnd(){article.setAllCommentEnd();}
    @When("I send GET all comment Request")
    public void getAllCommentReq(){article.getAllCommentReq();}
    @Then("I success get all comment and response code 200")
    public void successGetAllComment(){article.successGetAllComment();}
    @When("I send GET all comment Request with invalid article id")
    public void sendGetReqInvArticleId(){article.sendGetReqInvArticleId();}
    @Then("I failed get all comment and response code 404")
    public void failedCode404(){article.failedCode404();}
    @When("I send GET all comment Request without token")
    public void senReqWithoutToken(){article.senReqWithoutToken();}
    @Then("I failed get all comment and response code 401")
    public void failedCode401(){article.failedCode401();}
    @Given("I set delete comment endpoint")
    public void setDeleteComEnd(){article.setDeleteComEnd();}
    @When("I send DELETE comment Request")
    public void sendDelReq(){article.sendDelReq();}
    @Then("I success delete comment and response code 200")
    public void successDelCom(){article.successDelCom();}
    @When("I send DELETE comment Request with invalid article id")
    public void senDelReqInvArticleId(){article.senDelReqInvArticleId();}
    @Then("I fail delete comment and response code 404")
    public void failDel404(){article.failDel404();}
    @When("I send DELETE comment Request with invalid comment id")
    public void sendDelReqInvComId(){article.sendDelReqInvComId();}
    @When("I send DELETE comment Request without token")
    public void sendDelComWithoutToken(){article.sendDelComWithoutToken();}
    @Then("I fail delete comment and response code 401")
    public void failDel401(){article.failDel401();}

    @Given("I set user get article endpoint with {string}")
    public void iSetUserGetArticleEndpointWith(String uuid) {
        article.setUserGetArticleEndpoint(uuid);
    }

    @When("I send GET user get article request")
    public void iSendGETUserGetArticleRequest() {
        article.sendUserGetArticleRequest();
    }

    @Then("I receive user get article status code response {string}")
    public void iReceiveUserGetArticleStatusCodeResponse(String code) {
        int statusCode = Integer.parseInt(code);
        article.verifyUserArticleResponseCode(statusCode);
    }
}
