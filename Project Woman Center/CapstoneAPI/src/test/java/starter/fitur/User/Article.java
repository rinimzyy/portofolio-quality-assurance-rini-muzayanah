package starter.fitur.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Article {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImY5M2YxMGM0LTAzYTEtMTFlZS1iNDRkLTAyNDJjMGE4NDAwMyIsImVtYWlsIjoid2F2YXhpeTY0OUBwZW9naS5jb20iLCJ1c2VybmFtZSI6IndhdmF4aXkxMjMiLCJhdXRoX2J5IjoiYXV0aCIsImV4cCI6MTY4NzI3NTM2NX0.yQUyxnWxwEB0IE9lPhOTomtztvAp-gpWTQc9pOYBgtM";

    @Step("I set Get articles non login endpoint")
    public String setGetArticleEndpoint() {
        return url + "/users/public/articles";
    }

    @Step("I send GET articles Request")
    public void sendGetArticleReq() {
        SerenityRest.given().relaxedHTTPSValidation()
                .when()
                .get(setGetArticleEndpoint());
    }

    @Step("I success get articles and response code 200")
    public void successGetArticle() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I set invalid Get articles non login endpoint")
    public String setInvalidGetArticleEndpoint() {
        return url + "/use/public/articles";
    }

    @Step("I send GET articles Request with invalid endpoint")
    public void sendGetArtcleRequest() {
        SerenityRest.given().relaxedHTTPSValidation()
                .when()
                .get(setInvalidGetArticleEndpoint());
    }

    @Step("I failed get articles and response code 404")
    public void failedGetArticle() {
        restAssuredThat(response -> response.statusCode(404));
        restAssuredThat(response -> response.body("'message'", equalTo("Not Found")));
    }

    @Step("I set create comment endpoint")
    public String setCreateComment() {
        return url + "/users/articles";
    }

    @Step("I send POST comment Request")
    public void sendPostComment() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("comment", "artikel ini sangat bagus");

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody).auth().oauth2(token)
                .baseUri(setCreateComment())
                .pathParam("id", "7c5c2f6e-0e8f-11ee-87be-0242c0a8d003")
                .when()
                .post("/{id}/comments");
    }

    @Step("I success create comment and response code 200")
    public void successCreateComment() {
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I send POST comment Request with invalid id")
    public void sendPostCommentInvId(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("comment", "artikel ini sangat bagus");

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody).auth().oauth2(token)
                .baseUri(setCreateComment())
                .pathParam("id", "24dd5102")
                .when()
                .post("/{id}/comments");
    }
    @Step("I failed create comment and message article not found")
    public void messageARtcleNotFound(){
        restAssuredThat(response -> response.body("meta.message", equalTo("article not found")));
        restAssuredThat(response -> response.body("meta.status", equalTo(404)));
    }
    @Step("I send POST comment Request without body value")
    public void sendWithoutBodyValue(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("comment", "");

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody).auth().oauth2(token)
                .baseUri(setCreateComment())
                .pathParam("id", "7c5c2f6e-0e8f-11ee-87be-0242c0a8d003")
                .when()
                .post("/{id}/comments");
    }
    @Step("I failed create comment and message all field are required")
    public void messageAllFieldsAreRequired(){
            restAssuredThat(response -> response.body("meta.message", equalTo("all fields are required")));
            restAssuredThat(response -> response.body("meta.status", equalTo(400)));
    }
    @Step("I send POST comment Request without token")
    public void sendReqWithoutToken(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("comment", "artikel ini sangat bagus");

        SerenityRest.given().relaxedHTTPSValidation().contentType("application/json").body(requestBody)
                .baseUri(setCreateComment())
                .pathParam("id", "7c5c2f6e-0e8f-11ee-87be-0242c0a8d003")
                .when()
                .post("/{id}/comments");
    }
    @Step("I failed create comment and message invalid token")
    public void messageInvalidToken(){
        restAssuredThat(response -> response.body("meta.message", equalTo("invalid token")));
        restAssuredThat(response -> response.body("meta.status", equalTo(401)));
    }
    @Step("I set Get all comment endpoint")
    public String setAllCommentEnd(){ return url+"/users/articles";}
    @Step("I send GET all comment Request")
    public void getAllCommentReq(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(token)
                .baseUri(setAllCommentEnd())
                .pathParam("id", "7c5c2f6e-0e8f-11ee-87be-0242c0a8d003")
                .when()
                .get("/{id}/comments");
    }
    @Step("I success get all comment and response code 200")
    public void successGetAllComment(){
        restAssuredThat(response -> response.body("meta.message", equalTo("success get all article comment")));
        restAssuredThat(response -> response.body("meta.status", equalTo(200)));
    }
    @Step("I send GET all comment Request with invalid article id")
    public void sendGetReqInvArticleId(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(token)
                .baseUri(setAllCommentEnd())
                .pathParam("id", "24dd5102")
                .when()
                .get("/{id}/comments");
    }
    @Step("I failed get all comment and response code 404")
    public void failedCode404(){
        restAssuredThat(response -> response.body("meta.message", equalTo("article not found")));
        restAssuredThat(response -> response.body("meta.status", equalTo(404)));
    }
    @Step("I send GET all comment Request without token")
    public void senReqWithoutToken(){
        SerenityRest.given().relaxedHTTPSValidation()
                .baseUri(setAllCommentEnd())
                .pathParam("id", "7c5c2f6e-0e8f-11ee-87be-0242c0a8d003")
                .when()
                .get("/{id}/comments");
    }
    @Step("I failed get all comment and response code 401")
    public void failedCode401(){
        restAssuredThat(response -> response.body("meta.message", equalTo("invalid token")));
        restAssuredThat(response -> response.body("meta.status", equalTo(401)));
    }
    @Step("I set delete comment endpoint")
    public String setDeleteComEnd(){return url+"/users/articles";}
    @Step("I send DELETE comment Request")
    public void sendDelReq(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(token)
                .baseUri(setDeleteComEnd())
                .pathParam("article_id", "7c5c2f6e-0e8f-11ee-87be-0242c0a8d003")
                .pathParam("comment_id", "4a67ce5f-0f1e-11ee-84cd-0242c0a8e003")
                .when()
                .delete("/{article_id}/comments/{comment_id}");
    }
    @Step("I success delete comment and response code 200")
    public void successDelCom() {
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I send DELETE comment Request with invalid article id")
    public void senDelReqInvArticleId(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(token)
                .baseUri(setDeleteComEnd())
                .pathParam("article_id", "7c5c2f6e")
                .pathParam("comment_id", "4a67ce5f-0f1e-11ee-84cd-0242c0a8e003")
                .when()
                .delete("/{article_id}/comments/{comment_id}");
    }
    @Step("I fail delete comment and response code 404")
    public void failDel404(){
        restAssuredThat(response -> response.statusCode(404));
    }
    @Step("I send DELETE comment Request with invalid comment id")
    public void sendDelReqInvComId(){
        SerenityRest.given().relaxedHTTPSValidation().auth().oauth2(token)
                .baseUri(setDeleteComEnd())
                .pathParam("article_id", "7c5c2f6e-0e8f-11ee-87be-0242c0a8d003")
                .pathParam("comment_id", "4a67ce5f")
                .when()
                .delete("/{article_id}/comments/{comment_id}");
    }
    @Step("I send DELETE comment Request without token")
    public void sendDelComWithoutToken(){
        SerenityRest.given().relaxedHTTPSValidation()
                .baseUri(setDeleteComEnd())
                .pathParam("article_id", "7c5c2f6e-0e8f-11ee-87be-0242c0a8d003")
                .pathParam("comment_id", "4a67ce5f-0f1e-11ee-84cd-0242c0a8e003")
                .when()
                .delete("/{article_id}/comments/{comment_id}");
    }
    @Step("I fail delete comment and response code 401")
    public void failDel401(){
        restAssuredThat(response -> response.body("meta.message", equalTo("invalid token")));
        restAssuredThat(response -> response.body("meta.status", equalTo(401)));
    }

    private String articleUUID;

    // read article
    public String setUserGetArticleEndpoint(String uuid) {
        articleUUID = uuid;
        return url + "/users/articles/" + uuid;
    }

    public void sendUserGetArticleRequest() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .auth().oauth2(Login.userToken)
                .get(setUserGetArticleEndpoint(articleUUID));
    }

    public void verifyUserArticleResponseCode(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }
}
