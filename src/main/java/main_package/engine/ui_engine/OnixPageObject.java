package main_package.engine.ui_engine;

import main_package.data.LogLevel;
import main_package.data.Settings;
import main_package.engine.BaseClass;
import main_package.engine.log_engine.OnixLog;
import main_package.engine.test_engine.OnixUiAssert;

public abstract class OnixPageObject extends BaseClass {
    protected OnixWebDriver driver;
    public OnixPageObject(OnixWebDriver driver) {
        this.driver = driver;
    }
    public OnixPageObject openFromScratch() {
        driver.get(Settings.BASE_URL);
        return this;
    }
    public abstract OnixPageObject openFromUrl();

    public OnixWebDriver getDriver() {
        return driver;
    }
    public abstract OnixPageObject check(OnixUiAssert onixUiAssert);

}
