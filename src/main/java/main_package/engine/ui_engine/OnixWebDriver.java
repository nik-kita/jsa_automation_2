package main_package.engine.ui_engine;

import main_package.engine.BaseClass;
import main_package.engine.Fly;
import main_package.engine.log_engine.OnixLog;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;

public class OnixWebDriver extends BaseClass {
    WebDriver seleniumWebDriver;
    public OnixWebDriver(WebDriver seleniumWebDriver) {
        this.seleniumWebDriver = seleniumWebDriver;
    }
    @Override
    public OnixWebDriver make(Fly fly) {
        fly.make();
        return this;
    }
}
