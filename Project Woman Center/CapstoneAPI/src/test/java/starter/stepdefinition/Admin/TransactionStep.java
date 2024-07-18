package starter.stepdefinition.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Admin.Transaction;

public class TransactionStep {
    @Steps
    Transaction transaction;
    @Given("I set Get all transaction endpoint")
    public void setGetTransaction(){transaction.setGetTransaction();}
    @When("I send GET all transaction Request")
    public void sendGetTransReq(){transaction.sendGetTransReq();}
    @Then("I success get all transaction and response code 200")
    public void successGetTransaction(){transaction.successGetTransaction();}
    @Given("I set invalid Get all transaction endpoint")
    public void setInvalidGetTransEnd(){transaction.setInvalidGetTransEnd();}
    @When("I send GET all transaction Request with invalid endpoint")
    public void sendReqInvEnd(){transaction.sendReqInvEnd();}
    @Then("I fail get all transaction and response code 404")
    public void failGetTransaction(){transaction.failGetTransaction();}
    @When("I send GET all transaction Request without token")
    public void sendGetReqWithoutToken(){transaction.sendGetReqWithoutToken();}
    @Then("I fail get all transaction and response code 401")
    public void failGetTrans401(){transaction.failGetTrans401();}
    @Given("I set PUT link endpoint")
    public void setPutLinkEnd(){transaction.setPutLinkEnd();}
    @When("I send PUT link Request")
    public void sendPutLinkReq(){transaction.sendPutLinkReq();}
    @Then("I success put link and response code 200")
    public void successPutLink(){transaction.successPutLink();}
    @When("I send PUT link Request with invalid transaction id")
    public void sendPutReqInvTransactionId(){transaction.sendPutReqInvTransactionId();}
    @Then("I fail put link and response code 400")
    public void failPutLink400(){transaction.failPutLink400();}
    @When("I send PUT link Request with link already sent")
    public void sendPutLinkAlreadySent(){transaction.sendPutLinkAlreadySent();}
    @When("I send PUT link Request without token")
    public void sendPutReqWithoutToken(){transaction.sendPutReqWithoutToken();}
    @Then("I fail put link and response code 401")
    public void failPutLink401(){transaction.failPutLink401();}
    @Given("I set PUT cancel endpoint")
    public void setPutCancelEnd(){transaction.setPutCancelEnd();}
    @When("I send PUT cancel Request")
    public void sendPutCancelReq(){transaction.sendPutCancelReq();}
    @Then("I success put cancel and response code 200")
    public void successPutCancel(){transaction.successPutCancel();}
    @When("I send PUT cancel Request with invalid transaction id")
    public void sendPutCancelInvTransactionId(){transaction.sendPutCancelInvTransactionId();}
    @Then("I fail put cancel and response code 500")
    public void failPutCancel500(){transaction.failPutCancel500();}
    @When("I send PUT cancel Request without token")
    public void senPutCancelReq(){transaction.senPutCancelReq();}
    @Then("I fail put cancel and response code 401")
    public void failPutCancel401(){transaction.failPutCancel401();}

}
