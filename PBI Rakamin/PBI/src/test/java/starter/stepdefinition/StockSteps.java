package starter.stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Web.Login;
import starter.Web.Stock;
import java.util.List;
import java.util.Map;

public class StockSteps {

    @Steps
    Login login;

    @Steps
    Stock stock;

    @Given("I am successfully login i go to stock page")
    public void goToStockPage(DataTable credentialsTable){
        login.openUrl("https://app.jubelio.com/login");
        List<Map<String, String>> credentials = credentialsTable.asMaps(String.class, String.class);
        for (Map<String, String> row : credentials) {
            String email = row.get("Email");
            String password = row.get("Password");

            login.enterEmail(email);
            login.enterPassword(password);
            login.ClickLoginButton();
        }
        stock.menuBarang();
        stock.goToStock();
    }
    @When("I click Penyesuaian Persediaan button")
    public void clickSetStock() {
        stock.clickSetButton();
    }
    @And("I choose product and fill product quantity")
    public void setProductStock(){
        stock.viewProductList();
        stock.choosingProduct();
        stock.clickQuantity();
        stock.enterQuantity("3");
    }
    @And("I click Simpan button")
    public void clickSimpanButton(){
        stock.clickSimpan();
    }
    @Then("I successfully setting product stock")
    public void successSetStock(){
        stock.redirectToStockPage();
    }

}
