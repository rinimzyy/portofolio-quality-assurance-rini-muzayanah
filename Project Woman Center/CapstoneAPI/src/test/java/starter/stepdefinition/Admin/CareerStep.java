package starter.stepdefinition.Admin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Admin.Career;

public class CareerStep {
    @Steps
    Career career;

    // View All Career
    @Given("I set career endpoint URL")
    public void setCareerEndpoint() {
        career.setCareerEndpoint();
    }
    @When("I send a get career request with valid auth")
    public void sendReq() {
        career.sendReq();
    }
    @Then("I successfully view all career")
    public void successViewAllCareer() {
        career.successViewAllCareer();
    }

    // View All Career With Wrong Method
    @Given("I set career endpoint")
    public void setCareerEndpoints() {
        career.setCareerEndpoint();
    }
    @When("I send a get career request with wrong method")
    public void sendPutReq() {
        career.sendReqInvalidMethod();
    }
    @Then("I fail to view all career and receive status code 404")
    public void failViewCareer404() {
        career.failViewCareer404();
    }

    // View All Career With Wrong Endpoint
    @Given("I set career wrong endpoint")
    public void setCareerWrongEndpoints() {
        career.setInvalidCareerEndpoint();
    }
    @When("I send a get career request with wrong endpoint")
    public void sendCareerReq() {
        career.sendReqInvalidEndpoint();
    }
    @Then("I receive status code 404")
    public void responseCode404() {
        career.failViewCareer404();
    }

    // View All Career With Wrong Token
    @Given("I set career valid endpoint")
    public void setCareerValidEndpoints() {
        career.setInvalidCareerEndpoint();
    }
    @When("I send a get career request with wrong token")
    public void sendCareerReqInvToken() {
        career.sendReqInvalidToken();
    }
    @Then("I receive status code 401")
    public void responseCode401() {
        career.failViewCareer401();
    }

    // career search
    @Given("I set search career based on {string} input endpoint")
    public void iSetSearchCareerBasedOnInputEndpoint(String search) {
        career.setSearchCareerEndpoint(search);
    }
    @When("I send search career {string} input request")
    public void iSendSearchCareerRequest(String search) {
        career.sendSearchCareerRequest(search);
    }

    @And("I receive status code {int}")
    public void iReceiveStatusCode(int successCode) {
        career.successResponse200(successCode);
    }

    // career delete
    @Given("I set delete career endpoint with {string}")
    public void iSetDeleteCareerEndpointWith(String uuid) {
        career.setDeleteCareerEndpoint(uuid);
    }

    @When("I send DELETE admin career request")
    public void iSendDELETEAdminCareerRequest() {
        career.sendDeleteCareerRequest();
    }

    @Then("I receive career delete status code {string}")
    public void iReceiveCareerDeleteStatusCode(String code) {
        int statusCode = Integer.parseInt(code);
        career.receiveResponseCode(statusCode);
    }

    // get career by id
    @Given("I set GET career valid endpoint by ID")
    public void setGetCareerValidEndpointByID(){career.setGetCareerValidEndpointByID();}
    @When("I send HTTP GET career to request with valid endpoint")
    public void sendIDReqCareerValidEndpoint(){career.sendIDReqCareerValidEndpoint();}
    @Then("I receive a HTTP career response code 200 OK")
    public void HttpCareerResponse200(){career.HttpCareerResponse200();}

    // get career invalid id
    @Given("I set GET career valid endpoint with invalid ID")
    public void setGetCareerInvalidID(){career.setGetCareerInvalidID();}
    @When("I send HTTP GET career to request with invalid ID")
    public void sendReqInvalidID(){career.sendReqInvalidID();}
    @Then("I receive a HTTP career response code 400 Not Found")
    public void HttpCareerResponse400(){career.HttpCareerResponse400();}

    // get career by id invalid token
    @Given("I set GET career by ID invalid token")
    public void setGetCareerInvalidToken(){career.setGetCareerInvalidToken();}
    @When("I send HTTP GET career to request with invalid token")
    public void sendGetReqInvalidToken(){career.sendGetReqInvalidToken();}
    @Then("I receive a HTTP career response code 401 Invalid Token")
    public void HttpCareerResponse401(){career.HttpCareerResponse401();}

    // update career
    @Given("I set PUT career valid endpoint")
    public void setPutCareerValidEndpoint(){career.setPutCareerValidEndpoint();}
    @When("I send HTTP PUT career to request with valid endpoint")
    public void sendPutReqCareerValidEndpoint(){career.sendPutReqCareerValidEndpoint();}
    @Then("I received HTTP career response code 200 OK")
    public void HttpPutCareerResponse200(){career.HttpPutCareerResponse200();}

    // update career invalid endpoint
    @Given("I set PUT career invalid endpoint")
    public void setPutCareerInvalidEndpoint(){career.setPutCareerInvalidEndpoint();}
    @When("I send HTTP PUT career to request with invalid endpoint")
    public void sendPutReqCareerInvalidEndpoint(){career.sendPutReqCareerInvalidEndpoint();}
    @Then("I received HTTP career response code 404 Not Found")
    public void HttpPutCareerResponse404(){career.HttpPutCareerResponse404();}

    // update career invalid id
    @Given("I set PUT career valid endpoint with invalid ID")
    public void setPutCareerInvalidID(){career.setPutCareerInvalidID();}
    @When("I send HTTP PUT career to request with invalid ID")
    public void sendPutReqCareerInvalidID(){career.sendPutReqCareerInvalidID();}
    @Then("I received HTTP career response code 400 Bad Request")
    public void HttpPutCareerResponse400(){career.HttpPutCareerResponse400();}

    // update career invalid token
    @Given("I set PUT career valid endpoint with invalid token")
    public void setPutCareerInvalidToken(){career.setPutCareerInvalidToken();}
    @When("I send HTTP PUT career to request with invalid token")
    public void sendPutReqCareerInvalidToken(){career.sendPutReqCareerInvalidToken();}
    @Then("I received HTTP career response code 401 Invalid Token")
    public void HttpPutCareerResponse401(){career.HttpPutCareerResponse401();}

}
