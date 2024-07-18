package starter.Web;

import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.ui.Button;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Stock extends PageObject{
    private By barang(){
        return By.xpath("//*[@id=\"wrapper\"]/nav/div/div/ul/li[2]/a");
    }
    private By stock(){
        return By.xpath("//*[@id=\"wrapper\"]/nav/div/div/ul/li[2]/ul/li[2]/a");
    }
    private By setStock(){
        return By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div/div[1]/div[2]/div/button[2]/span[1]");
    }
    private By productOnList(){
        return By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div/div[3]/div/div/div[2]/div/div/div[2]/div[1]/div/div[6]/div/div/span/div/label");
    }
    private By chooseProduct(){
        return By.xpath("//*[@id=\"page-top\"]/div[6]/div/div/div[2]/div[2]/div[1]");
    }
    private By quan(){
        return By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div");
    }
    private By quantity(){
        return By.cssSelector("#page-wrapper > div.wrapper.wrapper-content > div > div > div > div:nth-child(2) > div > div > div > div > div:nth-child(4) > div > div.row.m-t-md > div > div > div:nth-child(2) > div > div.react-grid-Container > div > div > div:nth-child(2) > div > div > div:nth-child(2) > div:nth-child(1) > div > div:nth-child(2) > div");
    }
    private By quantityNumber(){
        return By.cssSelector("#page-top > div:nth-child(14) > div > input");
    }
    private By simpan(){
        return By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[3]/div/button/span[1]");
    }
    private By stockPage(){
        return By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/div");
    }
    private By productDelete(){
        return By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div[11]/div/div/span/div/label");
    }
    private By delete(){
        return By.xpath("//*[@id=\"x-delete-button\"]");
    }
    private By popUp(){
        return By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div/div/div[2]/div/div/div/div");
    }
    private SearchableTarget pilih() {
        return Button.withText("Harap pilih");
    }

    @Step
    public void menuBarang(){
        $(barang()).click();
    }
    @Step
    public void goToStock(){
        $(stock()).click();
    }
    @Step
    public void clickSetButton(){
        $(setStock()).click();
    }
    @Step
    public void viewProductList(){
        $(productOnList()).waitUntilClickable();
        $(productOnList()).doubleClick();
    }
    @Step
    public void choosingProduct(){
        $(chooseProduct()).click();
    }
    @Step
    public void clickQuantity(){
        $(quantity()).click();
        $(quantity()).doubleClick();
    }
    @Step
    public void enterQuantity(String quantity){
        $(quantityNumber()).typeAndEnter(quantity);
    }
    @Step
    public void clickSimpan(){
        $(simpan()).click();
    }
    @Step
    public void productToDelete(){
        $(productDelete()).click();
    }
    @Step
    public void clickDelete(){
        $(delete()).click();
    }
    @Step
    public void redirectToStockPage(){
        $(stockPage()).isDisplayed();
    }
}
