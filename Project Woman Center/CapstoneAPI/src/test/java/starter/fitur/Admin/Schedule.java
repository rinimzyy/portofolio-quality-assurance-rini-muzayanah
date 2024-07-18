package starter.fitur.Admin;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Schedule {
    protected static String url = "https://13.210.163.192:8080";
    protected static String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODY4OTk5MTF9.NEPcBfSVundka2QBrb_BBBcraZfsKydd7Wrkb6BGfnA";
    protected static String InvToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9";

    @Step("I set get counselor schedule endpoint")
    public String setGetScheduleEnd(){return url + "/admin/counselors";}
    @Step("I send Request with method GET")
    public void sendReq(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(AuthToken)
                .baseUri(setGetScheduleEnd())
                .pathParam("id", "7993b562-0534-11ee-8266-0242c0a8b003")
                .when()
                .get("/{id}/schedules");
    }
    @Step("I success get counselor schedule")
    public void successGetSchedule(){restAssuredThat(response -> response.statusCode(200));}
    @Step("I send Request with method GET with invalid token")
    public void sendReqInvToken(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(InvToken)
                .baseUri(setGetScheduleEnd())
                .pathParam("id", "7993b562-0534-11ee-8266-0242c0a8b003")
                .when()
                .get("/{id}/schedules");
    }
    @Step("I failed get counselor schedule and response code 401")
    public void resCode401(){restAssuredThat(response -> response.statusCode(401));}
    @Step("I send Request with method GET with invalid id")
    public void sendRewInvId(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(AuthToken)
                .baseUri(setGetScheduleEnd())
                .pathParam("id", "7993b562-0534-11ee-8266-0242c0a8b00")
                .when()
                .get("/{id}/schedules");
    }
    @Step("I failed get counselor schedule and response code 400")
    public void resCode400(){restAssuredThat(response -> response.statusCode(400));}
    @Step("I set invalid get counselor schedule endpoint")
    public String setInvEnd(){return url + "/admin/counselor";}
    @Step("I send Request with method GET with invalid endpoint")
    public void sendReqInvEnd(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(AuthToken)
                .baseUri(setInvEnd())
                .pathParam("id", "7993b562-0534-11ee-8266-0242c0a8b003")
                .when()
                .get("/{id}/schedules");
    }
    @Step("I failed get counselor schedule and response code 404")
    public void resCode404(){
        restAssuredThat(response -> response.statusCode(404));
        restAssuredThat(response -> response.body("'message'", equalTo("Not Found")));
    }
    @Step("I set post counselor schedule endpoint")
    public String setPostCounselorScheduleEnd(){return url + "/admin/counselors";}
    @Step("I send POST HTTP Request")
    public void sendPostReq(){
        String requestBody = "{\n" +
                "    \"dates\": [\"2023-12-21\"],\n" +
                "    \"times\": [\"10:00:00\"]\n" +
                "}";

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody).auth().oauth2(AuthToken)
                .baseUri(setPostCounselorScheduleEnd())
                .pathParam("id", "7993b562-0534-11ee-8266-0242c0a8b003")
                .when()
                .post("/{id}/schedules");
    }
    @Step("I success post counselor schedule")
    public void success(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I send POST HTTP Request with invalid token")
    public void invalidToken(){
        String requestBody = "{\n" +
                "    \"dates\": [\"2023-12-11\"],\n" +
                "    \"times\": [\"13:00:00\"]\n" +
                "}";

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody).auth().oauth2(InvToken)
                .baseUri(setPostCounselorScheduleEnd())
                .pathParam("id", "7993b562-0534-11ee-8266-0242c0a8b003")
                .when()
                .post("/{id}/schedules");
    }
    @Step("I failed post counselor schedule and response code 401")
    public void code401(){restAssuredThat(response -> response.statusCode(401));}
    @Step("I send POST HTTP Request with invalid id")
    public void invalidId(){
        String requestBody = "{\n" +
                "    \"dates\": [\"2023-12-11\"],\n" +
                "    \"times\": [\"13:00:00\"]\n" +
                "}";

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody).auth().oauth2(AuthToken)
                .baseUri(setPostCounselorScheduleEnd())
                .pathParam("id", "7993b562-0534-11ee-8266-0242c0a8b00")
                .when()
                .post("/{id}/schedules");
    }
    @Step("I failed post counselor schedule and response code 400")
    public void code400(){restAssuredThat(response -> response.statusCode(400));}
    @Step("I send POST HTTP Request with invalid body parameter")
    public void invalidBodyParameter(){
        String requestBody = "{\n" +
                "    \"date\": [\"2023-12-11\"],\n" +
                "    \"time\": [\"13:00:00\"]\n" +
                "}";

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody).auth().oauth2(AuthToken)
                .baseUri(setPostCounselorScheduleEnd())
                .pathParam("id", "7993b562-0534-11ee-8266-0242c0a8b00")
                .when()
                .post("/{id}/schedules");
    }
    @Step("I send POST HTTP Request with empty dates")
    public void emptyDates(){
        String requestBody = "{\n" +
                "    \"dates\": [\"\"],\n" +
                "    \"times\": [\"13:00:00\"]\n" +
                "}";

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody).auth().oauth2(AuthToken)
                .baseUri(setPostCounselorScheduleEnd())
                .pathParam("id", "7993b562-0534-11ee-8266-0242c0a8b00")
                .when()
                .post("/{id}/schedules");
    }
    @Step("I send POST HTTP Request with empty body")
    public void emptyBody(){
        String requestBody = "";

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody).auth().oauth2(AuthToken)
                .baseUri(setPostCounselorScheduleEnd())
                .pathParam("id", "7993b562-0534-11ee-8266-0242c0a8b00")
                .when()
                .post("/{id}/schedules");
    }
}
