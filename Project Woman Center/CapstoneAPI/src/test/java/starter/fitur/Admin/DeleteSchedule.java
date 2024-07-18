package starter.fitur.Admin;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteSchedule {
    protected static String url = "https://13.210.163.192:8080";
    protected static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImFkbWluQGdtYWlsLmNvbSIsInVzZXJuYW1lIjoiYWRtaW4iLCJleHAiOjE2ODc1OTk4NTN9.auCTT-lhLfcPCVWyjr9ljFTiY-9OXoCKEre4XdWVri4";

    public String setDeleteScheduleWithValidEndpoint(){
        return url + "/admin/counselors/98040459-0dd1-11ee-b94e-0242c0a82003/schedules";
    }

    public String setDeleteScheduleWithInvalidEndpoint(){
        return url + "/admn/counselors/08bc0b11-068c-11ee-a18f-0242c0a8d003/schedules";
    }
    public String setDeleteScheduleWithEndpointAndInvalidId(){
        return url + "/admin/counselors/89b50e3f-fb86-11ed-a017-5efc22537c1/schedules";
    }

    public String setDeleteScheduleWithoutToken(){
        return url + "/admin/counselors/08bc0b11-068c-11ee-a18f-0242c0a8d003/schedules";
    }

    public void sendDeleteScheduleValidEndpoint(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .delete(setDeleteScheduleWithValidEndpoint());
    }
    public void receivedDeleteResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    public void sendDeleteScheduleWithInvalidEndpoint(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .delete(setDeleteScheduleWithInvalidEndpoint());
    }

    public void receivedDeleteScheduleResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    public void sendDeleteScheduleWithInvalidEndpointAndInvalidId(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .auth()
                .oauth2(token)
                .delete(setDeleteScheduleWithEndpointAndInvalidId());
    }
    public void receivedDeleteScheduleResponseCode400(){
        restAssuredThat(response -> response.statusCode(400));
    }

    public void sendDeleteScheduleWithoutToken(){
        SerenityRest
                .given().relaxedHTTPSValidation()
                .delete(setDeleteScheduleWithoutToken());
    }
    public void receivedDeleteScheduleResponseCode401(){
        restAssuredThat(response -> response.statusCode(401));
    }
}
