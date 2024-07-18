package starter.fitur.Admin;

import io.cucumber.datatable.DataTable;
import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Article {
    protected static String url = "https://13.210.163.192:8080";
    private String articleUUID;
    private String indexQueryParam;
    private Map<String, Object> data = new HashMap<>();

    // index article
    public String setIndexAdminArticlesEndpoint() {
        return url + "/admin/articles";
    }

    public void sendIndexAdminArticlesRequest() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .auth().oauth2(Login.adminToken)
                .get(setIndexAdminArticlesEndpoint());
    }

    // index param
    public String setIndexParamAdminArticlesEndpoint(String param) {
        indexQueryParam = param;
        return url + "/admin/articles?" + param;
    }

    public void sendIndexParamAdminArticlesRequest() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .auth().oauth2(Login.adminToken)
                .get(setIndexParamAdminArticlesEndpoint(indexQueryParam));
    }

    // create
    public String setAdminCreateArticleEndpoint() {
        return url + "/admin/articles";
    }

    public void sendAdminCreateArticleRequest(DataTable dataTable) {
        for (Map<String, String> row : dataTable.asMaps(String.class, String.class)) {
            String field = row.get("job_position");
            String value = row.get("value");
            if (field.equals("image") && value != null) {
                File imageFile = new File(value);
                data.put(field, imageFile);
            } else {
                data.put(field, value);
            }
        }

         RestAssured.given().relaxedHTTPSValidation()
                .contentType("multipart/form-data")
                .multiPart("image", data.get("image"))
                .formParams(data)
                .post(setAdminCreateArticleEndpoint());
    }

    // delete article
    public String setDeleteAdminArticleEndpoint(String uuid) {
        articleUUID = uuid;
        return url + "/admin/articles/" + uuid;
    }

    public void sendDeleteAdminArticleRequest() {
        SerenityRest.given().relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .auth().oauth2(Login.adminToken)
                .delete(setDeleteAdminArticleEndpoint(articleUUID));
    }

    public void verifyDeleteAdminArticleResponseCode(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }
}
