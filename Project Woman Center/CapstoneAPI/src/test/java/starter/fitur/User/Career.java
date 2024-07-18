package starter.fitur.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Career {
    protected static String url = "https://13.210.163.192:8080";
    protected static String AuthToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImY5M2YxMGM0LTAzYTEtMTFlZS1iNDRkLTAyNDJjMGE4NDAwMyIsImVtYWlsIjoid2F2YXhpeTY0OUBwZW9naS5jb20iLCJ1c2VybmFtZSI6IndhdmF4aXkxMjMiLCJhdXRoX2J5IjoiYXV0aCIsImV4cCI6MTY4NjgxMjk4NH0.iOGtWezAOQFcyZ289A3WJXbJYAH97gSuMPCJNEOo0uY";
    @Step("I set get all career information endpoint")
    public String setGetAllCareerEndpoint(){return url + "/users/careers";}
    @Step("I send GET Request")
    public void sendGetRequest(){
        SerenityRest.given().relaxedHTTPSValidation()
                .when()
                .get(setGetAllCareerEndpoint());
    }
    @Step("I receives HTTP response code 200")
    public void receivesResCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I send POST Requests")
    public void sendPostReq(){
        SerenityRest.given().relaxedHTTPSValidation()
                .when()
                .post(setGetAllCareerEndpoint());
    }
    @Step("I receives HTTP response code 401")
    public void receivesResCode401(){restAssuredThat(response -> response.statusCode(401));}
    @Step("I set get career information by id endpoint")
    public String setGetCareerById(){return url + "/users/careers";}
    @Step("I send Request method GET")
    public void sendReqMethodGet(){
        SerenityRest.given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .baseUri(setGetCareerById())
                .pathParam("id", "76e9107d-0534-11ee-8266-0242c0a8b003")
                .when()
                .get("/{id}");
    }
    @Step("I receives HTTP response code is 200")
    public void codeIs200(){restAssuredThat(response -> response.statusCode(200));}
    @Step("I set invalid get career information by id endpoint")
    public String setInvalidGetCareerEndpoint(){return url + "/users/career";}
    @Step("I send Request method GET with invalid endpoint")
    public void sendReqWithInvalidEndpoint(){
        SerenityRest.given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .baseUri(setInvalidGetCareerEndpoint())
                .pathParam("id", "76e9107d-0534-11ee-8266-0242c0a8b003")
                .when()
                .get("/{id}");
    }
    @Step("I receives HTTP response code is 404")
    public void codeIs404(){restAssuredThat(response -> response.statusCode(404));}
    @Step("I send Request method GET with invalid user token")
    public void sendReqWithInvToken(){
        SerenityRest.given().relaxedHTTPSValidation()
                .baseUri(setGetCareerById())
                .pathParam("id", "76e9107d-0534-11ee-8266-0242c0a8b003")
                .when()
                .get("/{id}");
    }
    @Step("I send Request method GET with invalid id")
    public void sendReqInvId(){
        SerenityRest.given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .baseUri(setGetCareerById())
                .pathParam("id", "76e9107d-0534-11ee-8266")
                .when()
                .get("/{id}");
    }
    @Step("I receives HTTP response code is 400")
    public void receiveResCode400(){restAssuredThat(response -> response.statusCode(400));}
    @Step("I send Request with method POST")
    public void sendReqPost(){
        SerenityRest.given().auth().oauth2(AuthToken).relaxedHTTPSValidation()
                .baseUri(setGetCareerById())
                .pathParam("id", "76e9107d-0534-11ee-8266-0242c0a8b003")
                .when()
                .post("/{id}");
    }
}
