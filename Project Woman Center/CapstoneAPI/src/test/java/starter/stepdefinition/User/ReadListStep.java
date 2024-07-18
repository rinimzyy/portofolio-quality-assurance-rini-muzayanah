package starter.stepdefinition.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.User.ReadList;

public class ReadListStep {
    @Steps
    ReadList readList;

    // Create reading list
    @Given("I set reading list endpoint server")
    public void setReadListEndpointUrl() {
        readList.setReadListEndpoint();
    }
    @When("I send reading list POST request with {string} and {string}")
    public void sendPostRequest(String name, String description) {
        readList.sendPostRequest(name, description);
    }
    @Then("I success create reading list and receive response 200")
    public void fail404() {
        readList.success();
    }

    // Create reading list invalid endpoint
    @Given("I set create reading list endpoint server")
    public void setCreateReadListEndpointUrl() {
        readList.setReadListInvEndpoint();
    }
    @When("I send reading list POST request with {string} and {string} with invalid endpoint")
    public void sendPostRequestInvEnd(String name, String description) {
        readList.sendPostRequestInvEnd(name, description);
    }
    @Then("I fail create reading list and receive response 404")
    public void verifyResponse() {
        readList.failCreateReadList404();
    }

    // Create reading list invalid token
    @Given("I set reading list endpoint")
    public void setLoginEndpoint() {
        readList.setReadListEndpoint();
    }
    @When("I send reading list POST request with {string} and {string} with invalid token")
    public void sendPostRequestInvToken(String name, String description) {
        readList.sendPostRequestInvToken(name, description);
    }
    @Then("I fail create reading list and receive response 401")
    public void fail401() {
        readList.failCreateReadList401();
    }

    // Create reading list empty data
    @Given("I set reading list endpoint url server")
    public void setLoginEndpointUrlServer() {
        readList.setReadListEndpoint();
    }
    @When("I send reading list POST request with {string} and {string} with empty field")
    public void sendPostRequestInvData(String name, String description) {
        readList.sendPostRequest(name, description);
    }
    @Then("I fail create reading list and receive response 400")
    public void fail400() {
        readList.failCreateReadList400();
    }

    // Get all reading list user
    @Given("I set reading list endpoints")
    public void setLoginEndpoints() {
        readList.setReadListEndpoint();
    }
    @When("I send reading list GET request")
    public void sendGetRequest() {
        readList.sendGetRequest();
    }
    @Then("I success get user reading list")
    public void successGetReadList() {
        readList.successGet();
    }

    // Get all reading list user invalid token
    @Given("I set reading list endpoints url")
    public void setLoginEndpointsUrl() {
        readList.setReadListEndpoint();
    }
    @When("I send reading list GET request with invalid token")
    public void sendGetRequestInvToken() {
        readList.sendGetRequestInvToken();
    }
    @Then("I fail get user reading list 401")
    public void failGetReadList() {
        readList.failGet();
    }

    // Add article to reading list
    @Given("I set reading list endpoints server")
    public void setSaveToReadListEndpointUrl() {
        readList.setSaveToReadListEndpoint();
    }
    @When("I send add to reading list POST request with {string} and {string}")
    public void sendPostRequestWIthData(String article_id, String reading_list_id) {
        readList.sendSavePostRequest(article_id, reading_list_id);
    }
    @Then("I receive valid response add article")
    public void response() {
        readList.response200();
    }

    // Add article to reading list invalid token
    @Given("I set reading list endpoints server url")
    public void setSaveToReadListEndpointServerUrl() {
        readList.setSaveToReadListEndpoint();
    }
    @When("I send add to reading list POST request with {string} and {string} with invalid token")
    public void sendSavePostRequestInvToken(String article_id, String reading_list_id) {
        readList.sendSavePostRequestInvToken(article_id, reading_list_id);
    }
    @Then("I receive valid response add article 401")
    public void response401() {
        readList.response401();
    }

    // Add article to reading list empty data
    @Given("I set reading list endpoint server url")
    public void setSaveToReadListEndpointsServerUrl() {
        readList.setSaveToReadListEndpoint();
    }
    @When("I send add to reading list POST request with {string} and {string} with empty data")
    public void sendSavePostRequestInvEmptyData(String article_id, String reading_list_id) {
        readList.sendSavePostRequest(article_id, reading_list_id);
    }
    @Then("I receive valid response add article 400")
    public void response400() {
        readList.response400();
    }

    // get reading list by id
    @Given("I set GET reading list by ID with valid endpoint")
    public void setGetReadingListByID(){readList.setGetReadingListByID();}
    @When("I send HTTP GET reading list request with valid endpoint")
    public void sendReqReadingList(){readList.sendReqReadingList();}
    @Then("I receive a valid HTTP reading list response code 200 OK")
    public void HttpReadingListResponse200(){readList.HttpReadingListResponse200();}

    // get reading list by id invalid endpoint
    @Given("I set GET reading list by ID with invalid endpoint")
    public void setGetReadingListInvalidEndpoint(){readList.setGetReadingListInvalidEndpoint();}
    @When("I send HTTP GET reading list request with invalid endpoint")
    public void sendReqReadingListInvalidEndpoint(){readList.sendReqReadingListInvalidEndpoint();}
    @Then("I receive a valid HTTP reading list response code 404 Not Found")
    public void HttpReadingListResponse404(){readList.HttpReadingListResponse404();}

