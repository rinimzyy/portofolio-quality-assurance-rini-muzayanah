package starter.fitur.User;

import com.google.gson.Gson;
import org.json.simple.JSONObject;
import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class Login {
    protected static String url = "https://13.210.163.192:8080";
    static String userToken;
    private Response response;

    public String setUserLoginEndpoint() {
        return url + "/login";
    }

    public void sendUserPostRequest(String username, String password) {
        JSONObject body = new JSONObject();
        body.put("username", username);
        body.put("password", password);

        RequestSpecification request = given().relaxedHTTPSValidation()
                .baseUri(setUserLoginEndpoint())
                .header("Content-Type", "application/json")
                .body(body.toJSONString());

        response = request.post();

        String data = request.when().post().then().extract().body().asString();
        Gson gson = new Gson();
        JSONObject jsonObject = gson.fromJson(data, JSONObject.class);
        String authData = (jsonObject.get("data").toString());
        JSONObject jsonAuth = gson.fromJson(authData, JSONObject.class);
        userToken = jsonAuth.get("token").toString();
        System.out.println(userToken);
    }

    public void verifySuccessUserLogin() {
        response.then().statusCode(200);
    }

    public void verifyFailedUserLogin() {
        response.then().statusCode(400);
    }
}
