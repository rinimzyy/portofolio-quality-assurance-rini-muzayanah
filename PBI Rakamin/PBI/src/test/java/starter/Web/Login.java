package starter.Web;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Login extends PageObject {
    private By login() {
        return By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/form/button");
    }
    private By emailField(){
        return By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/form/div[1]/div/input");
    }
    private By passwordField(){
        return By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/form/div[2]/div/input");
    }
    private By dashboard() {
        return By.xpath("//*[@id=\"wrapper\"]/nav/div/li");
    }
    private By emailAllert() {
        return By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/form/div[1]/div/span");
    }
    private By passwordAllert() {
        return By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/form/div[2]/div/span");
    }
    private By invalidCredentialAllert() {
        return By.xpath("//*[@id=\"root\"]/div/div[1]");
    }
    @Step
    public static OpenUrl url(String targeturl){
        return new OpenUrl();
    }
    @Step
    public void logBtnAppear(){
        $(login()).isDisplayed();
    }
    @Step
    public void ClickLoginButton(){
        $(login()).click();
    }
    @Step
    public void onDashboard(){
        $(dashboard()).isDisplayed();
    }
    @Step
    public void failedLoginInvalidData(){
        $(invalidCredentialAllert()).isDisplayed();
    }
    public void failedLoginEmailEmpty(){
        $(emailAllert()).isDisplayed();
    }
    public void failedLoginPasswordEmpty(){
        $(passwordAllert()).isDisplayed();
    }
    public void enterEmail(String email) {
        $(emailField()).type(email);
    }
    @Step
    public void enterPassword(String password) {
        $(passwordField()).type(password);
    }
    public void clearCredentials() {
        $(emailField()).type("").sendKeys(Keys.BACK_SPACE);
        $(passwordField()).type("").sendKeys(Keys.BACK_SPACE);
    }
}
