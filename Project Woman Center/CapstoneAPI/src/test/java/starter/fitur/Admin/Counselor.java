package starter.fitur.Admin;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Counselor {
    protected String url = "https://13.210.163.192:8080";

    @Step("I set GET all counselor with valid endpoint")
    public String setGetAllCounselorWithValidEndpoint() {
        return url + "/admin/counselors";

    }

    @Step("I set GET all counselor with valid endpoint by page")
    public String setGetAllCounselorByPage() {
        return url + "/admin/counselors?page=1";

    }

    @Step("I set GET all counselor with valid endpoint by limit")
    public String setGetAllCounselorByLimit() {
        return url + "/admin/counselors?limit=1";

    }

    @Step("I set GET all counselor with valid endpoint by search")
    public String setGetAllCounselorBySearch() {
        return url + "/admin/counselors?search=test";

    }

    @Step("I set GET all counselor with valid endpoint based sort by")
    public String setGetAllCounselorSortBy() {
        return url + "/admin/counselors?sort_by=newest";

    }

    @Step("I set GET all counselor with valid endpoint by has schedule")
    public String setGetAllCounselorHasSchedule() {
        return url + "/admin/counselors?has_schedule=true";

    }

    @Step("I set GET all counselor with invalid endpoint")
    public String setGetAllCounselorWithInvalidEndpoint() {
        return url + "/admin/counselor";

    }

    @Step("I send HTTP GET request with valid endpoint")
    public void sendReqValidEndpoint() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc2MzU2NTZ9.7h3WRwFoMJIWfiYLk62uXaMoRhRJNVcDZ5SpY4tu6U0")
                .get(setGetAllCounselorWithValidEndpoint());

    }
    @Step("I receive a valid HTTP response code 200 OK")
    public void HttpResponse200() {
        restAssuredThat(response -> response.statusCode(200));

    }

    @Step("I send HTTP GET request with valid endpoint by page")
    public void sendReqValidEndpointByPage() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc2MzU2NTZ9.7h3WRwFoMJIWfiYLk62uXaMoRhRJNVcDZ5SpY4tu6U0")
                .get(setGetAllCounselorByPage());

    }
    @Step("I receive a valid HTTP by page response code 200 OK")
    public void HttpPageResponse200() {
        restAssuredThat(response -> response.statusCode(200));

    }

    @Step("I send HTTP GET request with valid endpoint by limit")
    public void sendReqValidEndpointByLimit() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc2MzU2NTZ9.7h3WRwFoMJIWfiYLk62uXaMoRhRJNVcDZ5SpY4tu6U0")
                .get(setGetAllCounselorByLimit());

    }
    @Step("I receive a valid HTTP by limit response code 200 OK")
    public void HttpLimitResponse200() {
        restAssuredThat(response -> response.statusCode(200));

    }

    @Step("I send HTTP GET request with valid endpoint by search")
    public void sendReqValidEndpointBySearch() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc2MzU2NTZ9.7h3WRwFoMJIWfiYLk62uXaMoRhRJNVcDZ5SpY4tu6U0")
                .get(setGetAllCounselorBySearch());

    }
    @Step("I receive a valid HTTP by search response code 200 OK")
    public void HttpSearchResponse200() {
        restAssuredThat(response -> response.statusCode(200));

    }

    @Step("I send HTTP GET request with valid endpoint based sort by")
    public void sendReqValidEndpointSortBy() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc2MzU2NTZ9.7h3WRwFoMJIWfiYLk62uXaMoRhRJNVcDZ5SpY4tu6U0")
                .get(setGetAllCounselorSortBy());

    }
    @Step("I receive a valid HTTP based sort by response code 200 OK")
    public void HttpSortByResponse200() {
        restAssuredThat(response -> response.statusCode(200));

    }

    @Step("I send HTTP GET request with valid endpoint by has schedule")
    public void sendReqValidEndpointHasSchedule() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc2MzU2NTZ9.7h3WRwFoMJIWfiYLk62uXaMoRhRJNVcDZ5SpY4tu6U0")
                .get(setGetAllCounselorHasSchedule());

    }
    @Step("I receive a valid HTTP by has schedule response code 200 OK")
    public void HttpHasScheduleResponse200() {
        restAssuredThat(response -> response.statusCode(200));

    }


    @Step("I send HTTP GET request with invalid endpoint")
    public void sendReqInvalidEndpoint() {
        RestAssured.defaultParser = Parser.JSON;
        SerenityRest
                .given().relaxedHTTPSValidation()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc2MzU2NTZ9.7h3WRwFoMJIWfiYLk62uXaMoRhRJNVcDZ5SpY4tu6U0")
                .get(setGetAllCounselorWithInvalidEndpoint());

    }
    @Step("I received HTTP response code 404 Not Found")
    public void HttpResponse404() {
        restAssuredThat(response -> response.statusCode(404));

    }

    @Step("I set GET valid endpoint by ID")
    public String setGetValidEndpointByID() {
        return url + "/admin/counselors";

    }
    @Step("I set GET counselor valid endpoint with invalid ID")
    public String setGetInvalidID() {
        return url + "/admin/counselors";

    }
    @Step("I set GET valid endpoint with empty ID")
    public String setGetEmptyID() {
        return url + "/admin/counselors";

    }

    @Step("I send HTTP GET to the request with valid endpoint")
    public void sendIDReqValidEndpoint() {
        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODczMzA5OTh9.WkAlfX6Vccaw_i6Fp4RIjwdnRH5-0a8P8HIgX5O4WkI";
        SerenityRest
                .given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .baseUri(setGetValidEndpointByID())
                .pathParams("id", "7993b562-0534-11ee-8266-0242c0a8b003")
                .when()
                .get("/{id}");

    }
    @Step("I receive a HTTP response code 200 OK")
    public void IDHttpResponse200() {
        restAssuredThat(response -> response.statusCode(200));

    }


    @Step("I send HTTP GET counselor to request with invalid ID")
    public void sendReqInvalidID() {
        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODczMzA5OTh9.WkAlfX6Vccaw_i6Fp4RIjwdnRH5-0a8P8HIgX5O4WkI";
        SerenityRest
                .given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .baseUri(setGetInvalidID())
                .pathParams("id", "8993b562-0534-11ee-8266-0242c0a8b003")
                .when()
                .get("/{id}");

    }
    @Step("I receive HTTP response code is 404 Not Found")
    public void IDHttpResponse404() {
        restAssuredThat(response -> response.statusCode(404));

    }


    @Step("I send HTTP GET to request with valid endpoint with empty ID")
    public void sendReqEmptyID() {
        String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODczMzA5OTh9.WkAlfX6Vccaw_i6Fp4RIjwdnRH5-0a8P8HIgX5O4WkI";
        SerenityRest
                .given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .baseUri(setGetEmptyID())
                .pathParams("id", "")
                .when()
                .get("/{id}");

    }
    @Step("I receive a HTTP response code 404")
    public void HttpResponse400() {
        restAssuredThat(response -> response.statusCode(404));

    }
}
