package starter.fitur.User;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Voucher {
    protected static String url = "https://13.210.163.192:8080";
    private static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImQwYWU5NTYyLTBkMjItMTFlZS04OTIzLTAyNDJhYzFlMDAwMyIsImVtYWlsIjoiaWhpbG1pZGVyaWFuQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiaXZhbmRldiIsImF1dGhfYnkiOiJhdXRoIiwiZXhwIjoxNjg3MzIyOTUwfQ.ZFIdN4_i2Qpu_JhyVnlmS0UQ5aq9yp40HycYSaEALdA";
    protected static String invalidToken = "eyJh";

    public String setVoucherEndpoint() {
        return url + "/users/vouchers";
    }
    public String setInvalidEndpoint() {
        return url + "/urs/vouchers";
    }
    public void sendReq() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).get(setVoucherEndpoint());
    }
    public void sendReqInvToken() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(invalidToken).get(setVoucherEndpoint());
    }
    public void sendReqInvEnd() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).get(setInvalidEndpoint());
    }
    public void successViewAllVoucher() {
        restAssuredThat(response -> response.statusCode(200));
    }
    public void failViewAllVoucher401() {
        restAssuredThat(response -> response.statusCode(401));
    }
    public void failViewAllVoucher404() {
        restAssuredThat(response -> response.statusCode(404));
        restAssuredThat(response -> response.body("message", equalTo("Not Found")));
    }
}