    // get reading list invalid id
    @Given("I set GET reading list invalid ID with valid endpoint")
    public void setGetReadingListInvalidID(){readList.setGetReadingListInvalidID();}
    @When("I send HTTP GET reading list request with invalid ID")
    public void sendReqReadingListInvalidID(){readList.sendReqReadingListInvalidID();}
    @Then("I receive a valid HTTP reading list response code 400")
    public void HttpReadingListResponse400(){readList.HttpReadingListResponse400();}

    // get reading list by id invalid token
    @Given("I set GET reading list by ID with valid endpoint but invalid token")
    public void setGetReadingListInvalidToken(){readList.setGetReadingListInvalidToken();}
    @When("I send HTTP GET reading list request with invalid token")
    public void sendReqReadingListInvalidToken(){readList.sendReqReadingListInvalidToken();}
    @Then("I receive a valid HTTP reading list response code 401 Invalid Token")
    public void HttpReadingListResponse401(){readList.HttpReadingListResponse401();}

    // update reading list
    @Given("I set PUT reading list with valid endpoint")
    public void setPutReadingList(){readList.setPutReadingList();}
    @When("I send HTTP PUT reading list request with valid endpoint")
    public void sendPutReqReadingList(){readList.sendPutReqReadingList();}
    @Then("I receive a valid HTTP update reading list response code 200 OK")
    public void HttpPutReadingListResponse200(){readList.HttpPutReadingListResponse200();}

    // update reading list invalid endpoint
    @Given("I set PUT reading list with invalid endpoint")
    public void setPutReadingListInvalidEndpoint(){readList.setPutReadingListInvalidEndpoint();}
    @When("I send HTTP PUT reading list request with invalid endpoint")
    public void sendPutReqReadingListInvalidEndpoint(){readList.sendPutReqReadingListInvalidEndpoint();}
    @Then("I receive a valid HTTP update reading list response code 404")
    public void HttpPutReadingListResponse404(){readList.HttpPutReadingListResponse404();}

    // update reading list invalid id
    @Given("I set PUT reading list with invalid ID")
    public void setPutReadingListInvalidID(){readList.setPutReadingListInvalidID();}
    @When("I send HTTP PUT reading list request with invalid ID")
    public void sendPutReqReadingListInvalidID(){readList.sendPutReqReadingListInvalidID();}
    @Then("I receive a valid HTTP update reading list response code 400")
    public void HttpPutReadingListResponse400(){readList.HttpPutReadingListResponse400();}

    // update reading list invalid token
    @Given("I set PUT reading list with invalid token")
    public void setPutReadingListInvalidToken(){readList.setPutReadingListInvalidToken();}
    @When("I send HTTP PUT reading list request with invalid token")
    public void sendPutReqReadingListInvalidToken(){readList.sendPutReqReadingListInvalidToken();}
    @Then("I receive a valid HTTP update reading list response code 401")
    public void HttpPutReadingListResponse401(){readList.HttpPutReadingListResponse401();}

    // delete reading list
    @Given("I set DELETE reading list with valid endpoint")
    public void setDeleteReadingList(){readList.setDeleteReadingList();}
    @When("I send HTTP DELETE reading list request with valid endpoint")
    public void sendDeleteReqReadingList(){readList.sendDeleteReqReadingList();}
    @Then("I receive a valid HTTP delete reading list response code 200 OK")
    public void HttpDeleteReadingListResponse200(){readList.HttpDeleteReadingListResponse200();}

    // delete reading list invalid endpoint
    @Given("I set DELETE reading list with invalid endpoint")
    public void setDeleteReadingListInvalidEndpoint(){readList.setDeleteReadingListInvalidEndpoint();}
    @When("I send HTTP DELETE reading list request with invalid endpoint")
    public void sendDeleteReqReadingListInvalidEndpoint(){readList.sendDeleteReqReadingListInvalidEndpoint();}
    @Then("I receive a valid HTTP delete reading list response code 404")
    public void HttpDeleteReadingListResponse404(){readList.HttpDeleteReadingListResponse404();}

    // delete reading list invalid id
    @Given("I set DELETE reading list with invalid ID")
    public void setDeleteReadingListInvalidID(){readList.setDeleteReadingListInvalidID();}
    @When("I send HTTP DELETE reading list request with invalid ID")
    public void sendDeleteReqReadingListInvalidID(){readList.sendDeleteReqReadingListInvalidID();}
    @Then("I receive a valid HTTP delete reading list response code 400")
    public void HttpDeleteReadingListResponse400(){readList.HttpDeleteReadingListResponse400();}

    // delete reading list invalid token
    @Given("I set DELETE reading list with invalid token")
    public void setDeleteReadingListInvalidToken(){readList.setDeleteReadingListInvalidToken();}
    @When("I send HTTP DELETE reading list request with invalid token")
    public void sendDeleteReqReadingListInvalidToken(){readList.sendDeleteReqReadingListInvalidToken();}
    @Then("I receive a valid HTTP delete reading list response code 401")
    public void HttpDeleteReadingListResponse401(){readList.HttpDeleteReadingListResponse401();}

}
