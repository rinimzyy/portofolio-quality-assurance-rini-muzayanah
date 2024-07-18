package starter.fitur.User;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllUserCounselor {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImQwYWU5NTYyLTBkMjItMTFlZS04OTIzLTAyNDJhYzFlMDAwMyIsImVtYWlsIjoiaWhpbG1pZGVyaWFuQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiaXZhbmRldiIsImF1dGhfYnkiOiJhdXRoIiwiZXhwIjoxNjg3MzQ0NDc0fQ.pBUnVv7Z4mW0tCtC1VXSX6yP4h50NMB1X8m1QYxLtbU";

    public String setGetAllUserCounselorValidEndpoint(){
        return url + "/users/counselors?topic=1&sort_by=lowest_price";
    }
    public String setGetAllUserCounselorInvalidEndpoint(){
        return url + "/user/counselors?topic=1&sort_by=lowest_price";
    }

    public void sendReqValidEndpoint(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .get(setGetAllUserCounselorValidEndpoint());
    }
    public void receivedResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    public void sendReqInvalidEndpoint(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .get(setGetAllUserCounselorInvalidEndpoint());
    }
    public void receivedResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}