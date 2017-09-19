package pl.com.tt.qa.framework.config;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class Browser extends TestWatcher {

    public static WebDriver getDriver(){
        return Config.getInstance().getDriver();
    }

    public static <T> void openPage(T object){
        PageFactory.initElements(new AjaxElementLocatorFactory(getDriver(),5), object);
    }

    public static void open(String url){
        getDriver().get(url);
    }

    public static void close(){
        getDriver().quit();
    }

    @Override
    protected void failed(Throwable e, Description description) {
        super.failed(e, description);
    }

    @Override
    protected void starting(Description description) {
        super.starting(description);
    }
}
