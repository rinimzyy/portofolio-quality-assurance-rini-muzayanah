package starter.fitur.User;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Forum {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjM4YzNhYjg4LTEwYzYtMTFlZS05ZWQzLTAyNDJjMGE4MTAwMyIsImVtYWlsIjoiYXpoYXJpZmF1emFAZ21haWwuY29tIiwidXNlcm5hbWUiOiJwZW9wbGUxIiwiYXV0aF9ieSI6ImF1dGgiLCJleHAiOjE2ODc2NzQ2MjB9.9sGiJf5xJPZeRhBRMRSetBfuBWWwkIyYuZgvS2zXPYA";
    protected static String invToken = "abcdef";

    @Step("I set create forum endpoint")
    public String setCreateForumEnd(){return url+"/users/forums";}
    @Step("I send POST create forum Request")
    public void sendPostCreateForumReq(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(token)
                .contentType(ContentType.URLENC)
                .formParam("category_id", "2")
                .formParam("link", "https://youtu.be/AbXyAoTS7Ps")
                .formParam("topic", "membahas tentang spiritual")
                .when()
                .post(setCreateForumEnd());
    }
    @Step("I success create forum and response code 200")
    public void successCreateForum(){
        restAssuredThat(response -> response.body("meta.message", equalTo("successfully created forum data")));
        restAssuredThat(response -> response.body("meta.status", equalTo(200)));
    }
    @Step("I send POST create forum Request with empty category id")
    public void sendReqEmptyCategoryId(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(token)
                .contentType(ContentType.URLENC)
                .formParam("category_id", "")
                .formParam("link", "https://youtu.be/AbXyAoTS7Ps")
                .formParam("topic", "membahas tentang spiritual")
                .when()
                .post(setCreateForumEnd());
    }
    @Step("I fail create forum and message category is required")
    public void messageCategoryisRequired(){
        restAssuredThat(response -> response.body("meta.message", equalTo("category is required")));
        restAssuredThat(response -> response.body("meta.status", equalTo(400)));
    }
    @Step("I send POST create forum Request with empty link")
    public void sendReqEmptyLink(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(token)
                .contentType(ContentType.URLENC)
                .formParam("category_id", "2")
                .formParam("link", "")
                .formParam("topic", "membahas tentang spiritual")
                .when()
                .post(setCreateForumEnd());
    }
    @Step("I fail create forum and message link is required")
    public void messageLinkIsRequired(){
        restAssuredThat(response -> response.body("meta.message", equalTo("link is required")));
        restAssuredThat(response -> response.body("meta.status", equalTo(400)));
    }
    @Step("I send POST create forum Request with empty topic")
    public void sendReqEmptyTopic(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(token)
                .contentType(ContentType.URLENC)
                .formParam("category_id", "2")
                .formParam("link", "https://youtu.be/vaasnYZ827c")
                .formParam("topic", "")
                .when()
                .post(setCreateForumEnd());
    }
    @Step("I fail create forum and message topic are required")
    public void messageTopicAreRequired(){
        restAssuredThat(response -> response.body("meta.message", equalTo("topic are required")));
        restAssuredThat(response -> response.body("meta.status", equalTo(400)));
    }
    @Step("I send POST crete forum Request with invalid token")
    public void sendPostReqInvalidToken(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(invToken)
                .contentType(ContentType.URLENC)
                .formParam("category_id", "2")
                .formParam("link", "https://youtu.be/vaasnYZ827c")
                .formParam("topic", "membahas tentang spiritual")
                .when()
                .post(setCreateForumEnd());
    }
    @Step("I fail create forum and message invalid token")
    public void failCreateForum(){
        restAssuredThat(response -> response.body("meta.message", equalTo("invalid token")));
        restAssuredThat(response -> response.body("meta.status", equalTo(401)));
    }
    @Step("I set get all forum endpoint")
    public String setGetAllForumEnd(){return url+"/users/forums";}
    @Step("I send GET all forum Request")
    public void sendGetReq(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(token)
                .when()
                .get(setGetAllForumEnd());
    }
    @Step("I success get all forum and response code 200")
    public void successGetAllForum(){
        restAssuredThat(response -> response.body("meta.message", equalTo("success to get all forum data")));
        restAssuredThat(response -> response.body("meta.status", equalTo(200)));
    }
    @Step("I send GET all forum Request with invalid token")
    public void sendReqInvalidToken(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(invToken)
                .when()
                .get(setGetAllForumEnd());
    }
    @Step("I fail get all forum and message invalid token")
    public void messageInvalidToken(){
        restAssuredThat(response -> response.body("meta.message", equalTo("invalid token")));
        restAssuredThat(response -> response.body("meta.status", equalTo(401)));
    }
}
