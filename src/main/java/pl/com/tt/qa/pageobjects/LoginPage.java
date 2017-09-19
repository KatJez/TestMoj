package pl.com.tt.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pl.com.tt.qa.framework.config.BasePage;
import pl.com.tt.qa.framework.config.Browser;
import pl.com.tt.qa.framework.config.Config;

public class LoginPage extends BasePage<LoginPage> {


    //jestem na stronie szukam pola login
    @FindBy(name= "userName")
    private WebElement loginField;

    private static final LoginPage instance = new LoginPage();

    public static LoginPage getInstance() {
        return instance;
    }

    public LoginPage() {
        Browser.openPage(this);
    }

    @Override
    protected void load() {
        Browser.open(Config.getInstance().getUrl());
    }

    @Override
    protected void isLoaded()  {
        Assert.assertEquals("Welcome: Mercury Tours", Browser.getDriver().getTitle());
        //tutaj sprawdzam tytuł strony czy się zgadza z tym co podałam w http, asercja
    }

    public void fillForm(){
        loginField.sendKeys("Kasia");
    }
    //wprowadzam w pole login Kasia

    //szukam na stronie pola password i chcę wpisać hasło kasia123
    @FindBy(name = "password")
    private WebElement passwordField;
    public void fillForm2() { passwordField.sendKeys("kasia123"); }

    //klikam przycisk potwierdzający logowanie
    @FindBy(name = "login")
    private WebElement signIn;
    private void confirm() {signIn.click();}


}
