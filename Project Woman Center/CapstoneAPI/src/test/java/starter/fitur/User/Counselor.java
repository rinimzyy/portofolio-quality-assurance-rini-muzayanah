package starter.fitur.User;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Counselor {
    protected static String url = "https://13.210.163.192:8080";
    private static String id = "43eda157-09df-11ee-b8a9-0242ac140003";
    private static String InvId = "43eda157-09df-11ee-b8a9-0242ac140007";
    private static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImQwYWU5NTYyLTBkMjItMTFlZS04OTIzLTAyNDJhYzFlMDAwMyIsImVtYWlsIjoiaWhpbG1pZGVyaWFuQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiaXZhbmRldiIsImF1dGhfYnkiOiJhdXRoIiwiZXhwIjoxNjg3MzIyOTUwfQ.ZFIdN4_i2Qpu_JhyVnlmS0UQ5aq9yp40HycYSaEALdA";
    protected static String invalidToken = "eyJh";

    public String setCounselorEndpoint() {
        return url + "/users/counselors/" + id ;
    }
    public String setCounselorEndpointInvalidId() {
        return url + "/users/counselors/" + InvId ;
    }
    public void sendReq() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).get(setCounselorEndpoint());
    }
    public void sendReqInvId() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).get(setCounselorEndpointInvalidId());
    }
    public void sendReqInvToken() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(invalidToken).get(setCounselorEndpoint());
    }
    public void successViewCounselorById() {
        restAssuredThat(response -> response.statusCode(200));
    }
    public void failViewCounselorById() {
        restAssuredThat(response -> response.statusCode(404));
    }
    public void failViewCounselorById401() {
        restAssuredThat(response -> response.statusCode(401));
    }

    private String counselorUUID;

    public String setGetCounselorScheduleEndpoint(String uuid) {
        counselorUUID = uuid;
        return url + "/users/counselors/" + uuid + "/schedules";
    }

    public void sendUserGetCounselorScheduleRequest() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .auth().oauth2(Login.userToken)
                .get(setGetCounselorScheduleEndpoint(counselorUUID));
    }

    public void verifyUserGetCounselorScheduleResponseCode(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }
}
