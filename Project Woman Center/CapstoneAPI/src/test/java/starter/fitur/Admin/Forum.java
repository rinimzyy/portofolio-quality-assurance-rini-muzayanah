package starter.fitur.Admin;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Forum {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc2NjUxNDR9.nZLq5gyBWjT6HCsbdqs824hie90cR-gnizph_4h_WEg";
    protected static String invalidToken = "eyJh";
    protected static String id = "57046646-4caf-4dc2-a457-2b7e66f72955";
    protected static String invId = "10ebec19-b89e-4b74-aa29-c1d7c0997cfu";
    protected static String delId = "4daeeadc-4fa4-4f18-966f-fbc22f36cf2d";
    protected static String delIdInv = "10ebec19-b89e-4b74-aa29-c1d7c0997cfu";

    public String setForumEndpoint() {
        return url + "/admin/forums";
    }
    public void sendReq() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).get(setForumEndpoint());
    }
    public void response200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    public String setForumInvEndpoint() {
        return url + "/admn/forums";
    }
    public void sendReqInvEnd() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).get(setForumInvEndpoint());
    }
    public void response404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    public void sendReqInvToken() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(invalidToken).get(setForumEndpoint());
    }
    public void response401() {
        restAssuredThat(response -> response.statusCode(401));
    }

    // Get forum By ID
    public String setForumEndpointByID() {
        return url + "/admin/forums" + "/" + id;
    }
    public void sendReqByID() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).get(setForumEndpointByID());
    }

    public String setForumEndpointByInvID() {
        return url + "/admin/forums" + "/" + invId;
    }
    public void sendReqByInvID() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).get(setForumEndpointByInvID());
    }
    public void response400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    public void sendReqByInvToken() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(invalidToken).get(setForumEndpointByID());
    }

    // Delete forum By ID
    public String setDeleteForumEndpointByID() {
        return url + "/admin/forums" + "/" + delId;
    }
    public void sendReqDeleteByID() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).delete(setDeleteForumEndpointByID());
    }

    public String setDeleteForumEndpointInvID() {
        return url + "/admin/forums/"+ delIdInv;
    }
    public void sendReqDeleteInvID() {
        SerenityRest.
                given().relaxedHTTPSValidation().auth()
                .oauth2(token).delete(setDeleteForumEndpointInvID());
    }
}
