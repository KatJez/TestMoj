package pl.com.tt.qa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pl.com.tt.qa.pageobjects.LoginPage;

public class LoginTest {

    @Test
    public void login(){
        LoginPage.getInstance().get().fillForm();
    }
    public void login2 (){ LoginPage.getInstance().get().fillForm2();}
    //tutaj jest coś nie tak, login2 się nie uruchamia w teście!

    public void sign() {LoginPage.getInstance().get().confirm;}
    //tutaj też coś źle, bo mi podświetla confirm -> chciałąm tutaj kliknąć w przycisk po loginie i haśle
}
