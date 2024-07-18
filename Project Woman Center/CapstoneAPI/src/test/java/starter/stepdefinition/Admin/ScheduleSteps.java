package starter.stepdefinition.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Admin.Schedule;

public class ScheduleSteps {
    @Steps
    Schedule schedule;
    @Given("I set get counselor schedule endpoint")
    public void setGetScheduleEnd(){schedule.setGetScheduleEnd();}
    @When("I send Request with method GET")
    public void sendReq(){schedule.sendReq();}
    @Then("I success get counselor schedule")
    public void successGetSchedule(){schedule.successGetSchedule();}
    @When("I send Request with method GET with invalid token")
    public void sendReqInvToken(){schedule.sendReqInvToken();}
    @Then("I failed get counselor schedule and response code 401")
    public void resCode401(){schedule.resCode401();}
    @When("I send Request with method GET with invalid id")
    public void sendRewInvId(){schedule.sendRewInvId();}
    @Then("I failed get counselor schedule and response code 400")
    public void resCode400(){schedule.resCode400();}
    @Given("I set invalid get counselor schedule endpoint")
    public void setInvEnd(){schedule.setInvEnd();}
    @When("I send Request with method GET with invalid endpoint")
    public void sendReqInvEnd(){schedule.sendReqInvEnd();}
    @Then("I failed get counselor schedule and response code 404")
    public void resCode404(){schedule.resCode404();}
    @Given("I set post counselor schedule endpoint")
    public void setPostCounselorScheduleEnd(){schedule.setPostCounselorScheduleEnd();}
    @When("I send POST HTTP Request")
    public void sendPostReq(){schedule.sendPostReq();}
    @Then("I success post counselor schedule")
    public void success(){schedule.success();}
    @When("I send POST HTTP Request with invalid token")
    public void invalidToken(){schedule.invalidToken();}
    @Then("I failed post counselor schedule and response code 401")
    public void code401(){schedule.code401();}
    @When("I send POST HTTP Request with invalid id")
    public void invalidId(){schedule.invalidId();}
    @Then("I failed post counselor schedule and response code 400")
    public void code400(){schedule.code400();}
    @When("I send POST HTTP Request with invalid body parameter")
    public void invalidBodyParameter(){schedule.invalidBodyParameter();}
    @When("I send POST HTTP Request with empty dates")
    public void emptyDates(){schedule.emptyDates();}
    @When("I send POST HTTP Request with empty body")
    public void emptyBody(){schedule.emptyBody();}
}
