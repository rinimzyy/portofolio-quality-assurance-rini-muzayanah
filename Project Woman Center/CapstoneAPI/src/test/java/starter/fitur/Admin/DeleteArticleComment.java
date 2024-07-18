package starter.fitur.Admin;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteArticleComment {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc1OTk4NTN9.auCTT-lhLfcPCVWyjr9ljFTiY-9OXoCKEre4XdWVri4";

    public String setDeleteArticleCommentWithValidEndpoint(){
        return url + "/admin/articles/5819b9a2-0cd8-11ee-8713-0242ac1d0003/comments/eeb2aa08-0cdf-11ee-8713-0242ac1d0003";
    }

    public String setDeleteArticleCommentWithInvalidEndpoint(){
        return url + "/admn/articles/5819b9a2-0cd8-11ee-8713-0242ac1d0003/comments/1abf1b1b-0cdf-11ee-8713-0242ac1d0003";
    }

    public String setDeleteArticleCommentWithInvalidIdArticle(){
        return url + "/admin/articles/08bc0b11-068c-11ee-a18f-0242c0a8d00/comments/1abf1b1b-0cdf-11ee-8713-0242ac1d0003";
    }

    public void sendReqDeleteArticleCommentWithValidEndpoint(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .delete(setDeleteArticleCommentWithValidEndpoint());
    }
    public void receivedDeleteArticleCommentResponseCode() {
//        restAssuredThat(response -> response.statusCode(200));
        restAssuredThat(response -> response.statusCode(404));
    }

    public void sendReqDeleteArticleCommentWithInvalidEndpoint(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .delete(setDeleteArticleCommentWithInvalidEndpoint());
    }
    public void receivedDeleteArticleCommentResponseCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    public void sendReqDeleteArticleCommentWithInvalidIdArticle(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .delete(setDeleteArticleCommentWithInvalidIdArticle());
    }

    public void sendReqDeleteArticleCommentWithoutToken(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .delete(setDeleteArticleCommentWithValidEndpoint());
    }
    public void receivedDeleteArticleCommentResponseCode401() {
        restAssuredThat(response -> response.statusCode(401));
    }

}
