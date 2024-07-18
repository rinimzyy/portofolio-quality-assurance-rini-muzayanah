package starter.fitur.Admin;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class User {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc0MDQ3Nzd9.0Ga6z8KNNL4G6XIziPNKdnEbnaZCs1AyVXj5gw2O8rU";
    protected static String invToken = "eyJh";
    protected static String filter = "?page&limit&search&sort_by=newest"; // page for which page you want to go, limit for how many daya you want for being displayed, search for get with specific keyword, sort for sorting user data from mewest or oldest;
    protected static String id = "04046111-0855-11ee-82c9-0242ac120003";
    protected static String invId = "04046111-0855-11ee-82c9-0242ac120000";
    protected static String delId = "f60893dc-039e-11ee-b44d-0242c0a84003";
    protected static String delIdInvalid = "37c24f93-05da-11ee-a18f-0242c0a8d000";

    public String setGetUserEndpoint() {
        return url + "/admin/users";
    }
    public void sendReq() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json").auth()
                .oauth2(token).get(setGetUserEndpoint());
    }

    public String setGetUserEndpointWithFilter() {
        return url + "/admin/users" + filter;
    }
    public void sendReqWithFilter() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json").auth()
                .oauth2(token).get(setGetUserEndpointWithFilter());
    }

    public String setGetUserInvEndpoint() {
        return url + "/admn/users";
    }
    public void sendReqInvEnd() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json").auth()
                .oauth2(token).get(setGetUserInvEndpoint());
    }

    public void sendReqInvToken() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json").auth()
                .oauth2(invToken).get(setGetUserEndpoint());
    }

    // View user data By ID
    public String setUserDataEndpoint() {
        return url + "/admin/users/" + id;
    }
    public void sendReqUserData() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json").auth()
                .oauth2(token).get(setUserDataEndpoint());
    }

    public String setUserDataEndpointInvID() {
        return url + "/admin/users/" + invId;
    }
    public void sendReqUserDataInvID() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json").auth()
                .oauth2(token).get(setUserDataEndpointInvID());
    }

    public void sendReqUserDataInvToken() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json").auth()
                .oauth2(invToken).get(setUserDataEndpoint());
    }

    // Delete user data By ID
    public String setDeleteUserDataEndpoint() {
        return url + "/admin/users/" + delId;
    }
    public void sendDeleteReqUserData() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json").auth()
                .oauth2(token).delete(setDeleteUserDataEndpoint());
    }

    public String setInvalidDeleteUserDataEndpoint() {
        return url + "/admin/users/" + delIdInvalid;
    }
    public void sendInvalidDeleteReqUserData() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json").auth()
                .oauth2(token).delete(setInvalidDeleteUserDataEndpoint());
    }

    public void successGet() {
        restAssuredThat(response -> response.statusCode(200));
    }
    public void failGet404() {
        restAssuredThat(response -> response.statusCode(404));
    }
    public void failGet401() {
        restAssuredThat(response -> response.statusCode(401));
    }
}
