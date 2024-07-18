package starter.stepdefinition.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.User.Profile;

public class ProfileSteps {
    @Steps
    Profile profile;
    @Given("I set get user self data endpoint")
    public void setGetUserSelfDataEndpoint(){profile.setGetUserSelfDataEndpoint();}
    @When("I send GET HTTP Request")
    public void sendGetHttpRequest(){profile.sendGetHttpRequest();}
    @Then("I success get profile and response code 200")
    public void receiveHttpResCode(){profile.receiveHttpResCode();}
    @When("I send GET HTTP Request with invalid user token")
    public void iSendGETHTTPRequestWithInvalidUserToken() {profile.iSendGETHTTPRequestWithInvalidUserToken();}
    @Then("I fail get profile response code 401")
    public void iReceiveHTTPResponseCode401() {profile.iReceiveHTTPResponseCode401();}
    @Given("I set PUT update data profile endpoint")
    public void setPutUpdateProfileEnd(){profile.setPutUpdateProfileEnd();}
    @When("I send PUT HTTP Request")
    public void sendPutReq(){profile.sendPutReq();}
    @Then("I success update profile and response code 200")
    public void successUpdateProfile(){profile.successUpdateProfile();}
    @When("I send PUT HTTP Request with username already registered")
    public void sendPutUsernameRegistered(){profile.sendPutUsernameRegistered();}
    @Then("I receive HTTP response code 409")
    public void receiveResCode409(){profile.receiveResCode409();}
    @When("I send PUT HTTP Request with invalid token")
    public void sendPutReqInvToken(){profile.sendPutReqInvToken();}
    @Then("I fail update profile response code 401")
    public void failUpdateProfile401(){profile.failUpdateProfile401();}
    @Given("I set PUT update password endpoint")
    public void setUpdatePasswordEnd(){profile.setUpdatePasswordEnd();}
    @When("I send PUT update password HTTP Request")
    public void sendUpPwReq(){profile.sendUpPwReq();}
    @Then("I success update password response code 200")
    public void successUpPw(){profile.successUpPw();}
    @When("I send PUT update password HTTP Request with invalid current password")
    public void sendReqInvCurPass(){profile.sendReqInvCurPass();}
    @Then("I fail update password response code 400")
    public void failUpdatePassword400(){profile.failUpdatePassword400();}
    @When("I send PUT update password HTTP Request with invalid token")
    public void sendReqInvToken(){profile.sendReqInvToken();}
    @Then("I fail update password response code 401")
    public void failUpdatePassword401(){profile.failUpdatePassword401();}
    @When("I send PUT update password HTTP Request with current password empty value")
    public void sendReqEmptyValue(){profile.sendReqEmptyValue();}
    @Then("I fail update password response code 500")
    public void failUpdatePassword500(){profile.failUpdatePassword500();}
}
