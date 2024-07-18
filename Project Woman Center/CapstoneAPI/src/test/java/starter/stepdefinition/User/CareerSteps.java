package starter.stepdefinition.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.User.Career;

public class CareerSteps {
    @Steps
    Career career;
    @Given("I set get all career information endpoint")
    public void setGetAllCareerEndpoint(){career.setGetAllCareerEndpoint();}
    @When("I send GET Request")
    public void sendGetRequest(){career.sendGetRequest();}
    @Then("I receives HTTP response code 200")
    public void receivesResCode200(){career.receivesResCode200();}
    @When("I send POST Requests")
    public void sendPostReq(){career.sendPostReq();}
    @Then("I receives HTTP response code 401")
    public void receivesResCode401(){career.receivesResCode401();}
    @Given("I set get career information by id endpoint")
    public void setGetCareerById(){career.setGetCareerById();}
    @When("I send Request method GET")
    public void sendReqMethodGet(){career.sendReqMethodGet();}
    @Then("I receives HTTP response code is 200")
    public void codeIs200(){career.codeIs200();}
    @Given("I set invalid get career information by id endpoint")
    public void setInvalidGetCareerEndpoint(){career.setInvalidGetCareerEndpoint();}
    @When("I send Request method GET with invalid endpoint")
    public void sendReqWithInvalidEndpoint(){career.sendReqWithInvalidEndpoint();}
    @Then("I receives HTTP response code is 404")
    public void codeIs404(){career.codeIs404();}
    @When("I send Request method GET with invalid user token")
    public void sendReqWithInvToken(){career.sendReqWithInvToken();}
    @When("I send Request method GET with invalid id")
    public void sendReqInvId(){career.sendReqInvId();}
    @Then("I receives HTTP response code is 400")
    public void receiveResCode400(){career.receiveResCode400();}
    @When("I send Request with method POST")
    public void sendReqPost(){career.sendReqPost();}
}
