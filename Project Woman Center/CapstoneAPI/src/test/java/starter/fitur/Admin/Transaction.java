package starter.fitur.Admin;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Transaction {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODcxNjYwMTZ9.JF9ZSJcND_hyzRPar5UqXPUHVPwHnD5UHJP6KZD5RUc";
    @Step("I set Get all transaction endpoint")
    public String setGetTransaction(){return url+"/admin/transactions";}
    @Step("I send GET all transaction Request")
    public void sendGetTransReq(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(token)
                .when()
                .get(setGetTransaction());
    }
    @Step("I success get all transaction and response code 200")
    public void successGetTransaction(){
        restAssuredThat(response -> response.body("meta.message", equalTo("success get all transaction")));
        restAssuredThat(response -> response.body("meta.status", equalTo(200)));
    }
    @Step("I set invalid Get all transaction endpoint")
    public String setInvalidGetTransEnd(){return url + "/ad/transactions";}
    @Step("I send GET all transaction Request with invalid endpoint")
    public void sendReqInvEnd(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(token)
                .when()
                .get(setInvalidGetTransEnd());
    }
    @Step("I fail get all transaction and response code 404")
    public void failGetTransaction(){restAssuredThat(response -> response.statusCode(404));}
    @Step("I send GET all transaction Request without token")
    public void sendGetReqWithoutToken(){
        SerenityRest.given().relaxedHTTPSValidation()
                .when()
                .get(setGetTransaction());
    }
    @Step("I fail get all transaction and response code 401")
    public void failGetTrans401(){restAssuredThat(response -> response.statusCode(401));}
    @Step("I set PUT link endpoint")
    public String setPutLinkEnd(){return url+"/admin/transactions/link";}
    @Step("I send PUT link Request")
    public void sendPutLinkReq(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("transaction_id", "768c4614-0de4-11ee-9061-0242c0a88003");
        requestBody.put("link", "https://consultationmentalhealthbatch1");

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody).auth().oauth2(token)
                .when()
                .put(setPutLinkEnd());
    }
    @Step("I success put link and response code 200")
    public void successPutLink(){restAssuredThat(response -> response.statusCode(200));}
    @Step("I send PUT link Request with invalid transaction id")
    public void sendPutReqInvTransactionId(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("transaction_id", "768c4614");
        requestBody.put("link", "https://consultationmentalhealthbatch1");

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody).auth().oauth2(token)
                .when()
                .put(setPutLinkEnd());
    }
    @Step("I fail put link and response code 400")
    public void failPutLink400(){
        restAssuredThat(response -> response.body("meta.message", equalTo("transaction not found/link already sent")));
        restAssuredThat(response -> response.body("meta.status", equalTo(400)));
    }
    @Step("I send PUT link Request with link already sent")
    public void sendPutLinkAlreadySent(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("transaction_id", "768c4614-0de4-11ee-9061-0242c0a88003");
        requestBody.put("link", "https://consultationmentalhealthbatch1");

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody).auth().oauth2(token)
                .when()
                .put(setPutLinkEnd());
    }
    @Step("I send PUT link Request without token")
    public void sendPutReqWithoutToken(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("transaction_id", "768c4614-0de4-11ee-9061-0242c0a88003");
        requestBody.put("link", "https://consultationmentalhealthbatch2");

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody)
                .when()
                .put(setPutLinkEnd());
    }
    @Step("I fail put link and response code 401")
    public void failPutLink401(){restAssuredThat(response -> response.statusCode(401));}
    @Step("I set PUT cancel endpoint")
    public String setPutCancelEnd(){return url+"/admin/transactions/cancel";}
    @Step("I send PUT cancel Request")
    public void sendPutCancelReq(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("transaction_id", "768c4614-0de4-11ee-9061-0242c0a88003");

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody).auth().oauth2(token)
                .when()
                .put(setPutCancelEnd());
    }
    @Step("I success put cancel and response code 200")
    public void successPutCancel(){restAssuredThat(response -> response.statusCode(200));}
    @Step("I send PUT cancel Request with invalid transaction id")
    public void sendPutCancelInvTransactionId(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("transaction_id", "768c4614");

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody).auth().oauth2(token)
                .when()
                .put(setPutCancelEnd());
    }
    @Step("I fail put cancel and response code 500")
    public void failPutCancel500(){
        restAssuredThat(response -> response.body("meta.message", equalTo("record not found")));
        restAssuredThat(response -> response.body("meta.status", equalTo(500)));
    }
    @Step("I send PUT cancel Request without token")
    public void senPutCancelReq(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("transaction_id", "768c4614-0de4-11ee-9061-0242c0a88003");

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody)
                .when()
                .put(setPutCancelEnd());
    }
    @Step("I fail put cancel and response code 401")
    public void failPutCancel401(){restAssuredThat(response -> response.statusCode(401));}
}