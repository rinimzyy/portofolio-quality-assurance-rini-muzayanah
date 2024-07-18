package starter.stepdefinition.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Admin.Counselor;

public class CounselorSteps {
    @Steps
    Counselor counselor;

    @Given("I set GET all counselor with valid endpoint")
    public void setGetAllCounselorWithValidEndpoint(){counselor.setGetAllCounselorWithValidEndpoint();}
    @When("I send HTTP GET request with valid endpoint")
    public void sendReqValidEndpoint(){counselor.sendReqValidEndpoint();}
    @Then("I receive a valid HTTP response code 200 OK")
    public void HttpResponse200(){counselor.HttpResponse200();}

    @Given("I set GET all counselor with valid endpoint by page")
    public void setGetAllCounselorByPage(){counselor.setGetAllCounselorByPage();}
    @When("I send HTTP GET request with valid endpoint by page")
    public void sendReqValidEndpointByPage(){counselor.sendReqValidEndpointByPage();}
    @Then("I receive a valid HTTP by page response code 200 OK")
    public void HttpPageResponse200(){counselor.HttpPageResponse200();}

    @Given("I set GET all counselor with valid endpoint by limit")
    public void setGetAllCounselorByLimit(){counselor.setGetAllCounselorByLimit();}
    @When("I send HTTP GET request with valid endpoint by limit")
    public void sendReqValidEndpointByLimit(){counselor.sendReqValidEndpointByLimit();}
    @Then("I receive a valid HTTP by limit response code 200 OK")
    public void HttpLimitResponse200(){counselor.HttpLimitResponse200();}

    @Given("I set GET all counselor with valid endpoint by search")
    public void setGetAllCounselorBySearch(){counselor.setGetAllCounselorBySearch();}
    @When("I send HTTP GET request with valid endpoint by search")
    public void sendReqValidEndpointBySearch(){counselor.sendReqValidEndpointBySearch();}
    @Then("I receive a valid HTTP by search response code 200 OK")
    public void HttpSearchResponse200(){counselor.HttpSearchResponse200();}

    @Given("I set GET all counselor with valid endpoint based sort by")
    public void setGetAllCounselorSortBy(){counselor.setGetAllCounselorSortBy();}
    @When("I send HTTP GET request with valid endpoint based sort by")
    public void sendReqValidEndpointSortBy(){counselor.sendReqValidEndpointSortBy();}
    @Then("I receive a valid HTTP based sort by response code 200 OK")
    public void HttpSortByResponse200(){counselor.HttpSortByResponse200();}

    @Given("I set GET all counselor with valid endpoint by has schedule")
    public void setGetAllCounselorHasSchedule(){counselor.setGetAllCounselorHasSchedule();}
    @When("I send HTTP GET request with valid endpoint by has schedule")
    public void sendReqValidEndpointHasSchedule(){counselor.sendReqValidEndpointHasSchedule();}
    @Then("I receive a valid HTTP by has schedule response code 200 OK")
    public void HttpHasScheduleResponse200(){counselor.HttpHasScheduleResponse200();}

    @Given("I set GET all counselor with invalid endpoint")
    public void setGetAllCounselorWithInvalidEndpoint(){counselor.setGetAllCounselorWithInvalidEndpoint();}
    @When("I send HTTP GET request with invalid endpoint")
    public void sendReqInvalidEndpoint(){counselor.sendReqInvalidEndpoint();}
    @Then("I received HTTP response code 404 Not Found")
    public void HttpResponse404(){counselor.HttpResponse404();}

    @Given("I set GET valid endpoint by ID")
    public void setGetValidEndpointByID(){counselor.setGetValidEndpointByID();}
    @When("I send HTTP GET to the request with valid endpoint")
    public void sendIDReqValidEndpoint(){counselor.sendIDReqValidEndpoint();}
    @Then("I receive a HTTP response code 200 OK")
    public void IDHttpResponse200(){counselor.IDHttpResponse200();}

    @Given("I set GET counselor valid endpoint with invalid ID")
    public void setGetInvalidID(){counselor.setGetInvalidID();}
    @When("I send HTTP GET counselor to request with invalid ID")
    public void sendReqInvalidID(){counselor.sendReqInvalidID();}
    @Then("I receive HTTP response code is 404 Not Found")
    public void IDHttpResponse404(){counselor.IDHttpResponse404();}

    @Given("I set GET valid endpoint with empty ID")
    public void setGetEmptyID(){counselor.setGetEmptyID();}
    @When("I send HTTP GET to request with valid endpoint with empty ID")
    public void sendReqEmptyID(){counselor.sendReqEmptyID();}
    @Then("I receive a HTTP response code 400 Bad Request")
    public void HttpResponse400(){counselor.HttpResponse400();}
}
