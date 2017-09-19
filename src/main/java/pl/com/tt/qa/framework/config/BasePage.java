package pl.com.tt.qa.framework.config;

import org.openqa.selenium.support.ui.LoadableComponent;

/**
 * Created by cysewskaa on 15.09.2017.
 */
public class BasePage<T extends LoadableComponent<T>> extends LoadableComponent<T> {


    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {

    }
}
