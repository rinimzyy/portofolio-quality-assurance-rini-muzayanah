package starter.fitur.User;

import org.json.simple.JSONObject;
import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
public class Register {
    protected static String url = "https://13.210.163.192:8080";
    private Response response;

    public String setVerifyCredentialEndpoint() {
        return url + "/verify/unique";
    }

    public void sendVerifyCredentialRequest(String email, String username) {
        JSONObject body = new JSONObject();
        body.put("email", email);
        body.put("username", username);

        RequestSpecification request = given().relaxedHTTPSValidation()
                .baseUri(setVerifyCredentialEndpoint())
                .header("Content-Type", "application/json")
                .body(body.toJSONString());

        response = request.post();
    }

    public void receiveVerifyCredentialStatusCode(int statusCode) {
        response.then().statusCode(statusCode);
    }
}
