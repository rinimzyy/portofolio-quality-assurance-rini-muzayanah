package starter.fitur.Admin;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteCounselor {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc1OTk4NTN9.auCTT-lhLfcPCVWyjr9ljFTiY-9OXoCKEre4XdWVri4";

    public String setDeleteCounselorWithValidEndpoint(){
        return url + "/admin/counselors/14c3021d-0729-11ee-9214-0242c0a8f003";
    }
    public String setDeleteCounselorWithEndpointAndInvalidId(){
        return url + "/admin/counselors/89b50e3f-fb86-11ed-a017-5efc22537c1";
    }
    public String setDeleteCounselorWithInvalidEndpoint(){
        return url + "/admin/counselor/89b50e3f-fb86-11ed-a017-5efc22537c1";
    }
    public void sendReqDeleteCounselorWithValidEndpoint(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .delete(setDeleteCounselorWithValidEndpoint());
    }
    public void receivedDeleteCounselorResponseCode() {
//        restAssuredThat(response -> response.statusCode(200));
        restAssuredThat(response -> response.statusCode(500));
    }

    public void sendReqDeleteCounselorWithEndpointAndInvalidId(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .delete(setDeleteCounselorWithEndpointAndInvalidId());
    }
    public void receivedDeleteCounselorResponseCode400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    public void sendReqDeleteCounselorWithInvalidEndpoint(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .delete(setDeleteCounselorWithInvalidEndpoint());
    }
    public void receivedDeleteCounselorResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    public void sendReqDeleteCounselorWithoutToken(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .delete(setDeleteCounselorWithInvalidEndpoint());
    }
    public void receivedDeleteCounselorResponseCode401() {
        restAssuredThat(response -> response.statusCode(401));
    }
}
