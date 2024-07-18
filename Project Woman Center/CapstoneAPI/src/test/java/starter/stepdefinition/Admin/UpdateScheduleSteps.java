package starter.stepdefinition.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Admin.UpdateSchedule;

public class UpdateScheduleSteps {
    @Steps
    UpdateSchedule updateSchedule;

//    Valid Endpoint
    @Given("I set PUT update schedule valid endpoint")
    public void setPutUpdateScheduleValidEndpoint(){
        updateSchedule.setPutUpdateScheduleWithValidEndpoint();
    }
    @When("I send PUT HTTP request for update schedule with valid endpoint")
    public void sendPutHTTPRequestForUpdateScheduleWithValidEndpoint(){
        updateSchedule.sendPutUpdateScheduleWithValidEndpoint();
    }
    @Then("I received PUT HTTP response code 200")
    public void receivedPutHTTPResponseCode200(){
        updateSchedule.receivedPutUpdateCounselorDataResponseCode200();
    }

//    Invalid Endpoint
    @Given("I set PUT update schedule invalid endpoint")
    public void setPutUpdateScheduleInvalidEndpoint(){
        updateSchedule.setPutUpdateScheduleWithInvalidEndpoint();
    }
    @When("I send PUT HTTP request for update schedule with invalid endpoint")
    public void sendPutHTTPRequestForUpdateScheduleWithInvalidEndpoint(){
        updateSchedule.sendPutUpdateScheduleWithInvalidEndpoint();
    }
    @Then("I received PUT HTTP response code 404")
    public void receivedPutHTTPResponseCode404(){
        updateSchedule.receivedPutUpdateCounselorDataResponseCode404();
    }

//    Without Token
    @Given("I set PUT update schedule with endpoint")
    public void setUpdateScheduleWithEndpoint(){
        updateSchedule.setPutUpdateScheduleWithValidEndpoint();
    }
    @When("I send PUT HTTP request for update schedule without token")
    public void sendPutHTTPRequestFOrUpdateScheduleWithoutToken(){
        updateSchedule.sendPutUpdateScheduleWithoutToken();
    }
    @Then("I received HTTP response code 401")
    public void receivedHTTPResponseCode401(){
        updateSchedule.receivePutUpdateScheduleResponseCode401();
    }

//    Invalid Id
    @Given("I set PUT update schedule data valid endpoint")
    public void setPutUpdateScheduleDataValidEndpoint(){
        updateSchedule.setUpdateScheduleInvalidId();
    }
    @When("I send PUT HTTP request invalid id")
    public void sendPutHTTPRequestWithoutId(){
        updateSchedule.sendPutUpdateScheduleInvalidId();
    }
    @Then("I received Put HTTP response code 400")
    public void receivedPutHTTPResponseCode400(){
        updateSchedule.receivedPutUpdateCounselorDataResponseCode400();
    }
}
