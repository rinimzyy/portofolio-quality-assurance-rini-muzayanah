package starter.fitur.Admin;

import com.google.gson.Gson;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.Assert;
import static io.restassured.RestAssured.given;

public class Login {
    protected static String url = "https://13.210.163.192:8080";
    static String adminToken;

    private String username;
    private String password;
    private Response response;

    public String setLoginEndpoint() {
        return url + "/admin/login";
    }

    public void sendPostRequest(String username, String password) {
        this.username = username;
        this.password = password;

        JSONObject body = new JSONObject();
        body.put("username", username);
        body.put("password", password);

        RequestSpecification request = given().relaxedHTTPSValidation()
                .baseUri(setLoginEndpoint())
                .header("Content-Type", "application/json")
                .body(body.toJSONString());

        response = request.post();

        String data = request.when().post().then().extract().body().asString();
        Gson gson = new Gson();
        JSONObject jsonObject = gson.fromJson(data, JSONObject.class);
        String authData = (jsonObject.get("data").toString());
        JSONObject jsonAuth = gson.fromJson(authData, JSONObject.class);
        adminToken = jsonAuth.get("token").toString();
    }

    public void sendPostWrongMethod(String username, String password) {
        this.username = username;
        this.password = password;

        JSONObject body = new JSONObject();
        body.put("username", username);
        body.put("password", password);

        RequestSpecification request = given().relaxedHTTPSValidation()
                .baseUri(setLoginEndpoint())
                .header("Content-Type", "application/json")
                .body(body.toJSONString());

        response = request.get();
    }

    public void verifyResponse() {
        response.then().statusCode(200);
        String token = response.then().extract().path("token");
        Assert.assertNotNull(token, "Token Not Null");
    }

    public void verifyResponseFail() {
        response.then().statusCode(400);
    }
    public void verifyResponse401() {
        response.then().statusCode(401);
    }
}
