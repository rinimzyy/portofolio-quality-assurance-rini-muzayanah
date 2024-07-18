package starter.stepdefinition.Admin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fitur.Admin.Article;

public class ArticleSteps {
    @Steps
    Article article;

    // delete article
    @Given("I set admin delete article endpoint with {string}")
    public void iSetAdminDeleteArticleEndpointWith(String uuid) {
        article.setDeleteAdminArticleEndpoint(uuid);
    }

    @When("I send DELETE admin article request")
    public void iSendDELETEAdminArticleRequest() {
        article.sendDeleteAdminArticleRequest();
    }

    @Then("I receive admin article status code response {string}")
    public void iReceiveAdminArticleStatusCodeResponse(String code) {
        int statusCode = Integer.parseInt(code);
        article.verifyDeleteAdminArticleResponseCode(statusCode);
    }

    // index article
    @Given("I set admin get all articles endpoint")
    public void iSetAdminGetAllArticlesEndpoint() {
        article.setIndexAdminArticlesEndpoint();
    }

    @When("I send GET admin get all articles request")
    public void iSendGETAdminGetAllArticlesRequest() {
        article.sendIndexAdminArticlesRequest();
    }

    // index article param
    @Given("I set admin get all articles endpoint with query {string}")
    public void iSetAdminGetAllArticlesEndpointWithQuery(String param) {
        article.setIndexParamAdminArticlesEndpoint(param);
    }

    @When("I send GET admin get all articles with query param request")
    public void iSendGETAdminGetAllArticlesWithQueryParamRequest() {
        article.sendIndexParamAdminArticlesRequest();
    }

    // create
    @Given("I set admin create article endpoint")
    public void iSetAdminCreateArticleEndpoint() {
        article.setAdminCreateArticleEndpoint();
    }

    @When("I send POST admin create article request")
    public void iSendPOSTAdminCreateArticleRequest(io.cucumber.datatable.DataTable dataTable) {
        article.sendAdminCreateArticleRequest(dataTable);
    }
}
