package starter.stepdefinition.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.User.Forum;

public class ForumSteps {
    @Steps
    Forum forum;
    @Given("I set create forum endpoint")
    public void setCreateForumEnd(){forum.setCreateForumEnd();}
    @When("I send POST create forum Request")
    public void sendPostCreateForumReq(){forum.sendPostCreateForumReq();}
    @Then("I success create forum and response code 200")
    public void successCreateForum(){forum.successCreateForum();}
    @When("I send POST create forum Request with empty category id")
    public void sendReqEmptyCategoryId(){forum.sendReqEmptyCategoryId();}
    @Then("I fail create forum and message category is required")
    public void messageCategoryisRequired(){forum.messageCategoryisRequired();}
    @When("I send POST create forum Request with empty link")
    public void sendReqEmptyLink(){forum.sendReqEmptyLink();}
    @Then("I fail create forum and message link is required")
    public void messageLinkIsRequired(){forum.messageLinkIsRequired();}
    @When("I send POST create forum Request with empty topic")
    public void sendReqEmptyTopic(){forum.sendReqEmptyTopic();}
    @Then("I fail create forum and message topic are required")
    public void messageTopicAreRequired(){forum.messageTopicAreRequired();}
    @When("I send POST crete forum Request with invalid token")
    public void sendPostReqInvalidToken(){forum.sendPostReqInvalidToken();;}
    @Then("I fail create forum and message invalid token")
    public void failCreateForum(){forum.failCreateForum();}
    @Given("I set get all forum endpoint")
    public void setGetAllForumEnd(){forum.setGetAllForumEnd();}
    @When("I send GET all forum Request")
    public void sendGetReq(){forum.sendGetReq();}
    @Then("I success get all forum and response code 200")
    public void successGetAllForum(){forum.successGetAllForum();}
    @When("I send GET all forum Request with invalid token")
    public void sendReqInvalidToken(){forum.sendReqInvalidToken();}
    @Then("I fail get all forum and message invalid token")
    public void messageInvalidToken(){forum.messageInvalidToken();}
}
