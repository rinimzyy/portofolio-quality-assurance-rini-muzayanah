package starter.fitur.User;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Transaction {
    protected static String url = "https://13.210.163.192:8080";
    private String transactionUUID;

    // show
    public String setUserGetTransactionDetailEndpoint(String uuid) {
        transactionUUID = uuid;
        return url + "/users/transactions/" + uuid;
    }

    public void sendUserGetTransactionDetailRequest() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .auth().oauth2(Login.userToken)
                .get(setUserGetTransactionDetailEndpoint(transactionUUID));
    }

    public void verifyUserGetTransactionDetailResponseCode(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }
}
