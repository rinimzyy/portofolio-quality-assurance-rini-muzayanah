package starter.fitur.Admin;

import net.serenitybdd.rest.SerenityRest;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetTopic {
    protected static String url = "https://13.210.163.192:8080";

    public String setTopicEndpoint() {
        return url + "/topics";
    }
    public void sendReqWithValidToken() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json").get(setTopicEndpoint());
    }
    public void successViewAdminProfile() {
        restAssuredThat(response -> response.statusCode(200));
    }
    public void sendReqWithWrongMethod() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json").put(setTopicEndpoint());
    }
    public void failViewAdminProfile() {
        restAssuredThat(response -> response.statusCode(405));
        restAssuredThat(response -> response.body("message", equalTo("Method Not Allowed")));
    }
    public String setTopicInvEndpoint() {
        return url + "/pics";
    }
    public void sendReqInvEnd() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json").get(setTopicInvEndpoint());
    }
    public void failViewTopic404() {
        restAssuredThat(response -> response.statusCode(404));
    }
}
