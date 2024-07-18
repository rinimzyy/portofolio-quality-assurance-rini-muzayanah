package starter.fitur.Admin;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateArticle {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc1OTk4NTN9.auCTT-lhLfcPCVWyjr9ljFTiY-9OXoCKEre4XdWVri4";

    public String setPutUpdateArticleWithValidEndpoint(){
        return url + "/admin/articles/7c5c2f6e-0e8f-11ee-87be-0242c0a8d003";
    }
    public String setPutUpdateArticleWithInvalidEndpoint(){
        return url + "/admn/articles/5819b9a2-0cd8-11ee-8713-0242ac1d0003";
    }
    public String setPutUpdateArticleWithInvalidId(){
        return url + "/admin/articles/08bc0b11-068c-11ee-a18f-0242c0a8d00";
    }

    public void sendPutUpdateArticleWithValidEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Artikel Update");
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .contentType("application/json")
                .accept(ContentType.JSON)
                .body(requestBody)
                .put(setPutUpdateArticleWithValidEndpoint());
    }
    public void receivedPutUpdateArticleResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    public void sendPutUpdateArticleWithInvalidEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Artikel Update");
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .contentType("application/json")
                .accept(ContentType.JSON)
                .body(requestBody)
                .put(setPutUpdateArticleWithInvalidEndpoint());
    }
    public void receivedPutUpdateArticleResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    public void sendPutUpdateArticleWithInvalidId(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Artikel Update");
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .contentType("application/json")
                .accept(ContentType.JSON)
                .body(requestBody)
                .put(setPutUpdateArticleWithInvalidId());
    }
    public void receivedPutUpdateArticleResponseCode400(){
        restAssuredThat(response -> response.statusCode(400));
    }

    public void sendPutUpdateArticleWithoutToken(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Artikel Update");
        SerenityRest
                .given().relaxedHTTPSValidation()
                .contentType("application/json")
                .accept(ContentType.JSON)
                .body(requestBody)
                .put(setPutUpdateArticleWithValidEndpoint());
    }
    public void receivedPutUpdateArticleResponseCode401(){
        restAssuredThat(response -> response.statusCode(401));
    }
}
