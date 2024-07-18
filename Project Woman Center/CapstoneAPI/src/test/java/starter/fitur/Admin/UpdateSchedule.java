package starter.fitur.Admin;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateSchedule {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc1OTk4NTN9.auCTT-lhLfcPCVWyjr9ljFTiY-9OXoCKEre4XdWVri4";

    public String setPutUpdateScheduleWithValidEndpoint(){
        return url + "/admin/counselors/7993b562-0534-11ee-8266-0242c0a8b003";
    }

    public String setPutUpdateScheduleWithInvalidEndpoint(){
        return url + "/admn/counselors/08bc0b11-068c-11ee-a18f-0242c0a8d003";
    }

    public String setUpdateScheduleInvalidId(){
        return url + "/admin/counselors/08bc0b11-068c-11ee-a18f-0242c0a8d00";
    }

    public void sendPutUpdateScheduleWithValidEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("dates", "2023-11-10\",\"2023-12-02");
        requestBody.put("times", "08:00:00\",\"13:00:00");
        SerenityRest
        .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .contentType("application/json")
                .accept(ContentType.JSON)
                .body(requestBody)
                .put(setPutUpdateScheduleWithValidEndpoint());
    }
    public void receivedPutUpdateCounselorDataResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    public void sendPutUpdateScheduleWithInvalidEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("dates", "2023-11-10\",\"2023-12-02");
        requestBody.put("times", "08:00:00\",\"13:00:00");
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .contentType("application/json")
                .accept(ContentType.JSON)
                .body(requestBody)
                .put(setPutUpdateScheduleWithInvalidEndpoint());
    }

    public void receivedPutUpdateCounselorDataResponseCode404(){
        restAssuredThat(responses -> responses.statusCode(404));
    }

    public void sendPutUpdateScheduleWithoutToken(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("dates", "2023-11-10\",\"2023-12-02");
        requestBody.put("times", "08:00:00\",\"13:00:00");
        SerenityRest
                .given().relaxedHTTPSValidation()
                .contentType("application/json")
                .accept(ContentType.JSON)
                .body(requestBody)
                .put(setPutUpdateScheduleWithValidEndpoint());
    }
    public void receivePutUpdateScheduleResponseCode401(){
        restAssuredThat(responses -> responses.statusCode(401));
    }

    public void sendPutUpdateScheduleInvalidId(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("dates", "2023-11-10\",\"2023-12-02");
        requestBody.put("times", "08:00:00\",\"13:00:00");
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .contentType("application/json")
                .accept(ContentType.JSON)
                .body(requestBody)
                .put(setUpdateScheduleInvalidId());
    }
    public void receivedPutUpdateCounselorDataResponseCode400(){
        restAssuredThat(responses -> responses.statusCode(400));
    }
}
