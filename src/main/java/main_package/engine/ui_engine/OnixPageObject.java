package main_package.engine.ui_engine;

import main_package.data.Settings;
import main_package.engine.BaseClass;

public abstract class OnixPageObject extends BaseClass {
    OnixWebDriver driver;
    public OnixPageObject(OnixWebDriver driver) {
        this.driver = driver;
    }
    public OnixPageObject openFromScratch() {
        driver.get(Settings.BASE_URL);
        return this;
    }
    public abstract OnixPageObject openFromUrl(String url);
}
