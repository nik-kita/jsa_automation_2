package main_package.engine.ui_engine;

import main_package.engine.BaseClass;

public abstract class BaseSpecificPageObject extends BaseClass {
    protected OnixWebDriver driver;
    public BaseSpecificPageObject(OnixWebDriver driver) {
        this.driver = driver;
    }
}
