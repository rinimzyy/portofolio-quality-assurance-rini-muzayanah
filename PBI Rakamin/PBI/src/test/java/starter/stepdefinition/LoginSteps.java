package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Web.Login;
import io.cucumber.datatable.DataTable;
import java.util.List;
import java.util.Map;

public class LoginSteps {
    @Steps
    Login login;

    // Successfully Login
    @Given("I am on the login page")
    public void onTheLoginPage(){
        login.openUrl("https://app.jubelio.com/login");
        login.logBtnAppear();
    }
    @When("I enter valid email and password")
    public void enterCredential(DataTable credentialsTable) {
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String email = row.get("Email");
            String password = row.get("Password");

            login.enterEmail(email);
            login.enterPassword(password);
        }
    }
    @And("I click login button")
    public void clickLoginButton(){
        login.ClickLoginButton();
    }
    @Then("I successfully login")
    public void onTheHomePage(){
        login.onDashboard();
    }

    // Fail to login because invalid credential
    @Given("I am on the homepage to login")
    public void onHomepageToLogin() {
        login.openUrl("https://app.jubelio.com/login");
        login.logBtnAppear();
    }
    @When("I enter the following credentials and click button login")
    public void enterInvalidCredentials(DataTable credentialsTable) {
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String email = row.get("Email");
            String password = row.get("Password");

            if (email != null && password != null){
                login.enterEmail(email);
                login.enterPassword(password);
                login.ClickLoginButton();
                login.failedLoginInvalidData();
                login.clearCredentials();
            }else if (email == null) {
                login.enterPassword(password);
                login.ClickLoginButton();
                login.failedLoginEmailEmpty();
                login.clearCredentials();
            } else if (password == null) {
                login.enterEmail(email);
                login.ClickLoginButton();
                login.failedLoginPasswordEmpty();
                login.clearCredentials();
            }
        }
    }
    @Then("I fail to login")
    public void failedLogin() {
    }
}
