package starter.fitur.Admin;


import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import java.util.HashMap;
import java.util.Map;

public class Career {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODY5MTM4MjZ9.ZZSSTRWtwSSsm3xTWaJ5hpwRTJVRFSk5Or-0DufQf7Y";
    protected static String invalidToken = "eyJh";
    private Response response;
    private Map<String, Object> data = new HashMap<>();
    private String careerUUID;

    public String setCareerEndpoint() {
        return url + "/admin/careers";
    }
    public String setInvalidCareerEndpoint() {
        return url + "/adm/careers";
    }
    public void sendReq() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).get(setCareerEndpoint());
    }
    public void sendReqInvalidEndpoint() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).get(setInvalidCareerEndpoint());
    }
    public void sendReqInvalidMethod() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).put(setCareerEndpoint());
    }
    public void sendReqInvalidToken() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(invalidToken).put(setCareerEndpoint());
    }
    public void successViewAllCareer() {
        restAssuredThat(response -> response.statusCode(200));
    }

    public void failViewCareer404() {
        restAssuredThat(response -> response.statusCode(404));
        restAssuredThat(response -> response.body("message", equalTo("Not Found")));
    }
    public void failViewCareer401() {
        restAssuredThat(response -> response.statusCode(401));
    }

    // Career search
    public String setSearchCareerEndpoint(String search) {
        return url + "/admin/careers?search=" +search;
    }

    public void sendSearchCareerRequest(String search) {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .auth().oauth2(token)
                .get(setSearchCareerEndpoint(search));
    }

    public void successResponse200(int successCode) {
        restAssuredThat(response -> response.statusCode(successCode));
    }

    // Career delete
    public String setDeleteCareerEndpoint(String uuid) {
        careerUUID = uuid;
        return url + "/admin/careers/" + careerUUID;
    }

    public void sendDeleteCareerRequest() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .auth().oauth2(Login.adminToken)
                .delete(setDeleteCareerEndpoint(careerUUID));
    }

    public void receiveResponseCode(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

    @Step("I set GET career valid endpoint by ID")
    public String setGetCareerValidEndpointByID() {
        return url + "/admin/careers";
    }

    @Step("I set GET career valid endpoint with invalid ID")
    public String setGetCareerInvalidID() {
        return url + "/admin/careers";
    }

    @Step("I set GET career by ID invalid token")
    public String setGetCareerInvalidToken() {
        return url + "/admin/careers";
    }

    @Step("I set PUT career valid endpoint")
    public String setPutCareerValidEndpoint() {
        return url + "/admin/careers/ad00ddff-0941-11ee-b8a9-0242ac140003";

    }

    @Step("I set PUT career invalid endpoint")
    public String setPutCareerInvalidEndpoint() {
        return url + "/admin/career/ad00ddff-0941-11ee-b8a9-0242ac140003";

    }

    @Step("I set PUT career valid endpoint with invalid ID")
    public String setPutCareerInvalidID() {
        return url + "/admin/careers/bc23ddff-0941-11ee-b8a9-0242ac140003";

    }

    @Step("I set PUT career valid endpoint with invalid token")
    public String setPutCareerInvalidToken() {
        return url + "/admin/careers/ad00ddff-0941-11ee-b8a9-0242ac140003";

    }

    @Step("I send HTTP GET career to request with valid endpoint")
    public void sendIDReqCareerValidEndpoint() {
        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc0NDcwNTJ9.FVsMt-eHzfTFsKrOb7wpLOYw5wsWtlPEkQ74Uov_Wl0";
        SerenityRest
                .given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .baseUri(setGetCareerValidEndpointByID())
                .pathParams("id", "ad00ddff-0941-11ee-b8a9-0242ac140003")
                .when()
                .get("/{id}");

    }
    @Step("I receive a HTTP career response code 200 OK")
    public void HttpCareerResponse200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I send HTTP GET career to request with invalid ID")
    public void sendReqInvalidID() {
        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc0NDcwNTJ9.FVsMt-eHzfTFsKrOb7wpLOYw5wsWtlPEkQ74Uov_Wl0";
        SerenityRest
                .given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .baseUri(setGetCareerInvalidID())
                .pathParams("id", "bc99ddff-0941-11ee-b8a9-0242ac140003")
                .when()
                .get("/{id}");

    }
    @Step("I receive a HTTP career response code 400 Not Found")
    public void HttpCareerResponse400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I send HTTP GET career to request with invalid token")
    public void sendGetReqInvalidToken() {
        String AuthToken = "eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc0NDcwNTJ9.FVsMt-eHzfTFsKrOb7wpLOYw5wsWtlPEkQ74Uov_Wl0";
        SerenityRest
                .given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .baseUri(setGetCareerInvalidToken())
                .pathParams("id", "ad00ddff-0941-11ee-b8a9-0242ac140003")
                .when()
                .get("/{id}");

    }
    @Step("I receive a HTTP career response code 401 Invalid Token")
    public void HttpCareerResponse401() {
        restAssuredThat(response -> response.statusCode(401));
    }



    @Step("I send HTTP PUT career to request with valid endpoint")
    public void sendPutReqCareerValidEndpoint() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc0NTMzNDR9.L1_CXMYZ_--Yd7WnB35c4-jgEnbpU33xdVkbVWr3YF0")
                .put(setPutCareerValidEndpoint());

    }
    @Step("I received HTTP career response code 200 OK")
    public void HttpPutCareerResponse200() {
        restAssuredThat(response -> response.statusCode(200));

    }

    @Step("I send HTTP PUT career to request with invalid endpoint")
    public void sendPutReqCareerInvalidEndpoint() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc0NTMzNDR9.L1_CXMYZ_--Yd7WnB35c4-jgEnbpU33xdVkbVWr3YF0")
                .put(setPutCareerInvalidEndpoint());

    }
    @Step("I received HTTP career response code 404 Not Found")
    public void HttpPutCareerResponse404() {
        restAssuredThat(response -> response.statusCode(404));

    }

    @Step("I send HTTP PUT career to request with invalid ID")
    public void sendPutReqCareerInvalidID() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc0NTMzNDR9.L1_CXMYZ_--Yd7WnB35c4-jgEnbpU33xdVkbVWr3YF0")
                .put(setPutCareerInvalidID());

    }
    @Step("I received HTTP career response code 400")
    public void HttpPutCareerResponse400() {
        restAssuredThat(response -> response.statusCode(400));

    }

    @Step("I send HTTP PUT career to request with invalid token")
    public void sendPutReqCareerInvalidToken() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc0NTMzNDR9.L1_CXMYZ_--Yd7WnB35c4-jgEnbpU33xdVkbVWr3YF0")
                .put(setPutCareerInvalidToken());

    }
    @Step("I received HTTP career response code 401")
    public void HttpPutCareerResponse401() {
        restAssuredThat(response -> response.statusCode(401));

    }
}
