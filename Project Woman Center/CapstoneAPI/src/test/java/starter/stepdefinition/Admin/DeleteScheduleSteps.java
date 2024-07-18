package starter.stepdefinition.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Admin.DeleteSchedule;

public class DeleteScheduleSteps {
    @Steps
    DeleteSchedule deleteSchedule;

//    Valid Endpoint
    @Given("I set delete schedule valid endpoint")
    public void setDeleteScheduleValidEndpoint(){
        deleteSchedule.setDeleteScheduleWithValidEndpoint();
    }
    @When("I send delete schedule HTTP request with valid endpoint")
    public void sendDeleteScheduleHTTPRequestWithValidEndpoint(){
        deleteSchedule.sendDeleteScheduleValidEndpoint();
    }
    @Then("I received valid Delete schedule HTTP response code 200")
    public void receivedDeleteScheduleHTTPResponseCode200(){
        deleteSchedule.receivedDeleteResponseCode200();
    }

//    Invalid endpoint
    @Given("I set delete schedule invalid endpoint")
    public void setUpdateScheduleInvalidEndpoint(){
        deleteSchedule.setDeleteScheduleWithInvalidEndpoint();
    }
    @When("I send delete HTTP request for update schedule with invalid endpoint")
    public void sendDeleteHTTPRequestForUpdateScheduleWithInvalidEndpoint(){
        deleteSchedule.sendDeleteScheduleWithInvalidEndpoint();
    }
    @Then("I received delete schedule HTTP response code 404")
    public void receivedDeleteScheduleHTTPResponseCode404(){
        deleteSchedule.receivedDeleteScheduleResponseCode404();
    }

//    Invalid Id
    @Given("I set delete schedule with endpoint and invalid id")
    public void setDeleteScheduleWithEndpointAndInvalidId(){
        deleteSchedule.setDeleteScheduleWithEndpointAndInvalidId();
    }
    @When("I send delete HTTP request with invalid id")
    public void sendDeleteHTTPRequestWithInvalidId(){
        deleteSchedule.sendDeleteScheduleWithInvalidEndpointAndInvalidId();
    }
    @Then("I received response code 400")
    public void receivedResponseCode400(){
        deleteSchedule.receivedDeleteScheduleResponseCode400();
    }

//    Without Token
    @Given("I set delete schedule with endpoint")
    public void setDeleteScheduleWithEndpoint(){
        deleteSchedule.setDeleteScheduleWithoutToken();
    }
    @When("I send delete HTTP request without token")
    public void setDeleteHTTPRequestWithoutToken(){
        deleteSchedule.sendDeleteScheduleWithoutToken();
    }
    @Then("I received response code 401")
    public void receivedResponseCode401(){
        deleteSchedule.receivedDeleteScheduleResponseCode401();
    }
}
