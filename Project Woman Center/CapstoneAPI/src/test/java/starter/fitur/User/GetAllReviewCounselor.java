package starter.fitur.User;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllReviewCounselor {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImY5M2YxMGM0LTAzYTEtMTFlZS1iNDRkLTAyNDJjMGE4NDAwMyIsImVtYWlsIjoid2F2YXhpeTY0OUBwZW9naS5jb20iLCJ1c2VybmFtZSI6IndhdmF4aXkxMjMiLCJhdXRoX2J5IjoiYXV0aCIsImV4cCI6MTY4NzMyNTczOX0.7pkO5lqGW80E3BXNuPWB5lWmIgN6uc0xOJBqJnZWMgk";

    public String setGetAllReviewCounselorWithValidEndpoint(){
        return url + "/users/counselors/43eda157-09df-11ee-b8a9-0242ac140003/reviews";
    }
    public String setGetAllReviewCounselorWithInvalidEndpoint(){
        return url + "/user/counselors/43eda157-09df-11ee-b8a9-0242ac140003/reviews";
    }
    public String setGetAllReviewCounselorWithInvalidId(){
        return url + "/users/counselors/08bc0b11-068c-11ee-a18f-0242c0a8d00/reviews";
    }

    public void sendGetAllReviewCounselorWithValidEndpoint(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .get(setGetAllReviewCounselorWithValidEndpoint());
    }
    public void receivedGetAllReviewCounselorResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    public void sendGetAllReviewCounselorWithInvalidEndpoint(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .get(setGetAllReviewCounselorWithInvalidEndpoint());
    }
    public void receivedGetAllReviewCounselorResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    public void sendGetAllReviewCounselorWithInvalidId(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .get(setGetAllReviewCounselorWithInvalidId());
    }
    public void receivedGetAllReviewCounselorResponseCode400(){
        restAssuredThat(response -> response.statusCode(400));
    }

    public void sendGetAllReviewCounselorWithoutToken(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .get(setGetAllReviewCounselorWithValidEndpoint());
    }
    public void receivedGetAllReviewCounselorResponseCode401(){
        restAssuredThat(response -> response.statusCode(401));
    }
}
