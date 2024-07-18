package starter.fitur.User;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.given;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class ReadList {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImQwYWU5NTYyLTBkMjItMTFlZS04OTIzLTAyNDJhYzFlMDAwMyIsImVtYWlsIjoiaWhpbG1pZGVyaWFuQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiaXZhbmRldiIsImF1dGhfYnkiOiJhdXRoIiwiZXhwIjoxNjg3MzIyOTUwfQ.ZFIdN4_i2Qpu_JhyVnlmS0UQ5aq9yp40HycYSaEALdA";
    protected static String invToken = "eYj";
    private String name;
    private String description;
    private String article_id;
    private String reading_list_id;
    private Response response;

    public String setReadListEndpoint() {
        return url + "/users/reading-lists";
    }
    public String setReadListInvEndpoint() {
        return url + "/urs/reading-lists";
    }

    public void sendPostRequest(String name, String description) {
        this.name = name;
        this.description = description;

        JSONObject body = new JSONObject();
        body.put("name", name);
        body.put("description", description);

        RequestSpecification request = given().relaxedHTTPSValidation().auth()
                .oauth2(token)
                .baseUri(setReadListEndpoint())
                .header("Content-Type", "application/json")
                .body(body.toJSONString());

        response = request.post();
    }
    public void sendPostRequestInvEnd(String name, String description) {
        this.name = name;
        this.description = description;

        JSONObject body = new JSONObject();
        body.put("name", name);
        body.put("description", description);

        RequestSpecification request = given().relaxedHTTPSValidation().auth()
                .oauth2(token)
                .baseUri(setReadListInvEndpoint())
                .header("Content-Type", "application/json")
                .body(body.toJSONString());

        response = request.post();
    }
    public void sendPostRequestInvToken(String name, String description) {
        this.name = name;
        this.description = description;

        JSONObject body = new JSONObject();
        body.put("name", name);
        body.put("description", description);

        RequestSpecification request = given().relaxedHTTPSValidation().auth()
                .oauth2(invToken)
                .baseUri(setReadListEndpoint())
                .header("Content-Type", "application/json")
                .body(body.toJSONString());

        response = request.post();
    }
    public void success() {
        response.then().statusCode(200);
    }

    public void failCreateReadList401() {
        response.then().statusCode(401);
    }
    public void failCreateReadList400() {
        response.then().statusCode(400);
    }
    public void failCreateReadList404() {
        response.then().statusCode(404);
    }
    public void sendGetRequest() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).get(setReadListEndpoint());
    }
    public void successGet() {
        restAssuredThat(response -> response.statusCode(200));
    }

    public void sendGetRequestInvToken() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(invToken).get(setReadListEndpoint());
    }
    public void failGet() {
        restAssuredThat(response -> response.statusCode(401));
    }

    public String setSaveToReadListEndpoint() {
        return url + "/users/reading-lists/save";
    }

    public void sendSavePostRequest(String article_id, String reading_list_id) {
        this.article_id = article_id;
        this.reading_list_id = reading_list_id;

        JSONObject body = new JSONObject();
        body.put("article_id", article_id);
        body.put("reading_list_id", reading_list_id);

        RequestSpecification request = given().relaxedHTTPSValidation().auth()
                .oauth2(token)
                .baseUri(setSaveToReadListEndpoint())
                .header("Content-Type", "application/json")
                .body(body.toJSONString());

        response = request.post();
    }
    public void sendSavePostRequestInvToken(String article_id, String reading_list_id) {
        this.article_id = article_id;
        this.reading_list_id = reading_list_id;

        JSONObject body = new JSONObject();
        body.put("article_id", article_id);
        body.put("reading_list_id", reading_list_id);

        RequestSpecification request = given().relaxedHTTPSValidation().auth()
                .oauth2(invToken)
                .baseUri(setSaveToReadListEndpoint())
                .header("Content-Type", "application/json")
                .body(body.toJSONString());

        response = request.post();
    }
    public void response200() {
        response.then().statusCode(200);
    }
    public void response401() {
        response.then().statusCode(401);
    }
    public void response400() {
        response.then().statusCode(400);
    }

    @Step("I set GET reading list by ID with valid endpoint")
    public String setGetReadingListByID() {
        return url + "/users/reading-lists";
    }

    @Step("I set GET reading list by ID with invalid endpoint")
    public String setGetReadingListInvalidEndpoint() {
        return url + "/users/reading-list";
    }

    @Step("I set GET reading list invalid ID with valid endpoint")
    public String setGetReadingListInvalidID() {
        return url + "/users/reading-lists";
    }

    @Step("I set GET reading list by ID with invalid token")
    public String setGetReadingListInvalidToken() {
        return url + "/users/reading-lists";
    }

    @Step("I send HTTP GET reading list request with valid endpoint")
    public void sendReqReadingList() {
        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFiZTM3YmM0LTEwMTQtMTFlZS1hNGYxLTAyNDJhYzE4MDAwMyIsImVtYWlsIjoic2hpbnRhZGV3aWt1cm5pYXdAZ21haWwuY29tIiwidXNlcm5hbWUiOiJzaGludGExIiwiYXV0aF9ieSI6ImF1dGgiLCJleHAiOjE2ODc1OTgzNTd9.WKE_S8mpsU1mGuHWdG9Nci4DaoSStNho3-1rzSOlUzg";
        SerenityRest
                .given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .baseUri(setGetReadingListByID())
                .pathParams("id", "478f59d0-c089-4ba7-858f-bba0f1e9d2f1")
                .when()
                .get("/{id}");

    }
    @Step("I receive a valid HTTP reading list response code 200 OK")
    public void HttpReadingListResponse200() {
        restAssuredThat(response -> response.statusCode(200));
    }


    @Step("I send HTTP GET reading list request with invalid endpoint")
    public void sendReqReadingListInvalidEndpoint() {
        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFiZTM3YmM0LTEwMTQtMTFlZS1hNGYxLTAyNDJhYzE4MDAwMyIsImVtYWlsIjoic2hpbnRhZGV3aWt1cm5pYXdAZ21haWwuY29tIiwidXNlcm5hbWUiOiJzaGludGExIiwiYXV0aF9ieSI6ImF1dGgiLCJleHAiOjE2ODc1OTgzNTd9.WKE_S8mpsU1mGuHWdG9Nci4DaoSStNho3-1rzSOlUzg";
        SerenityRest
                .given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .baseUri(setGetReadingListInvalidEndpoint())
                .pathParams("id", "478f59d0-c089-4ba7-858f-bba0f1e9d2f1")
                .when()
                .get("/{id}");

    }
    @Step("I receive a valid HTTP reading list response code 404 Not Found")
    public void HttpReadingListResponse404() {
        restAssuredThat(response -> response.statusCode(404));
    }


    @Step("I send HTTP GET reading list request with invalid ID")
    public void sendReqReadingListInvalidID() {
        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFiZTM3YmM0LTEwMTQtMTFlZS1hNGYxLTAyNDJhYzE4MDAwMyIsImVtYWlsIjoic2hpbnRhZGV3aWt1cm5pYXdAZ21haWwuY29tIiwidXNlcm5hbWUiOiJzaGludGExIiwiYXV0aF9ieSI6ImF1dGgiLCJleHAiOjE2ODc1OTgzNTd9.WKE_S8mpsU1mGuHWdG9Nci4DaoSStNho3-1rzSOlUzg";
        SerenityRest
                .given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .baseUri(setGetReadingListInvalidID())
                .pathParams("id", "123f59d0-c089-4ba7-858f-bba0f1e9d2f1")
                .when()
                .get("/{id}");

    }
    @Step("I receive a valid HTTP reading list response code 400")
    public void HttpReadingListResponse400() {
        restAssuredThat(response -> response.statusCode(400));
    }


    @Step("I send HTTP GET reading list request with invalid token")
    public void sendReqReadingListInvalidToken() {
        String AuthToken = "eyJpZCI6ImFiZTM3YmM0LTEwMTQtMTFlZS1hNGYxLTAyNDJhYzE4MDAwMyIsImVtYWlsIjoic2hpbnRhZGV3aWt1cm5pYXdAZ21haWwuY29tIiwidXNlcm5hbWUiOiJzaGludGExIiwiYXV0aF9ieSI6ImF1dGgiLCJleHAiOjE2ODc1OTgzNTd9.WKE_S8mpsU1mGuHWdG9Nci4DaoSStNho3-1rzSOlUzg";
        SerenityRest
                .given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .baseUri(setGetReadingListInvalidToken())
                .pathParams("id", "478f59d0-c089-4ba7-858f-bba0f1e9d2f1")
                .when()
                .get("/{id}");

    }
    @Step("I receive a valid HTTP reading list response code 401 Invalid Token")
    public void HttpReadingListResponse401() {
        restAssuredThat(response -> response.statusCode(401));
    }


    @Step("I set PUT reading list with valid endpoint")
    public String setPutReadingList() {
        return url + "/users/reading-lists/478f59d0-c089-4ba7-858f-bba0f1e9d2f1";

    }
    @Step("I set PUT reading list with invalid endpoint")
    public String setPutReadingListInvalidEndpoint() {
        return url + "/users/reading-list/478f59d0-c089-4ba7-858f-bba0f1e9d2f1";

    }
    @Step("I set PUT reading list with invalid ID")
    public String setPutReadingListInvalidID() {
        return url + "/users/reading-lists/123f59d0-c089-4ba7-858f-bba0f1e9d2f1";

    }
    @Step("I set PUT reading list with invalid token")
    public String setPutReadingListInvalidToken() {
        return url + "/users/reading-lists/478f59d0-c089-4ba7-858f-bba0f1e9d2f1";

    }
    @Step("I send HTTP PUT reading list request with valid endpoint")
    public void sendPutReqReadingList() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFiZTM3YmM0LTEwMTQtMTFlZS1hNGYxLTAyNDJhYzE4MDAwMyIsImVtYWlsIjoic2hpbnRhZGV3aWt1cm5pYXdAZ21haWwuY29tIiwidXNlcm5hbWUiOiJzaGludGExIiwiYXV0aF9ieSI6ImF1dGgiLCJleHAiOjE2ODc1OTgzNTd9.WKE_S8mpsU1mGuHWdG9Nci4DaoSStNho3-1rzSOlUzg")
                .put(setPutReadingList());

    }
    @Step("I receive a valid HTTP update reading list response code 200 OK")
    public void HttpPutReadingListResponse200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I send HTTP PUT reading list request with invalid endpoint")
    public void sendPutReqReadingListInvalidEndpoint() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFiZTM3YmM0LTEwMTQtMTFlZS1hNGYxLTAyNDJhYzE4MDAwMyIsImVtYWlsIjoic2hpbnRhZGV3aWt1cm5pYXdAZ21haWwuY29tIiwidXNlcm5hbWUiOiJzaGludGExIiwiYXV0aF9ieSI6ImF1dGgiLCJleHAiOjE2ODc1OTgzNTd9.WKE_S8mpsU1mGuHWdG9Nci4DaoSStNho3-1rzSOlUzg")
                .put(setPutReadingListInvalidEndpoint());

    }
    @Step("I receive a valid HTTP update reading list response code 404")
    public void HttpPutReadingListResponse404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I send HTTP PUT reading list request with invalid ID")
    public void sendPutReqReadingListInvalidID() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFiZTM3YmM0LTEwMTQtMTFlZS1hNGYxLTAyNDJhYzE4MDAwMyIsImVtYWlsIjoic2hpbnRhZGV3aWt1cm5pYXdAZ21haWwuY29tIiwidXNlcm5hbWUiOiJzaGludGExIiwiYXV0aF9ieSI6ImF1dGgiLCJleHAiOjE2ODc1OTgzNTd9.WKE_S8mpsU1mGuHWdG9Nci4DaoSStNho3-1rzSOlUzg")
                .put(setPutReadingListInvalidID());

    }
    @Step("I receive a valid HTTP update reading list response code 400")
    public void HttpPutReadingListResponse400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I send HTTP PUT reading list request with invalid token")
    public void sendPutReqReadingListInvalidToken() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJpZCI6ImFiZTM3YmM0LTEwMTQtMTFlZS1hNGYxLTAyNDJhYzE4MDAwMyIsImVtYWlsIjoic2hpbnRhZGV3aWt1cm5pYXdAZ21haWwuY29tIiwidXNlcm5hbWUiOiJzaGludGExIiwiYXV0aF9ieSI6ImF1dGgiLCJleHAiOjE2ODc1OTgzNTd9.WKE_S8mpsU1mGuHWdG9Nci4DaoSStNho3-1rzSOlUzg")
                .put(setPutReadingListInvalidToken());

    }
    @Step("I receive a valid HTTP update reading list response code 401")
    public void HttpPutReadingListResponse401() {
        restAssuredThat(response -> response.statusCode(401));
    }


    @Step("I set DELETE reading list with valid endpoint")
    public String setDeleteReadingList() {return url + "/users/reading-lists/478f59d0-c089-4ba7-858f-bba0f1e9d2f1";}

    @Step("I set DELETE reading list with invalid endpoint")
    public String setDeleteReadingListInvalidEndpoint() {return url + "/users/reading-list/478f59d0-c089-4ba7-858f-bba0f1e9d2f1";}

    @Step("I set DELETE reading list with invalid ID")
    public String setDeleteReadingListInvalidID() {return url + "/users/reading-lists/123f59d0-c089-4ba7-858f-bba0f1e9d2f1";}

    @Step("I set DELETE reading list with invalid token")
    public String setDeleteReadingListInvalidToken() {return url + "/users/reading-lists/478f59d0-c089-4ba7-858f-bba0f1e9d2f1";}

    @Step("I send HTTP DELETE reading list request with valid endpoint")
    public void sendDeleteReqReadingList() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFiZTM3YmM0LTEwMTQtMTFlZS1hNGYxLTAyNDJhYzE4MDAwMyIsImVtYWlsIjoic2hpbnRhZGV3aWt1cm5pYXdAZ21haWwuY29tIiwidXNlcm5hbWUiOiJzaGludGExIiwiYXV0aF9ieSI6ImF1dGgiLCJleHAiOjE2ODc2Mjc3Mjl9.bwjLyaTw2B4zlP4JwgI1LI0jHFInMJ37oUAotdMI-Rs")
                .delete(setDeleteReadingList());

    }
    @Step("I receive a valid HTTP delete reading list response code 200 OK")
    public void HttpDeleteReadingListResponse200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I send HTTP DELETE reading list request with invalid endpoint")
    public void sendDeleteReqReadingListInvalidEndpoint() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFiZTM3YmM0LTEwMTQtMTFlZS1hNGYxLTAyNDJhYzE4MDAwMyIsImVtYWlsIjoic2hpbnRhZGV3aWt1cm5pYXdAZ21haWwuY29tIiwidXNlcm5hbWUiOiJzaGludGExIiwiYXV0aF9ieSI6ImF1dGgiLCJleHAiOjE2ODc2Mjc3Mjl9.bwjLyaTw2B4zlP4JwgI1LI0jHFInMJ37oUAotdMI-Rs")
                .delete(setDeleteReadingListInvalidEndpoint());

    }
    @Step("I receive a valid HTTP delete reading list response code 404")
    public void HttpDeleteReadingListResponse404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("I send HTTP DELETE reading list request with invalid ID")
    public void sendDeleteReqReadingListInvalidID() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImFiZTM3YmM0LTEwMTQtMTFlZS1hNGYxLTAyNDJhYzE4MDAwMyIsImVtYWlsIjoic2hpbnRhZGV3aWt1cm5pYXdAZ21haWwuY29tIiwidXNlcm5hbWUiOiJzaGludGExIiwiYXV0aF9ieSI6ImF1dGgiLCJleHAiOjE2ODc2Mjc3Mjl9.bwjLyaTw2B4zlP4JwgI1LI0jHFInMJ37oUAotdMI-Rs")
                .delete(setDeleteReadingListInvalidID());

    }
    @Step("I receive a valid HTTP delete reading list response code 400")
    public void HttpDeleteReadingListResponse400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I send HTTP DELETE reading list request with invalid token")
    public void sendDeleteReqReadingListInvalidToken() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJpZCI6ImFiZTM3YmM0LTEwMTQtMTFlZS1hNGYxLTAyNDJhYzE4MDAwMyIsImVtYWlsIjoic2hpbnRhZGV3aWt1cm5pYXdAZ21haWwuY29tIiwidXNlcm5hbWUiOiJzaGludGExIiwiYXV0aF9ieSI6ImF1dGgiLCJleHAiOjE2ODc2Mjc3Mjl9.bwjLyaTw2B4zlP4JwgI1LI0jHFInMJ37oUAotdMI-Rs")
                .delete(setDeleteReadingListInvalidToken());

    }
    @Step("I receive a valid HTTP delete reading list response code 401")
    public void HttpDeleteReadingListResponse401() {
        restAssuredThat(response -> response.statusCode(401));
    }

}
