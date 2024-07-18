package starter.fitur.User;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Profile {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjE4NDA2MDQxLTBmZTktMTFlZS1hMDVhLTAyNDJhYzE3MDAwMyIsImVtYWlsIjoiYXpoemFhNkBnbWFpbC5jb20iLCJ1c2VybmFtZSI6InBlb3BsZTEiLCJhdXRoX2J5IjoiYXV0aCIsImV4cCI6MTY4NzU3OTY5Mn0.fGsi-SvVsl9C6NQ2k-ypsesC1NTN1QNhZDcKqYE7xyw";
    @Step("I set get user self data endpoint")
    public String setGetUserSelfDataEndpoint(){return url + "/users/profile";}
    @Step("I send GET HTTP Request")
    public void sendGetHttpRequest(){
        SerenityRest.given().auth().oauth2(token).relaxedHTTPSValidation()
                .when()
                .get(setGetUserSelfDataEndpoint());
    }
    @Step("I success get profile and response code 200")
    public void receiveHttpResCode(){
        restAssuredThat(response -> response.body("meta.message", equalTo("success get profile")));
        restAssuredThat(response -> response.body("meta.status", equalTo(200)));
    }
    @Step("I send GET HTTP Request with invalid user token")
    public void iSendGETHTTPRequestWithInvalidUserToken() {
        SerenityRest.given().relaxedHTTPSValidation()
                .when()
                .get(setGetUserSelfDataEndpoint());
    }
    @Step("I fail get profile response code 401")
    public void iReceiveHTTPResponseCode401() {
        restAssuredThat(response -> response.body("meta.message", equalTo("invalid token")));
        restAssuredThat(response -> response.body("meta.status", equalTo(401)));
    }
    @Step("I set PUT update data profile endpoint")
    public String setPutUpdateProfileEnd(){ return url+"/users/profile";}
    @Step("I send PUT HTTP Request")
    public void sendPutReq(){
        SerenityRest.given().auth().oauth2(token).relaxedHTTPSValidation()
                .contentType(ContentType.URLENC)
                .formParam("username", "people1")
                .when()
                .put(setPutUpdateProfileEnd());
    }
    @Step("I success update profile and response code 200")
    public void successUpdateProfile(){
        restAssuredThat(response -> response.body("meta.message", equalTo("success update profile")));
        restAssuredThat(response -> response.body("meta.status", equalTo(200)));
    }
    @Step("I send PUT HTTP Request with username already registered")
    public void sendPutUsernameRegistered(){
        SerenityRest.given().auth().oauth2(token).relaxedHTTPSValidation()
                .contentType(ContentType.URLENC)
                .formParam("username", "ivandev")
                .when()
                .put(setPutUpdateProfileEnd());
    }
    @Step("I receive HTTP response code 409")
    public void receiveResCode409(){
        restAssuredThat(response -> response.body("meta.message", equalTo("username already registered")));
        restAssuredThat(response -> response.body("meta.status", equalTo(409)));
    }
    @Step("I send PUT HTTP Request with invalid token")
    public void sendPutReqInvToken(){
        SerenityRest.given().relaxedHTTPSValidation()
                .contentType(ContentType.URLENC)
                .formParam("username", "people2")
                .when()
                .put(setPutUpdateProfileEnd());
    }
    @Step("I fail update profile response code 401")
    public void failUpdateProfile401(){
        restAssuredThat(response -> response.body("meta.message", equalTo("invalid token")));
        restAssuredThat(response -> response.body("meta.status", equalTo(401)));
    }
    @Step("I set PUT update password endpoint")
    public String setUpdatePasswordEnd(){return url+"/users/profile/password";}
    @Step("I send PUT update password HTTP Request")
    public void sendUpPwReq(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("current_password", "password1");
        requestBody.put("new_password", "password123");

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody).auth().oauth2(token)
                .when()
                .put(setUpdatePasswordEnd());
    }
    @Step("I success update password response code 200")
    public void successUpPw(){
        restAssuredThat(response -> response.body("meta.message", equalTo("success update password")));
        restAssuredThat(response -> response.body("meta.status", equalTo(200)));
    }
    @Step("I send PUT update password HTTP Request with invalid current password")
    public void sendReqInvCurPass(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("current_password", "password12");
        requestBody.put("new_password", "password2");

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody).auth().oauth2(token)
                .when()
                .put(setUpdatePasswordEnd());
    }
    @Step("I fail update password response code 400")
    public void failUpdatePassword400(){
        restAssuredThat(response -> response.body("meta.message", equalTo("current password is not match")));
        restAssuredThat(response -> response.body("meta.status", equalTo(400)));
    }
    @Step("I send PUT update password HTTP Request with invalid token")
    public void sendReqInvToken(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("current_password", "password2");
        requestBody.put("new_password", "password123");

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody)
                .when()
                .put(setUpdatePasswordEnd());
    }
    @Step("I fail update password response code 401")
    public void failUpdatePassword401(){
        restAssuredThat(response -> response.body("meta.message", equalTo("invalid token")));
        restAssuredThat(response -> response.body("meta.status", equalTo(401)));
    }
    @Step("I send PUT update password HTTP Request with current password empty value")
    public void sendReqEmptyValue(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("current_password", "");
        requestBody.put("new_password", "password123");

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody).auth().oauth2(token)
                .when()
                .put(setUpdatePasswordEnd());
    }
    @Step("I fail update password response code 500")
    public void failUpdatePassword500(){
        restAssuredThat(response -> response.body("meta.message", equalTo("all fields are required")));
        restAssuredThat(response -> response.body("meta.status", equalTo(500)));
    }
}
