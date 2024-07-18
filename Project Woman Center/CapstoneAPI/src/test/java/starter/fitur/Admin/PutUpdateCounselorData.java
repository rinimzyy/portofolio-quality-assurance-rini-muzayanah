package starter.fitur.Admin;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PutUpdateCounselorData {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc1OTk4NTN9.auCTT-lhLfcPCVWyjr9ljFTiY-9OXoCKEre4XdWVri4";

    public String setPutUpdateCounselorDataValidEndpoint(){
        return url + "/admin/counselors/7993b562-0534-11ee-8266-0242c0a8b003";
    }
    public String setPutUpdateCounselorDataWithEndpointAndInvalidId(){
        return url + "/admin/counselors/08bc0b11-068c-11ee-a18f-0242c0a8d00";
    }
    public String setPutUpdateCounselorDataInvalidEndpoint(){
        return url + "/admin/counselor/7993b562-0534-11ee-8266-0242c0a8b003";
    }

    public void sendReqPutUpdateCounselorDataValidEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "test");
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .contentType("application/json")
                .accept(ContentType.JSON)
                .body(requestBody)
                .put(setPutUpdateCounselorDataValidEndpoint());
    }
    public void receivedPutUpdateCounselorDataResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    public void sendReqPutUpdateCounselorDataWithEndpointAndInvalidId(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "test");
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .contentType("application/json")
                .accept(ContentType.JSON)
                .body(requestBody)
                .put(setPutUpdateCounselorDataWithEndpointAndInvalidId());
    }
    public void receivedPutUpdateCounselorDataResponseCode400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    public void sendReqPutUpdateCounselorDataWithInvalidEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "test");
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .contentType("application/json")
                .accept(ContentType.JSON)
                .body(requestBody)
                .put(setPutUpdateCounselorDataInvalidEndpoint());
    }
    public void receivedPutUpdateCounselorDataResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    public void sendReqPutUpdateCounselorDataWithoutToken(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "test");
        SerenityRest
                .given().relaxedHTTPSValidation()
                .contentType("application/json")
                .accept(ContentType.JSON)
                .body(requestBody)
                .put(setPutUpdateCounselorDataValidEndpoint());
    }
    public void receivedPutUpdateCounselorDataResponseCode401() {
        restAssuredThat(response -> response.statusCode(401));
    }
}
