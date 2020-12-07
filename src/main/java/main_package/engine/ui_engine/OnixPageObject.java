package main_package.engine.ui_engine;

import main_package.data.Settings;
import main_package.engine.BaseClass;
import main_package.engine.BaseInterface;
import main_package.engine.test_engine.OnixUiAssert;
import main_package.ui.specific.JsaCookies;

public abstract class OnixPageObject extends BaseClass implements BaseInterface {
    protected OnixWebDriver driver;
    public OnixPageObject(OnixWebDriver driver) {
        this.driver = new JsaCookies(driver).acceptIfCookiesPresent();

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
